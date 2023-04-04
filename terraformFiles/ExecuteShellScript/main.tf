resource "aws_key_pair" "sagar-keypair" {
  key_name   = "sagar-keypair"
  public_key = file("/root/.ssh/id_rsa.pub")
}

resource "aws_instance" "web" {
  ami           = var.ami
  instance_type = var.instance_type
  tags = var.tags
  key_name = aws_key_pair.sagar-keypair.key_name

  provisioner "local-exec" {
    command = "echo ${self.private_ip} > /tmp/file.txt"
  }

  provisioner "file" {
    source = "test.sh"
    destination = "/tmp/test.sh"
    connection {
      type = "ssh"
      user = "ubuntu"
      private_key = file("/root/.ssh/id_rsa")
      host = self.public_ip
    }
  }

  provisioner "remote-exec" {
    inline = [
      "chmod  x /tmp/test.sh",
      "/tmp/test.sh",
    ]
    connection {
      type = "ssh"
      user = "ubuntu"
      private_key = file("~/.ssh/id_rsa")
      host = self.public_ip
    }
  }

}
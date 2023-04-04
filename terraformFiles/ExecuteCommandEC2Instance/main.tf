resource "aws_key_pair" "kumaran-keypair" {

  key_name = "kumaran-keypair"

  public_key = file("/root/.ssh/id_rsa.pub")

}


resource "aws_instance" "web" {

  ami = var.ami

  instance_type = var.instance_type

  tags = var.tags

  key_name = aws_key_pair.kumaran-keypair.key_name

  provisioner "local-exec" {
    #command = "echo ${aws_instance.web.private_ip} > /tmp/file.txt"
    command = "echo ${self.private_ip} > file.txt"
  }

}
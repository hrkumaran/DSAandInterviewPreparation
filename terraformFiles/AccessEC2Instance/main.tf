resource "aws_key_pair" "kumaran-keypair" {

  key_name = "kumaran-keypair"

  public_key = file("/root/.ssh/id_rsa.pub")

}


resource "aws_instance" "web" {

  ami = var.ami

  instance_type = var.instance_type

  tags = var.tags

  key_name = aws_key_pair.kumaran-keypair.key_name

}
resource "aws_instance" "web" {
  ami           = var.ami
  instance_type = var.insttype
  tags = var.tags
}
resource "aws_instance" "web" {
  ami           = var.ami
  instance_type = "t2.nano"
  tags = var.tags
}
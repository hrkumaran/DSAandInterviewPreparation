resource "aws_instance" "web" {
  count 	= 3
  ami           = var.ami
  instance_type = var.instance_type
  tags = { Name = "${var.tags.Name}-${count.index}" }
}
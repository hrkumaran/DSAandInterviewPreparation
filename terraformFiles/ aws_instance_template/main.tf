data "template_file" "instancesize" {
  template = file("${path.module}/myinstance")
}

resource "aws_instance" "web" {
  ami           = var.ami
  instance_type = trimspace("${data.template_file.instancesize.rendered}")
  tags = var.tags
}
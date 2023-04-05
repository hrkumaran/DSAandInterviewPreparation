data "template_file" "env" {
  template = file("${path.module}/env")
}

resource "aws_instance" "web" {
  count = "${trimspace("${data.template_file.env.rendered}") == "prd" ? 2 : trimspace("${data.template_file.env.rendered}") == "dev" ? 1 : 0 }"
  ami           = var.ami
  instance_type = var.instance_type
  tags = { Name = "${var.tags.Name}-${count.index}" }
}
resource "aws_instance" "web" {
  for_each      = toset(["micro", "nano"])
  ami           = var.ami
  instance_type = "t2.${each.key}"
  tags = { Name = "${var.tags.Name}-${each.key}" }
}
output "PublicIP" {
  value = "${aws_instance.web["micro"].public_ip} AND ${aws_instance.web["nano"].public_ip}"
}
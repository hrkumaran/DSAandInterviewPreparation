output "PublicIP" {
  value = aws_instance.web[*].public_ip
}
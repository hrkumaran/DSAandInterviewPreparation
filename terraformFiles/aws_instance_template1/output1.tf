output "PrivateIP" {
  value = aws_instance.web[*].private_ip
}

output "PublicIP" {
  value = aws_instance.web[*].public_ip
}

output "PublicDNS" {
  value = aws_instance.web[*].public_dns
}
output "IP" {
  value	= aws_instance.kumaran_web.public_ip
}

output "DNS" {
  value = aws_instance.kumaran_web.public_dns
}

output "URL" {
  value = "http://${aws_instance.kumaran_web.public_dns} OR http://${aws_instance.kumaran_web.public_ip}"
}
output "instance_ip_addr" {

  value = aws_instance.web.private_ip

}

output "instance_ip_addrpublic" {

  value = aws_instance.web.public_ip

}
variable "region" {
  description = "Default Datacenter for AWS"
  type = string
  default = "ap-south-1"
}

variable "access_key" {
  description = "Default Access Key for AWS"
  default = "<access>"
}

variable "secret_key" {
  default  = "<scret>>"
}

variable "ami" {
  description = "AWS Instance AMI"
  default = "ami-038face4e75b6a399"
}

variable "instance_type" {
  description = "AWS Instance Size"
  default = "t2.micro"
}

variable "name" {
  description = "Instance name"
  default = "sagar_web"
}
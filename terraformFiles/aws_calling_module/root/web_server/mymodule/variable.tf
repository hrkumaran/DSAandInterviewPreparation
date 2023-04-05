variable "region" {
  description = "Default Datacenter for AWS"
  type = string
  default = "ap-south-1"
}

variable "access_key" {
  description = "Default Access Key for AWS"
  default = "accessKey"
}

variable "secret_key" {
  default  = "secretKey"
}

variable "ami" {
  default = "ami-038face4e75b6a399"
}

variable "insttype" {
  default = "t2.micro"
}

variable "tags" {
  type = map
  default = { Name = "Kumarn-web" }
}
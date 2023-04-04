variable "region" {
  description = "Default Datacenter for AWS"
  type        = string
  default     = "ap-south-1"
}

variable "access_key" {
  description = "Default Access Key for AWS"
  default     = "<<acees>>"
}

variable "secret_key" {
  default = "<<secret>>"
}

variable "ami" {
  default = "ami-038face4e75b6a399"
}

variable "instance_type" {
  default = "t2.micro"
}

variable "tags" {
  type    = map(any)
  default = { Name = "Sagar-web" }
}

variable "mynumber" {
  type    = number
  default = 100
}

variable "mybool" {
  type    = bool
  default = true
}

variable "mylist" {
  default = ["100", "200", "300"]
}
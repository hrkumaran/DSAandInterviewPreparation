terraform {
  required_providers {
    aws = {
      source = "hashicorp/aws"
      version = "4.61.0"
    }
  }
}

variable "region" {
  default = "ap-south-1"
}

variable "access_key" {
  default = "AKIATPWBFSSPPSD7KHNH"
}

variable "secret_key" {
  default  = "QaJkQppXY4Vyon8R4dqbwtkO4Q8qfnalutNSapjc"
}


provider "aws" {
  region     = var.region
  access_key = var.access_key
  secret_key = var.secret_key
}

resource "aws_instance" "sample" {
}
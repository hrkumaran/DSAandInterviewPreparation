terraform {

  required_providers {

    aws = {

      source  = "hashicorp/aws"

      version = "4.61.0"

    }

  }

}



# Configure the AWS Provider

provider "aws" {

  region = "ap-south-1"
  access_key = "<accessKey>"
  secret_key = "<secretkey>"
}

resource "aws_instance" "web" {

  ami= "ami-038face4e75b6a399"
  instance_type = "t2.micro"

  tags = {
    Name = "Kumaran"
  }


}
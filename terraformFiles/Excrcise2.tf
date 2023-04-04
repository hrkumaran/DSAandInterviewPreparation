yum install -y yum-utils

yum-config-manager --add-repo https://rpm.releases.hashicorp.com/RHEL/hashicorp.repo

yum -y install terraform

terraform version
Terraform v1.4.4
on linux_amd64


####################################

[root@minion ~]# mkdir aws_instance    ^C
[root@minion ~]# cd aws_instance
[root@minion aws_instance]# vi main.tf
terraform {
required_providers {
aws = {
source = "hashicorp/aws"
version = "4.61.0"
}
}
}

provider "aws" {
region     = "ap-south-1"
access_key = "AKIATPWSSPPSD7KHNH"
secret_key = "QaJkQppXY4Vyon4dqbwtkO4Q8qfnalutNSapjc"
}

resource "aws_instance" "web" {
ami           = "ami-038face4e75b6a399"
instance_type = "t2.micro"

tags = {
Name = "Sagar-newweb"
}
}


[root@minion aws_instance]# terraform init   ^C
[root@minion aws_instance]# ls -lta
total 20
drwxr-xr-x.  3 root root   91 Apr  3 15:32 .
-rw-r--r--.  1 root root  404 Apr  3 15:32 main.tf
-rw-r--r--.  1 root root 4443 Apr  3 15:27 terraform.tfstate
-rw-r--r--.  1 root root 1406 Apr  3 15:13 .terraform.lock.hcl
drwxr-xr-x.  3 root root   23 Apr  3 15:13 .terraform
dr-xr-x---. 21 root root 4096 Apr  3 15:05 ..
[root@minion aws_instance]# terraform validate     ^C
[root@minion aws_instance]# terraform plan        ^C
[root@minion aws_instance]# terraform apply    ^C
[root@minion aws_instance]# rm -fr terraform.tfstate   ^C
[root@minion aws_instance]# terraform apply   ^C


####################################

[root@minion]#  cd
[root@minion]#  mkdir aws_instance_vars
[root@minion]#  cd aws_instance_vars

[root@minion aws_instance_vars]# cat main.tf
resource "aws_instance" "web" {
ami           = var.ami
instance_type = var.instance_type
tags = var.tags
}
[root@minion aws_instance_vars]# cat provider.tf
terraform {
required_providers {
aws = {
source = "hashicorp/aws"
version = "4.61.0"
}
}
}

provider "aws" {
region     = var.region
access_key = var.access_key
secret_key = var.secret_key
}
[root@minion aws_instance_vars]# cat variable.tf
variable "region" {
description = "Default Datacenter for AWS"
type = string
default = "ap-south-1"
}

variable "access_key" {
description = "Default Access Key for AWS"
default = "AKIATPWBFSSPPSD7KHNH"
}

variable "secret_key" {
default  = "QaJkQppXY4Vyon8R4dqbwtkO4Q8qfnalutNSapjc"
}

variable "ami" {
default = "ami-038face4e75b6a399"
}

variable "instance_type" {
default = "t2.micro"
}

variable "tags" {
type = map
default = { Name = "Sagar-web" }
}

variable "mynumber" {
type = number
default = 100
}

variable "mybool" {
type = bool
default = true
}

variable "mylist" {
default = ["100", "200", "300"]
}
[root@minion aws_instance_vars]# terraform init   ^C
[root@minion aws_instance_vars]# terraform validate    ^C
[root@minion aws_instance_vars]# terraform plan    ^C
[root@minion aws_instance_vars]# terraform apply    ^C


############################
Terraform Training Day 1 : 03/04

1) yum install -y yum-utils

2) yum-config-manager --add-repo https://rpm.releases.hashicorp.com/RHEL/hashicorp.repo

3) yum -y install terraform

4)terraform version
Terraform v1.4.4
on linux_amd64


####################################

[root@minion ~]# mkdir aws_instance    ^C
[root@minion ~]# cd aws_instance
[root@minion aws_instance]# vi main.tf

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

terraform apply --auto-approve

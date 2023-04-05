module "myawsmodule" {
  source = "/root/web_server/mymodule"
  insttype = "t2.nano"
}

output "MyPublicIP" {
  value = module.myawsmodule.PublicIP
}
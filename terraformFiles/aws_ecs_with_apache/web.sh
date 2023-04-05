#!/bin/bash
sudo apt-get update
sudo apt-get install -y apache2
echo "<h1>Welcome to Terraform World!</h1>" | sudo tee /var/www/html/index.html
sudo systemctl start apache2
sudo systemctl enable apache2
sudo docker build -t localhost:5000/grupo25:latest .
sudo docker tag localhost:5000/grupo25:latest localhost:5000/grupo25:latest
sudo docker push localhost:5000/grupo25:latest

sudo microk8s kubectl delete service grupo25 -n thymeleaf
sudo microk8s kubectl delete deployment grupo25 -n thymeleaf
sudo microk8s kubectl apply -f k8s/deployment.yaml

sudo microk8s kubectl delete ingress grupo25 -n thymeleaf
sudo microk8s kubectl apply -f k8s/ingress.yaml
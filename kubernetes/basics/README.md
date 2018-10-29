# Kubernetes Workshop

1. Install locally kubernetes cluster
  * Docker
  * [Minikube](https://kubernetes.io/docs/setup/minikube/) - [Download page](https://github.com/kubernetes/minikube/releases)
2. Install kubectl - [Download page](https://kubernetes.io/docs/tasks/tools/install-kubectl/)
3. Verify installation - `kubectl get nodes`

## Kubectl commands

### Node
* `kubectl get nodes` - get list of nodes in cluster
* `kubectl describe node docker-for-desktop` - prints detail information about single node

### Common
* `kubectl apply -f pod-template.yml` - applies (creates, updates) elements in kubernetes cluster
* `kubectl exec -it pod-name /bin/bash` - run command in pod

### Pod
* `kubectl get pods` - get list of pods
* `kubectl describe pod hello-pod` - detail information about single pod
* `kubectl logs hello-pod` - prints system output of pod
* `kubectl delete pod hello-pod ` - deletes given pod

### Deployment
* `kubectl get deployments` - list of deployments
* `kubectl describe deployment nginx-deployment` - detail of deployment
* `kubectl delete deployment nginx-deployment` - deletes deployment

### Services
* `kubectl get services` - list of services
* `kubectl describe service nginx-service` - detail of service
* `kubectl delete service nginx-service` - deletes service

### Secrets
* `kubectl create secret generic postgres-credentials --from-literal=username=helloapp --from-literal=password=mojetajneheslo` - creates secret in kubernetes cluster

### Web UI
* `kubectl apply -f https://raw.githubusercontent.com/kubernetes/dashboard/master/src/deploy/recommended/kubernetes-dashboard.yaml` - deploys
* `kubectl proxy` - HTTP proxy to access the Kubernetes API
* [WEB UI](http://localhost:8001/api/v1/namespaces/kube-system/services/https:kubernetes-dashboard:/proxy/#!/login)

### Config Map
* `kubectl create configmap busybox-config --from-literal=server.name=homer --from-literal=server.port=80` - creates config map with properties

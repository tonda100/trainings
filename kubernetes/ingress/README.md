# Kubernetes Ingress

I setup Kubernetes Ingress with Traefik. You can read more about it on my [blog](https://tonda100.github.io/Traefik/).

You can try most of it with **DockerForMac** except [Let's Encrypt](https://letsencrypt.org/) part.

Since it is all about routing trafic you need to setup my example domains `hostynskaosma.cz www.hostynskasoam.cz traefik.mydoamin.com` to your `/etc/hosts` or you cen just get inspired by yaml files.

## Install Tomcat

* Install tomcat Deployment
    ```bash
    kubectl apply -f tomcat-deploy.yml
    ```
* Install tomcat Service
    ```bash
    kubectl apply -f tomcat-service.yml
    ```
* Install tomcat Secret
    ```bash
    kubectl apply -f tomcat-secret.yml
    ```
* Install tomcat Ingress
    ```bash
    kubectl apply -f tomcat-ingress.yml
    ```
## Install Traefik

* Install traefik rbac
    ```bash
    kubectl apply -f traefik-rbac.yml
    ```
* Install traefik Deployment with ServiceAccount
    ```bash
    kubectl apply -f traefik-deploy.yml
    ```
* Install traefik Service
    ```bash
    kubectl apply -f traefik-service.yml
    ```

## Traefik Dashboard

* Install traefik dashboard Service
    ```bash
    kubectl apply -f dashboard-service.yml
    ```
* Expose Dashboard secure way via ingress
  * Create `dashboard-auth` file with credentials:
    * username: traefik
    * password: Password1
    ```bash
    htpasswd -c ./dashboard-auth traefik
    ```
    See [traefik-auth](traefik-auth)
  * Create `dashboard-basic-auth` Secret out of `dashboard-auth` file
    ```bash
    kubectl create secret generic dashboard-basic-auth --from-file dashboard-auth --namespace=kube-system
    ```
  * Install traefik dashboard Ingress rules
    ```bash
    kubectl apply -f dashboard-ingress.yml
    ```

## Generate certificate
There is show how I created fake certificate as an example
```bash
openssl req -newkey rsa:2048 -nodes -keyout mydomain.com.key -x509 -days 365 -out mydomain.com.crt

cat mydomain.com.key | base64
cat mydomain.com.crt | base64
```

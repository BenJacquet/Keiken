## Installing kubectl
You can install kubectl, the command line utility used to interact with the Kubernetes Server by running these commands:
```
wget https://storage.googleapis.com/kubernetes-release/release/v1.24.3/bin/linux/amd64/kubectl
chmod +x kubectl
sudo mv kubectl /usr/local/bin/
```

### Checking our version
Run this command:
```
kubectl version -o yaml
```

It should give you this output:
```
kubectl version -o yaml
clientVersion:
  buildDate: "2022-07-13T14:30:46Z"
  compiler: gc
  gitCommit: aef86a93758dc3cb2c658dd9657ab4ad4afc21cb
  gitTreeState: clean
  gitVersion: v1.24.3
  goVersion: go1.18.3
  major: "1"
  minor: "24"
  platform: linux/amd64
kustomizeVersion: v4.5.4

The connection to the server localhost:8080 was refused - did you specify the right host or port?
```

### Setting up out manifests folder
```
mkdir -p /etc/kubernetes/manifests
```

### Installing etcd
```
apt-get install etcd
```

### Testing etcd
We can test etcd by running a minimal cluster with : 
```
etcd --listen-client-urls http://0.0.0.0:2379 --advertise-client-urls http://localhost:2379 &> /etc/kubernetes/etcd.log &
```

and check out our etcd cluster health:
```
etcdctl cluster-health
```


# The rest is coming soon
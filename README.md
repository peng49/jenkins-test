### 下载
> git clone https://github.com/peng49/jenkins-test.git

### 编译
```shell
cd jenkins-test

mvn package
```

### 启动
> java -jar target/jenkins-test-1.0.1.jar


#### jenkins 用户sudo设置
```vim
# 在 /etc/sudoers.d/ 目录下创建jenkins文件
sudo visudo -f /etc/sudoers.d/jenkins

# 在文件中加入如下内容
jenkins ALL=(ALL) NOPASSWD:ALL

# wq 保存退出
```
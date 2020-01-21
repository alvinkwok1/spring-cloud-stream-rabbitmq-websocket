# Spring-cloud-stream-rabbitmq-websocket
# 环境依赖
- rabbitmq
使用docker 安装rabbitmq
`docker run -d --name rabbitmq3.8.2 -p 5672:5672 -p 15672:15672  --hostname myRabbit -e RABBITMQ_DEFAULT_VHOST=/ -e RABBITMQ_DEFAULT_USER=admin -e RABBITMQ_DEFAULT_PASS=admin --privileged=true rabbitmq`

# 使用方法
## 启动websocket服务1
mvn install
set port=8080 
java -jar WebsocketApplication.jar

## 启动websocket服务2
mvn install
set port=8081 
java -jar WebsocketApplication.jar

如果使用ide进行验证可以配置在环境变量中
## 启动页面
打开页面index8080.html
打开页面index8081.html

打开控制台，刷新任意一个界面，其他界面都会有数据输出

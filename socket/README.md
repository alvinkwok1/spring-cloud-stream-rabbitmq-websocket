# Spring-cloud-stream-rabbitmq-websocket
# 环境依赖
- rabbitmq

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
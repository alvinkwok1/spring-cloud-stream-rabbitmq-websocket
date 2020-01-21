package cn.fruitd.websocket;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfigure implements WebSocketMessageBrokerConfigurer {


  @Override
  public void configureMessageBroker(MessageBrokerRegistry config) {
    //设置服务器广播消息的基础路径
    config.enableSimpleBroker("/topic");
    //设置客户端订阅消息的基础路径
    config.setApplicationDestinationPrefixes("/app");
  }

  /**
   * 注册stomp端点，起到连接作用.
   *
   * @param registry
   */
  @Override
  public void registerStompEndpoints(StompEndpointRegistry registry) {
    ///socket为连接WebSocket的端点
    registry
      .addEndpoint("/socket")
      .setAllowedOrigins("*");
  }

  protected boolean sameOriginDisabled() {
    return true;
  }
}

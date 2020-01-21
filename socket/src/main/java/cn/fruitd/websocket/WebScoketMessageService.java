package cn.fruitd.websocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.integration.support.MutableMessage;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class WebScoketMessageService {

  @Autowired
  private MyProccsor stream;

  @Autowired
  private SimpMessagingTemplate template;

  @StreamListener(MyProccsor.websocketMessageIn)
  public void receive(String message) {
    template.convertAndSend("/topic/log",message);
  }

  public void send(Message message) {
    this.stream.output().send(message);
  }

  @MessageMapping("/hello")
  public void hello(String data) {
    Message message = MessageBuilder.withPayload( "hello")
      .build();
    send(message);
  }


}

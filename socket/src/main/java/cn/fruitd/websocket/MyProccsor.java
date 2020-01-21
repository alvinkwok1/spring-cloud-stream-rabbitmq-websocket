package cn.fruitd.websocket;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

@Component
public interface MyProccsor {
  String websocketMessageIn="websocketMessageIn";
  String websocketMessageOut="websocketMessageOut";

  @Input(websocketMessageIn)
  SubscribableChannel input();

  @Output(websocketMessageOut)
  MessageChannel output();
}

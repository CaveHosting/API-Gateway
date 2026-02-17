package com.cavehosting.api_gateway.Users;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
  private final RabbitTemplate rabbitTemplate;

  public UsersService(RabbitTemplate rabbitTemplate) {
    this.rabbitTemplate = rabbitTemplate;
  }

  public String register(String username) {
    rabbitTemplate.convertAndSend("users.exchange", "routing.key", username);
    return "Registration request send.";
  }
}

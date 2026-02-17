package com.cavehosting.api_gateway.Users;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.amqp.core.Queue;

@Configuration
public class RabbitmqConfig {
  @Bean
  public Queue userQueu() {
    return new Queue("users.queu", true);
  }

  @Bean
  public DirectExchange userExchange() {
    return new DirectExchange("users.exchange");
  }

  @Bean
  public Binding userBinding(Queue userQueu, DirectExchange userExchange) {
    return BindingBuilder.bind(userQueu).to(userExchange).with("routing.key");
  }
}

package com.cavehosting.api_gateway.Users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

  @GetMapping("/register")
  public String registerUser() {
    return "User Registerd";
  }

}

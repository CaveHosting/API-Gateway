package com.cavehosting.api_gateway.Users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

  private final UsersService usersService;

  public UsersController(UsersService usersService) {
    this.usersService = usersService;
  }

  @GetMapping("/register")
  public String registerUser(String username) {
    return usersService.register(username);
  }
}

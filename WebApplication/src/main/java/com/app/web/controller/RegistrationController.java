package com.app.web.controller;

import com.app.web.config.Role;
import com.app.web.domain.User;
import com.app.web.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collections;
import java.util.Map;

@Controller
public class RegistrationController {

  @Autowired
  private UserRepo userRepo;

  @GetMapping("/registration")
  public String registration() {
    return "registration";
  }

  @PostMapping("/registration")
  public String addUser(User user, Map<String, Object> model) {
    User userFromDb = userRepo.findByUsername(user.getUsername());

    if (userFromDb != null) {
      model.put("msg_user_status", "Пользователь существует!");
      return "registration";
    }

    user.setActive(true);
    user.setRoles(Collections.singleton(Role.USER));
    userRepo.save(user);

    return "redirect:/login";
  }

}

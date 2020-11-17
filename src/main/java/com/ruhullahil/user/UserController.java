/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruhullahil.user;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ruhul
 */
@RestController
public class UserController {
    private final UserReposetory reposetory;

    public UserController(UserReposetory reposetory) {
        this.reposetory = reposetory;
    }
    
    @GetMapping("/")
  List<user> all() {
    return reposetory.findAll();
  }
    
}

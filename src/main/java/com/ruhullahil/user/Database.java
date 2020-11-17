/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruhullahil.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author ruhul
 */
@Configuration
public class Database {
    private static final Logger log = LoggerFactory.getLogger(Database.class);
    
    @Bean
  CommandLineRunner initDatabase(UserReposetory repository) {

    return args -> {
      log.info("Preloading " + repository.save(new user("Bilbo Baggins")));
      log.info("Preloading " + repository.save(new user("Frodo Baggins")));
    };
  }
    
}

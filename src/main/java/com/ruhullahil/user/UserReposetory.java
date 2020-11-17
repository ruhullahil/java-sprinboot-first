/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruhullahil.user;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ruhul
 */
public interface UserReposetory extends JpaRepository<user, Long> {
    
}

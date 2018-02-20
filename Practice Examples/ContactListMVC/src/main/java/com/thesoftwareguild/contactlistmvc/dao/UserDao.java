/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.contactlistmvc.dao;

import com.thesoftwareguild.contactlistmvc.dto.User;
import java.util.List;

/**
 *
 * @author mgaffney
 */
public interface UserDao {

    public List<User> getAllUsers();

    public User addUser(User newUser);

    public void deleteUser(String username);

}

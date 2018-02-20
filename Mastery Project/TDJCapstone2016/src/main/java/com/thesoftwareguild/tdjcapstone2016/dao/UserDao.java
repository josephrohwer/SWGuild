/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.tdjcapstone2016.dao;

import com.thesoftwareguild.tdjcapstone2016.dto.User;
import java.util.List;

/**
 *
 * @author apprentice
 */
public interface UserDao {
    public User addUser(User newUser);

    public void deleteUser(String username);
    
    public void updatePassword(String username, String password);

    public List<User> getAllUsers();
}

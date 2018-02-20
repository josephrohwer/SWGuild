/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.addressbookmvc.dao;

import com.thesoftwareguild.addressbookmvc.dto.User;
import java.util.List;

/**
 *
 * @author josephrohwer
 */
public interface UserDao {

    public List<User> getAllUsers();

    public User addUser(User newUser);

    public void deleteUser(String username);

}

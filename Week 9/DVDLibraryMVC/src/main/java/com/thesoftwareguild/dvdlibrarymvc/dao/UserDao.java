/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.dvdlibrarymvc.dao;

import com.thesoftwareguild.dvdlibrarymvc.dto.User;
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
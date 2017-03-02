/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.tdjcapstone2016.dao;

import com.thesoftwareguild.tdjcapstone2016.dto.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author apprentice
 */
public class UserDaoMemImpl implements UserDao {

    private static List<User> UserList = new ArrayList<>();
    
    @Override
    public User addUser(User newUser) {
        UserList.add(newUser);
        return newUser;
    }

    @Override
    public void deleteUser(String username) {
        User found =UserList.stream().filter(f->f.getUsername().equals(username))
                .findAny()
                .orElse(null);
        if (found==null) {           
        } else UserList.remove(found);
    }

    @Override
    public List<User> getAllUsers() {
        return UserList;
    }

    @Override
    public void updatePassword(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

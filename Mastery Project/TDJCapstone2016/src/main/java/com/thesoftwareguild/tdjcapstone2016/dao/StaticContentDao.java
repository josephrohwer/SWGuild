/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.tdjcapstone2016.dao;

import com.thesoftwareguild.tdjcapstone2016.dto.StaticContent;
import java.util.List;

/**
 *
 * @author apprentice
 */
public interface StaticContentDao {
    
    public StaticContent getStaticContent(int id);
    
    public StaticContent addStaticContent(StaticContent sc);
    
    public void updateStaticContent(StaticContent sc);
    
    public List<StaticContent> getAllContent();
    
    public void deleteStaticContent(int id);
}

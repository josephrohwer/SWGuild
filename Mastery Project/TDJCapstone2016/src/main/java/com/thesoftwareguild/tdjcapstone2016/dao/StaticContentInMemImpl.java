/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.tdjcapstone2016.dao;

import com.thesoftwareguild.tdjcapstone2016.dto.StaticContent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author apprentice
 */
public class StaticContentInMemImpl implements StaticContentDao {

    private static Map<Integer, StaticContent> ContentMap = new HashMap<>();

    private static int ContentIdCounter = 0;
    
    @Override
    public StaticContent getStaticContent(int id) {
        return ContentMap.get(id);
    }

    @Override
    public List<StaticContent> getAllContent() {
        Collection<StaticContent> a = ContentMap.values();
        return new ArrayList(a);
    }
    
    @Override
    public StaticContent addStaticContent(StaticContent sc) {
        sc.setStaticId(ContentIdCounter);
        ContentIdCounter++;
        ContentMap.put(sc.getStaticId(), sc);
        return sc;
    }

    @Override
    public void updateStaticContent(StaticContent sc) {
        ContentMap.put(sc.getStaticId(), sc);
    }
    
    @Override
    public void deleteStaticContent(int id) {
        ContentMap.remove(id);
    }
    
}

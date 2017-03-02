/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.tdjcapstone2016.dto;

/**
 *
 * @author apprentice
 */
public class StaticContent {
    
    private int staticId;
    private String title;
    private String staticBody;

    public StaticContent(String title, String staticBody) {
        this.title = title;
        this.staticBody = staticBody;
    }
    
    public StaticContent(){}

    public int getStaticId() {
        return staticId;
    }

    public void setStaticId(int staticId) {
        this.staticId = staticId;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStaticBody() {
        return staticBody;
    }

    public void setStaticBody(String staticBody) {
        this.staticBody = staticBody;
    }
    
    
}

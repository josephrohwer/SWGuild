/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.tdjcapstone2016.dao;

import com.thesoftwareguild.tdjcapstone2016.dto.Contact;
import com.thesoftwareguild.tdjcapstone2016.dto.Post;
import java.util.List;
import java.util.Map;

public interface BlogPostDao{
    
    public Post addPost(Post post);
    
    public void removePost(int postId);
    
    public void updatePost(Post post);
    
    public void approvePost(int id);
    
    public List<Post> getAllPosts();
    
    public List<Post> getQueuedPosts();
    
    public List<Post> getApprovedPosts();
    
    public List<Post> getRecentPosts();
    
    public Post getPostById(int postId);
    
    public List<Post> searchPosts(Map<SearchTerm, String> criteria);
    
    
}

package com.thesoftwareguild.tdjcapstone2016.dto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class Post {

    private int postId;
    @NotEmpty(message = "Please give this post a title!")
    @Length(max = 50, message = "Title must be less than 50 Characters")
    private String title;
    @NotEmpty(message = "Please give this post some content!")
    private String postBody;
    private LocalDate postDate;
    private String postDateString;
    private LocalDate expDate;
    private String expDateString;
    private List<String> tags;
    private boolean status;

    public Post(String title, String postBody, LocalDate postDate, LocalDate expDate, ArrayList<String> tags, boolean status) {
        this.title = title;
        this.postBody = postBody;
        this.postDate = postDate;
        this.postDateString = postDate.toString();
        this.expDateString = expDate.toString();
        this.expDate = expDate;
        this.tags = tags;
        this.status = status;
    }

    public Post() {
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPostBody() {
        return postBody;
    }

    public void setPostBody(String postBody) {
        this.postBody = postBody;
    }

    public LocalDate getPostDate() {
        return postDate;
    }

    public void setPostDate() {
        this.postDate = LocalDate.now();
        setPostDateString(postDate);
    }

    public void setPostDateJSON(String date) {
        this.postDate = LocalDate.parse(date);
        setPostDateString(postDate);
    }
    
    public void setPostDateString(LocalDate postDate) {
        this.postDateString = postDate.toString();
    }

    public String getPostDateString() {
        return this.postDateString;
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    public void setExpDate(LocalDate expDate) {
        this.expDate = expDate;
        setExpDateString(expDate);
    }

    public void setExpDateJSON(String date) {
        if (date.equals("")) {
            this.expDate = LocalDate.now().plusYears(100);
        } else {
            String newExp = date.replace("/", "-");
            this.expDate = LocalDate.parse(newExp);
            setExpDateString(expDate);
        }
    }

    public void setExpDateString(LocalDate postDate) {
        this.expDateString = expDate.toString();
    }

    public String getExpDateString() {
        return this.expDateString;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
    
    public void setTagsSearch(String tag){
        this.tags.add(tag);
    }

    public void setTagsJSON(String tagString) {
        String[] parsedTags;
        List<String> newTags = new ArrayList<>();

        parsedTags = tagString.split(",");
        newTags.addAll(Arrays.asList(parsedTags));
        this.tags = newTags;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}

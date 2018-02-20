package com.thesoftwareguild.tdjcapstone2016.controller;

import com.thesoftwareguild.tdjcapstone2016.dao.BlogPostDao;
import com.thesoftwareguild.tdjcapstone2016.dao.SearchTerm;
import com.thesoftwareguild.tdjcapstone2016.dto.Post;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SearchController {
    
    BlogPostDao dao;
    
    @Inject
    public SearchController(BlogPostDao dao){
        this.dao = dao;
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String displaySearchPage() {
        return "search";
    }
    
    @RequestMapping(value = "search/posts", method = RequestMethod.POST)
    @ResponseBody
    public List<Post> searchPosts(@RequestBody Map<String, String> searchMap) {
        
        Map<SearchTerm, String> criteriaMap = new HashMap<>();

        String currentTerm = searchMap.get("title");
        if (currentTerm != null && !currentTerm.isEmpty()) {
            criteriaMap.put(SearchTerm.TITLE, currentTerm);
        }
        currentTerm = searchMap.get("tagsSearch");
        if (currentTerm != null && !currentTerm.isEmpty()) {
            criteriaMap.put(SearchTerm.TAGS, currentTerm);
        }
        currentTerm = searchMap.get("postDateJSON");
        if (currentTerm != null && !currentTerm.isEmpty()) {
            criteriaMap.put(SearchTerm.DATE, currentTerm);
        }
        return dao.searchPosts(criteriaMap);
    }
}

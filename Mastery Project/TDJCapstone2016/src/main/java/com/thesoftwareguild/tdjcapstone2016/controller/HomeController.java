package com.thesoftwareguild.tdjcapstone2016.controller;

import com.thesoftwareguild.tdjcapstone2016.dao.BlogPostDao;
import com.thesoftwareguild.tdjcapstone2016.dao.BlogPostDaoDbImpl;
import com.thesoftwareguild.tdjcapstone2016.dao.BlogPostDaoInMemImpl;
import com.thesoftwareguild.tdjcapstone2016.dao.ContactDao;
import com.thesoftwareguild.tdjcapstone2016.dao.ContactDaoDbImpl;
import com.thesoftwareguild.tdjcapstone2016.dao.ContactDaoInMemImpl;
import com.thesoftwareguild.tdjcapstone2016.dao.StaticContentDao;
import com.thesoftwareguild.tdjcapstone2016.dao.StaticContentDbImpl;
import com.thesoftwareguild.tdjcapstone2016.dao.StaticContentInMemImpl;
import com.thesoftwareguild.tdjcapstone2016.dto.Contact;
import com.thesoftwareguild.tdjcapstone2016.dto.Post;
import com.thesoftwareguild.tdjcapstone2016.dto.StaticContent;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class HomeController {

    BlogPostDao dao;
    ContactDao cDao;
    StaticContentDao sDao;

    @Inject
    public HomeController(BlogPostDaoDbImpl dao, ContactDaoDbImpl cDao, StaticContentDbImpl sDao) {
        this.sDao = sDao;
        this.dao = dao;
        this.cDao = cDao;
    }

    public HomeController() {
    }

    public void populateCDao() {
        if (cDao.getContact(1)==null) {
        Contact contact = new Contact("1-800-712-459-3486",
                "fontaine_flowers@gmail.com",
                "twitter.com/fontaine_flowers",
                "facebook.com/fontaine_flowers");

        cDao.addContact(contact);
        } else {
        }
    }
    
    public void populateSDao() {
        if(sDao.getStaticContent(1)==null) {
        StaticContent staticContent = new StaticContent("Disclaimer Page",
               "This is a disclaimer. Our flowers are not guarenteed to show up alive, "
                + "or to show up at all. No refunds. Lawyered.");

        sDao.addStaticContent(staticContent);
        } else {
        }
    }

    public void populateDao() {

        ArrayList<String> onetags = new ArrayList<>();
        onetags.add("#FlowersInBeard");
        onetags.add("#ShinyNewBlog");
        onetags.add("#GazeInWonder");

        Post onepost = new Post("Look at These New Blog Posts!", "<h3 style=\"text-align: center;\"><strong>WOW, LOOK AT THESE BLOG POSTS!</strong></h3>\n"
                + "<p style=\"text-align: center;\"><strong><img src=\"https://s-media-cache-ak0.pinimg.com/736x/c7/c4/aa/c7c4aa22f7264ec6de584807fb7f9330.jpg\" alt=\"flower_beard\" width=\"246\" height=\"307\" /></strong></p>\n"
                + "<p style=\"text-align: center;\"><em>This guy knows what I'm talking about!</em><strong><br /></strong></p>\n"
                + "<blockquote>\n"
                + "<p style=\"text-align: center;\">Gee gosh golly whiz we here at Fontaine's Flowers are excited about our new blog. Look at how disgustingly beautiful everything on this website is. I'm so proud I could just heave. Let's take a look at some of the features of our brand new blog:</p>\n"
                + "</blockquote>\n"
                + "<p style=\"text-align: left;\">We can align text&nbsp;<span style=\"text-decoration: line-through;\">right</span> left with some dummy text like so:</p>\n"
                + "<p style=\"text-align: left;\">&nbsp;<strong style=\"margin: 0px; padding: 0px; font-family: 'Open Sans', Arial, sans-serif; text-align: justify;\">Lorem Ipsum</strong><span style=\"font-family: 'Open Sans', Arial, sans-serif; text-align: justify;\">"
                + "&nbsp;is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."
                + " It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages,"
                + " and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</span></p>\n"
                + "<p style=\"text-align: right;\"><span style=\"font-family: 'Open Sans', Arial, sans-serif; text-align: justify;\">We can even align text right for our japanese and/or hebrew flower lovers!</span></p>\n"
                + "<p style=\"text-align: left;\"><a title=\"link\" href=\"http://www.flowermankc.com/\" target=\"_blank\" rel=\"noopener noreferrer\">Here's a link to a competitor's website. Que horrible, no?</a></p>\n"
                + "<br><br><h2 style=\"text-align: center;\">Thanks for visiting!</h2>", LocalDate.now(), LocalDate.of(2020, 05, 26), onetags, true);

        ArrayList<String> twotags = new ArrayList<>();
        twotags.add("#Whatevenisthis");
        twotags.add("#HashTagsFTW");

        Post twopost = new Post("Brand new article for your approval", "<h1 style=\"text-align: center;\">OH, PLEASE APPROVE THIS POST!</h1>\n" +
"<p style=\"text-align: center;\"><img src=\"https://www.colourbox.com/preview/3431422-man-holding-a-bouquet-of-flowers-on-white-background.jpg\" alt=\"another_flower_guy\" width=\"323\" height=\"440\" /></p>\n" +
"<p style=\"text-align: center;\">It would just mean an awful lot to me if you'd approve this post. I've always wanted to publish my work, and I feel like this could be a real boon to my career as a ghostwriter for other people's blogs."
                + " I know I'm techinically a 'marketing person,' but the title of MP just doesn't carry the same weight as it does in Britain, so... Listen, I've always wanted to be a writer like Hemmingway, or that guy who wrote 'The Seven Habits of Highly Effective People'."
                + " I'll take anything, really, I just need a start. Oh man could I use a break right now. I mean, it's not like I'm expecting success right out of the gate, but just give me this one shot to prove i've got what it takes. "
                + "I'm sure L. Ron Hubbard's first writing project was on whatever the mid-20th century equivalent of a blog is, and look where he is now! ...Well, technically dead, but also a deity in the eyes of Tom Cruise. And who could ask for more.</p>\n" +
"<p style=\"text-align: center;\">In conclusion, I would like permission for this to be shared on your website, but maybe leave out the part where I was begging.</p>\n" +
"<p style=\"text-align: center;\">~<em>Marketing Person</em></p>", LocalDate.now(), LocalDate.of(2020, 05, 26), twotags, false);

        ArrayList<String> threetags = new ArrayList<>();
        threetags.add("#WowSoOld");
        threetags.add("#OldPost");
        threetags.add("#ThisGuy");

        Post threepost = new Post("This post is old", "<h3 style=\"text-align: center;\">\"Old post is severely old.\"</h3>\n"
                + "<p>&nbsp;</p>\n"
                + "<div style=\"margin-top: 1.26316em; margin-bottom: 1.26316em; font-family: 'Poets Electra Web', 'Times New Roman',"
                + " Times, serif; font-size: 14px; line-height: 24px; white-space: pre-wrap; word-wrap: break-word; text-align: center;\"><p>When you are old and grey and full of sleep, And nodding by the fire, take down this book, "
                + "And slowly read, and dream of the soft look Your eyes had once, and of their shadows deep;</p><br><p>How many loved your moments of "
                + "glad grace, And loved your beauty with love false or true, But one man loved the pilgrim soul in you, And loved the sorrows "
                + "of your changing face;</p><br><p>And bending down beside the glowing bars, Murmur, a little sadly, how Love fled And paced upon "
                + "the mountains overhead And hid his face amid a crowd of stars.</p><br /><br />~ W.B. Yeats<br /><br />"
                + "<img src=\"https://s-media-cache-ak0.pinimg.com/236x/8a/cf/40/8acf40b1e1efaf879f2adec9112aa05b.jpg\" "
                + "alt=\"flower_guy\" width=\"236\" height=\"353\" /><br /><em>This guy knows what I'm talking about</em><br /><br /></div>",
                LocalDate.of(2006, 05,26), LocalDate.of(2020, 05, 26), threetags, true);

        if (dao.getAllPosts().isEmpty()) {
            dao.addPost(onepost);
            dao.addPost(twopost);
            dao.addPost(threepost);
        }
    }

    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String displayHomePage() {
        populateCDao();
        populateDao();
        populateSDao();
        return "home";
    }

    @RequestMapping(value = {"/contactUs"}, method = RequestMethod.GET)
    public String displayContactPage() {
        return "contactUs";
    }

    @RequestMapping(value = {"/viewSearchPosts"}, method = RequestMethod.GET)
    public String displayBlogFeed() {
        return "viewSearchPosts";
    }
    
    @RequestMapping(value = {"/displayPageManager"}, method = RequestMethod.GET)
    public String displayPageManager() {
        return "displayPageManager";
    }

    @RequestMapping(value = {"/adminPage"}, method = RequestMethod.GET)
    public String displayAdminPage() {
        return "adminPage";
    }
    
    @RequestMapping(value = {"/adminPage/{id}"}, method = RequestMethod.GET)
    public String displayAdminBlogPage(@PathVariable("id") int id, Model model) {
        Post post = dao.getPostById(id);

        model.addAttribute("post", post);
        return "adminBlogPage";
    }

    @RequestMapping(value = {"/blogPage/dropdown","/blogPage/{id}"}, method = RequestMethod.GET)
    public String displayBlogPage(@PathVariable("id") int id, Model model) {
        Post post = dao.getPostById(id);

        model.addAttribute("post", post);
        return "blogPage";
    }
    
    @RequestMapping(value = {"/staticPage/staticPage/{id}","/staticPage/{id}", "/blogPage/staticPage/{id}"}, method = RequestMethod.GET)
    public String displayStaticPage(@PathVariable("id") int id, Model model) {
        StaticContent staticContent = sDao.getStaticContent(id);

        model.addAttribute("staticContent", staticContent);
        return "staticPage";
    }

    @RequestMapping(value = "/post/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Post getPost(@PathVariable("id") int id) {
        return dao.getPostById(id);
    }

    @RequestMapping(value = "post", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Post createPost(@Valid @RequestBody Post post) {
        dao.addPost(post);
        return post;
    }

    @RequestMapping(value = "/post/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePost(@PathVariable("id") int id) {
        dao.removePost(id);
    }

    @RequestMapping(value = "/post/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void putPost(@PathVariable("id") int id, @Valid @RequestBody Post post) {
        post.setPostId(id);
        dao.updatePost(post);
    }

    @RequestMapping(value = "/approvedpost/{id}", method = RequestMethod.GET)
    @ResponseBody
    public void approvePost(@PathVariable("id") int id) {
        dao.approvePost(id);
    }

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    @ResponseBody
    public List<Post> getApprovedPosts() {
        return dao.getApprovedPosts();
    }

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    @ResponseBody
    public Contact getContact() {
        int id = 1;
        return cDao.getContact(id);
    }

    @RequestMapping(value = "/updateContact", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void putContact(@Valid @RequestBody Contact contact) {
        cDao.updateContact(contact);
    }
    
    @RequestMapping(value = "/updateStatic", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void putStaticContent(@RequestBody StaticContent staticContent) {
        sDao.updateStaticContent(staticContent);
    }

    @RequestMapping(value = "/static", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public StaticContent createStaticContent(@Valid @RequestBody StaticContent staticContent) {
        sDao.addStaticContent(staticContent);
        return staticContent;
    }
    
    @RequestMapping(value = "/static/{id}", method = RequestMethod.GET)
    @ResponseBody
    public StaticContent getStaticContent(@PathVariable("id") int id) {
        return sDao.getStaticContent(id);
    }
    
    @RequestMapping(value = "/queuedposts", method = RequestMethod.GET)
    @ResponseBody
    public List<Post> getQueuedPosts() {
        return dao.getQueuedPosts();
    }

    @RequestMapping(value = "/recentposts", method = RequestMethod.GET)
    @ResponseBody
    public List<Post> getRecentPosts() {
        return dao.getRecentPosts();
    }
    
    @RequestMapping(value = "/staticContent", method = RequestMethod.GET)
    @ResponseBody
    public List<StaticContent> getStaticContentTable() {
        return sDao.getAllContent();
    }
    
    @RequestMapping(value = "/static/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteStaticContent(@PathVariable("id") int id) {     
        sDao.deleteStaticContent(id);
    }
    
    @RequestMapping(value = {"/staticPage/dropdown", "/dropdown"}, method = RequestMethod.GET)
    @ResponseBody
    public List<StaticContent> getDropdown() {
        return sDao.getAllContent();
    }
}

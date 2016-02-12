package com.ishi;

import javax.persistence.*;

@Entity
@Table(name = "blog")
public class Blog {


    public String username;
    public String title;
    public String content;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int blogid;
    public Blog(){}
    public Blog(String username,String title,String content)
    {
        this.username=username;
        this.title=title;
        this.content=content;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getBlogId() {
        return blogid;
    }

    public void setBlogId(int id) {
        this.blogid = id;
    }
}
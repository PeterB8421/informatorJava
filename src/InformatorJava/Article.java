/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InformatorJava;

import java.sql.Date;

/**
 *
 * @author Petr
 */
public class Article {
    private int id;
    private String title;
    private String content;
    private Date date;
    private boolean published;
    private String category;
    private String[] categories = {"hardware","software","networking","programming"};

    public Article(int id, String title, String content, Date date, boolean published, String category) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.date = date;
        this.published = published;
        this.category = category;
    }

    public Article(String title, String content, Date date, boolean published, String category) {
        this.title = title;
        this.content = content;
        this.date = date;
        this.published = published;
        this.category = category;
    }
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public String getCategory() {
        return category;
    }

    public boolean setCategory(String category) {
        boolean valid = false;
        for(int i = 0; i < categories.length; i++){
            if(categories[i] == category){
                valid = true;
                break;
            }
        }
        if(valid){
            this.category = category;
            return true;
        }
        else
            return false;
    }

    public String[] getCategories() {
        return categories;
    }
    
}

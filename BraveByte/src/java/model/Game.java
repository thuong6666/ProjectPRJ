/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author user
 */
public class Game {
    private int id;
    private String title;
    private String description;
    private String author;
    private String kind;
    private String poster;
    private String background;
    private double price;
    private String created_at;
    private int rating;

    public Game() {
    }

    public Game(int id, String title, String description, String author, String kind, String poster, String background, double price, String created_at, int rating) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.author = author;
        this.kind = kind;
        this.poster = poster;
        this.background = background;
        this.price = price;
        this.created_at = created_at;
        this.rating = rating;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Game(int id, String title, String kind, String background, double price) {
        this.id = id;
        this.title = title;
        this.kind = kind;
        this.background = background;
        this.price = price;
    }
 
    
        
    @Override
    public String toString() {
        return "Game{" + "id=" + id + ", title=" + title + ", description=" + description + ", author=" + author + ", kind=" + kind + ", poster=" + poster + ", background=" + background + ", price=" + price + ", created_at=" + created_at + ", rating=" + rating + '}';
    }
    
}

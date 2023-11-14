/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Pagging {
    private int page;
    private int perPage;
    private ArrayList<Game> items;
    private int total;

    public Pagging() {
    }

    public Pagging(int page, int perPage, ArrayList<Game> items, int total) {
        this.page = page;
        this.perPage = perPage;
        this.items = items;
        this.total = total;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPerPage() {
        return perPage;
    }

    public void setPerPage(int perPage) {
        this.perPage = perPage;
    }

    public ArrayList<Game> getItems() {
        return items;
    }

    public void setItems(ArrayList<Game> items) {
        this.items = items;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Pagging{" + "page=" + page + ", perPage=" + perPage + ", items=" + items + ", total=" + total + '}';
    }
    
}

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
public class Cart {
    private int accID;
    private int gID;

    public Cart() {
    }

    public Cart(int accID, int gID) {
        this.accID = accID;
        this.gID = gID;
    }

    public int getAccID() {
        return accID;
    }

    public void setAccID(int accID) {
        this.accID = accID;
    }

    public int getgID() {
        return gID;
    }

    public void setgID(int gID) {
        this.gID = gID;
    }

    @Override
    public String toString() {
        return "Cart{" + "accID=" + accID + ", gID=" + gID + '}';
    }
    
}

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
public class Library {
    private int accID;
    private int gID;

    public Library() {
    }

    public Library(int accID, int gID) {
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
        return "Library{" + "accID=" + accID + ", gID=" + gID + '}';
    }
}

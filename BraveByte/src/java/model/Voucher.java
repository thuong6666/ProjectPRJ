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
public class Voucher {
    private String code;
    private int discount;
    private int targets;
    private String description;
    private String startDate;
    private String endDate;

    public Voucher() {
    }

    public Voucher(String code, int discount, int targets, String description, String startDate, String endDate) {
        this.code = code;
        this.discount = discount;
        this.targets = targets;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getTargets() {
        return targets;
    }

    public void setTargets(int targets) {
        this.targets = targets;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Voucher{" + "code=" + code + ", discount=" + discount + ", targets=" + targets + ", description=" + description + ", startDate=" + startDate + ", endDate=" + endDate + '}';
    }
    
}

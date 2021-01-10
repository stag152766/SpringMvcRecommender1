package ru.eprocurement.recommender.models;

public class Product {
    private int id;
    private String name;
    private int sum;
    private String codeOkpd;

    public Product(int id, String name, int sum, String codeOkpd) {
        this.id = id;
        this.name = name;
        this.sum = sum;
        this.codeOkpd = codeOkpd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getCodeOkpd() {
        return codeOkpd;
    }

    public void setCodeOkpd(String codeOkpd) {
        this.codeOkpd = codeOkpd;
    }
}

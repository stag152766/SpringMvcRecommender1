package ru.eprocurement.recommender.dao;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PurchaseDAO {

    private List<String> purchases;

    {
        purchases = new ArrayList<>();
        purchases.add("test1");
        purchases.add("test2");
        purchases.add("test3");
    }


    public List<String> index() {
        return purchases;
    }

}

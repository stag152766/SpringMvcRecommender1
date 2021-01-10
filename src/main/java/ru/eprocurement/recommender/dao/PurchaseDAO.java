package ru.eprocurement.recommender.dao;

import org.springframework.stereotype.Component;
import ru.eprocurement.recommender.models.Product;
import ru.eprocurement.recommender.models.Purchase;

import java.util.ArrayList;
import java.util.List;

@Component
public class PurchaseDAO {

    private List<Purchase> purchases;

    {
        Product product = new Product(1,"Fruits",1000,"15.123.12.0");
        List<Product> products = new ArrayList<>();
        products.add(product);

        Purchase purchase = new Purchase(1, products);

        purchases = new ArrayList<>();
        purchases.add(purchase);
    }


    public List<Purchase> index() {
        return purchases;
    }

    public Purchase show(int id) {
        return purchases.stream().filter(purchase -> purchase.getId() == id).findAny().orElse(null);
    }



}

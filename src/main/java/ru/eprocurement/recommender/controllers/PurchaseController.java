package ru.eprocurement.recommender.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.eprocurement.recommender.dao.PurchaseDAO;

@Controller
@RequestMapping("/purchases")
public class PurchaseController {

    private final PurchaseDAO purchaseDAO;

    public PurchaseController(PurchaseDAO purchaseDAO) {
        this.purchaseDAO = purchaseDAO;
    }


    @GetMapping
    public String index(Model model){
        model.addAttribute("purchases", purchaseDAO.index());
        return "purchases/index";
    }
}

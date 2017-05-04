package com.store.controllers;

import com.store.beans.ProductRepository;
import com.store.domain.ProductEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StoreController {

    @Autowired
    private ProductRepository productRepo;
    
    @RequestMapping("/")
    public String index() {
        return "index";
    }
    
    @ModelAttribute("products")
    public List<ProductEntity> products() {
        return productRepo.findAll();
    }

    @GetMapping("{id}")
    public ModelAndView product(@PathVariable("id") Long id) {
        ProductEntity product = productRepo.findOne(id);
        return new ModelAndView("product/preview", "product", product);
    }
}

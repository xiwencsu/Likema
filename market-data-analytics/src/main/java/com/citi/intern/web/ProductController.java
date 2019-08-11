package com.citi.intern.web;

import com.citi.intern.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping(value = "/list")
    @ResponseBody
    public List<Product> health() {
        List<Product> list = new ArrayList();
        list.add(new Product("衬衣", 10));
        list.add(new Product("短袖", 20));
        list.add(new Product("大衣", 30));
        return list;
    }

}

package com.bench_break.estimate.estimate.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bench_break.estimate.bean.Manufacturer;
import com.bench_break.estimate.bean.Product;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class EstimateController {

    @RequestMapping("/hello")
    public String hello(@RequestParam String name, Model model) {
        model.addAttribute("name", name);
        return "test";
    }

    @GetMapping("/estimate")
    public String estimate(Model model) {
        // メーカー
        List<Manufacturer> manufacturers = new ArrayList<>();
        manufacturers.add(new Manufacturer("01", "村田製作所"));
        manufacturers.add(new Manufacturer("02", "島津製作所"));
        manufacturers.add(new Manufacturer("03", "オムロン"));
        manufacturers.add(new Manufacturer("04", "三菱テクノロジーズ"));

        // 商品
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "ジャイロセンサー", new Manufacturer("02", "島津製作所"), 5000, null));
        products.add(new Product(2, "人感センサー", new Manufacturer("01", "村田製作所"), 2000, null));
        products.add(new Product(3, "温度センサー", new Manufacturer("03", "オムロン"), 500, "型番TA-2312"));
        products.add(new Product(4, "赤外線センサー", new Manufacturer("04", "三菱テクノロジーズ"), 3200, "新型"));

        model.addAttribute("manufacturers", manufacturers);
        model.addAttribute("products", products);

        log.debug("estimate: {}", products);;

        return "estimate";
    }
}

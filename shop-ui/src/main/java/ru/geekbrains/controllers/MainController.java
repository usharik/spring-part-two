package ru.geekbrains.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.geekbrains.controllers.repr.ProductRepr;
import ru.geekbrains.service.ProductService;
import ru.geekbrains.service.StockService;

@Controller
public class MainController {

    private final ProductService productService;

    private final StockService stockService;

    @Autowired
    public MainController(ProductService productService, StockService stockService) {
        this.productService = productService;
        this.stockService = stockService;
    }

    @RequestMapping({"/", "/index", "/products"})
    public String indexPage(Model model) {
        model.addAttribute("products", productService.findAllAndSplitProductsBy(3));
        return "products";
    }

    @RequestMapping("/product_details/{id}")
    public String productDetailPage(@PathVariable("id") Long id, Model model) {
        ProductRepr productRepr = productService.findById(id).orElseThrow(IllegalArgumentException::new);
        productRepr.setCountInStock(stockService.getStockInfo(productRepr.getId()).getCount());
        model.addAttribute("product", productRepr);
        return "product_details";
    }
}

package com.example.springproject.controllers;
import com.example.springproject.entities.Product;
import com.example.springproject.services.interfaces.IProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
    private final IProductService ips;

    public ProductController(IProductService productService) {
        this.ips = productService;
    }

    @GetMapping("/")
    public String products(String title, Model model) {
        model.addAttribute("products", ips.listOfProducts(title));
        return "products";
    }

    @GetMapping("/product/{id}")
    public String productInfo(@PathVariable int id, Model model) {
        model.addAttribute("product", ips.getProductById(id));
        return "productInfo";
    }

    @PostMapping("/product/create")
    public String createProduct(Product product) {
        ips.saveProduct(product);
        return "redirect:/";
    }

    @PostMapping("/product/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        ips.deleteProduct(id);
        return "redirect:/";
    }
}
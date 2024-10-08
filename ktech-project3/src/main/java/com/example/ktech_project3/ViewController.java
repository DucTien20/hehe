package com.example.ktech_project3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("views")
public class ViewController {
    @GetMapping("test")
    public String test() {
        return "test";
    }

    @GetMapping("/login")
    public String login() {
        return "/users/login-form.html";
    }

    @GetMapping("my-profile")
    public String myProfile() {
        return "/users/my-profile.html";
    }

    @GetMapping("user-update")
    public String update() {
        return "/users/update.html";
    }

    @GetMapping("/signup")
    public String signup() {
        return "/users/sign-up-form.html";
    }

    @GetMapping("shop-list")
    public String shopList() {
        return "/shops/shop-list.html";
    }

    @GetMapping("home-page")
    public String homePage() {
        return "/shops/home-page.html";
    }
    @GetMapping("signin-home-page")
    public String signinHomePage() {
        return "/shops/signin-home-page.html";
    }

    @GetMapping("get-shop/{id}")
    public String getShop() {
        return "/shops/shop-profile.html";
    }

    @GetMapping("business-application")
    public String businessApplication() {
        return "/users/business-application.html";
    }

    @GetMapping("not-open-shops")
    public String notOpenShop() {
        return "/shops/not-open-shop.html";
    }

    @GetMapping("shop-open-apply")
    public String shopOpenApply() {
        return "/shops/shop-open-apply.html";
    }

    @GetMapping("owned-shops-products")
    public String ownedShopProducts() {
        return "/shops/owned-shops-products.html";
    }
    @GetMapping("add-product")
    public String addProduct() {
        return "/products/add-product.html";
    }
    @GetMapping("update-product")
    public String updateProduct() {
        return "/products/update-product.html";
    }
}

package edu.sabanciuniv.controller;


import edu.sabanciuniv.entity.Product;
import edu.sabanciuniv.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//artik bu sinifin icindeki methodlara doget dopost methodlari alabilecegiz, http requestleri
@RestController
@RequestMapping("ProductController")
public class ProductController {

@Autowired
    private ProductService productService;

    @GetMapping("/addProduct")
    public void addProduct()
    {
        productService.addProduct(new Product(1,"Laptop", 1000));
    }

@GetMapping ("/getProduct")
    public Product getProduct()

{
    return new Product (1,"Laptop", 1000);
}

}

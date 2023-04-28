package ma.enset.scolarite.web;

import ma.enset.scolarite.enteties.Product;
import ma.enset.scolarite.repository.ProductRep;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductResControler {
    private ProductRep pr;
    public List<Product> products(){
        return pr.findAll();

    }
    @GetMapping("/products/{id}")
    public Product findproducts(@PathVariable Long id) {
        Product product = pr.findById(id).orElse(null);
        return product;
    }}

package ma.enset.scolarite;

import ma.enset.scolarite.enteties.Product;
import ma.enset.scolarite.repository.ProductRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.List;

@SpringBootApplication
public class ScolariteApplication implements CommandLineRunner {
@Autowired
    private ProductRep pr;
    public static void main(String[] args) {
        SpringApplication.run(ScolariteApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    pr.save(new Product(null,"Computer",4400,3));    pr.save(new Product(null,"Computer",4400,3));
        pr.save(new Product(null,"Computer",4400,3));
        List<Product> products = pr.findAll();
        products.forEach(p->{System.out.println(p.toString());
        });
            Product product =pr.findById(Long.valueOf(1)).get();
            System.out.println(product.getId());
            System.out.println(product.getName());
        System.out.println(product.getQnt());
        System.out.println(product.getPrice());
        System.out.println("-------------------");
List<Product> productList=pr.search("%c%");
productList.forEach(p->{
    System.out.println(p);
});
    }


    }

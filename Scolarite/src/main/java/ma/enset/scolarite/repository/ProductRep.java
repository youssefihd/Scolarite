package ma.enset.scolarite.repository;

import jakarta.servlet.annotation.WebFilter;
import ma.enset.scolarite.enteties.Product;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRep extends JpaRepository <Product,Long> {
    List<Product> findByNameContains(String mc);
    @Query("select p from Product p where p.name like :x ")
    List<Product> search(@Param("x") String mc);
}

package com.adapty.shopping.repositories;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.adapty.shopping.entities.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart,String> {

    
    @Transactional
    public String deleteByProductId(String productId);

    
}

package com.store.beans;

import com.store.domain.Cart;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("globalSession")
public class CartService {
    
    private Cart cart;
    
    
    
    
}

package com.store.domain;

import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;

public class CartTest {
    
    public CartTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTotalPrice method, of class Cart.
     */
    @Test
    public void testGetTotalPrice() {
        
        Double expResult = 60.0;
        
        Cart cartUnderTest = new Cart();
        
        ProductEntity p1 = new ProductEntity();
        ProductEntity p2 = new ProductEntity();
        ProductEntity p3 = new ProductEntity();
        
        p1.setPrice(10.0);
        p2.setPrice(20.0);
        p3.setPrice(30.0);
        
        cartUnderTest.setProducts(Arrays.asList(p1, p2, p3));
        
        Double result = cartUnderTest.getTotalPrice();
        assertEquals(expResult.longValue(), p1.getPrice().longValue() + p2.getPrice().longValue() + p3.getPrice().longValue());
    }
}

package com.symulakr.patterns.factory.simple;

import org.junit.Before;
import org.junit.Test;

public class ProductFactoryTest {

   private ProductFactory factory;

   @Before
   public void setUp() throws Exception{
        factory = new ProductFactory();
   }

   @Test
   public void createProduct() throws Exception{
      Product product;
      product = factory.createProduct("A");
      product.writeName("1234567890");
      product = factory.createProduct("B");
      product.writeName("1234567890");
   }

}
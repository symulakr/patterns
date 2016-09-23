package com.symulakr.patterns.factory.simple;

public class ProductFactory {

   Product createProduct(String type){
      if ("A".equals(type)) {
         return new ProductA();
      }
      else {
         return new ProductB();
      }
   }

}

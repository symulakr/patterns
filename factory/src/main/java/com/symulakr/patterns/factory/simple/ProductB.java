package com.symulakr.patterns.factory.simple;

public class ProductB extends Product {

   @Override
   public void writeName(String name){
      StringBuilder tempName = new StringBuilder(name);
      System.out.println("My reversed name is: " + tempName.reverse());
   }
}

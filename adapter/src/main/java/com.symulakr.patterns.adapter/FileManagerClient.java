package com.symulakr.patterns.adapter;

public class FileManagerClient {

   public static void main(String[] args){
      String data = "dummy Date";
      FileManager fileManager = new FileManagerAdapter();
      System.out.println("Using fileManager: " + fileManager.getClass().toString());
      fileManager.open("tempFile");
      fileManager.write(0, data.length(), data.getBytes());
      String test = fileManager.read(0, data.length(), data.getBytes());
      System.out.println("Data written and read: " + test);
      fileManager.close();
   }

}

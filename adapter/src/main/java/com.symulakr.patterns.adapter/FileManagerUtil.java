package com.symulakr.patterns.adapter;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileManagerUtil {
   private RandomAccessFile file;

   public boolean openFile(String fileName){
      System.out.println("Opening file: " + fileName);
      try {
         file = new RandomAccessFile(File.createTempFile(fileName, null), "rw");
      }
      catch (IOException e) {
         return false;
      }
      return true;
   }

   public boolean closeFile(){
      try {
         System.out.println("Closing file");
         file.close();
      }
      catch (IOException e) {
         return false;
      }

      return true;
   }

   public boolean writeToFile(String data, long position, long amount){
      System.out.print("Writing " + amount + " chars from string: " + data);
      System.out.println(" to position: " + position + " in file");
      try {
         file.write(data.getBytes(), (int) position, (int) amount);
      }
      catch (IOException e) {
         return false;
      }
      return true;
   }

   public String readFromFile(long position, long amount){
      System.out.println("Reading " + amount + " chars from pos: " + position + " in file");
      byte[] consumer = new byte[(int) amount];
      try {
         file.seek(0);
         file.read(consumer, (int) position, (int) amount);
      }
      catch (IOException e) {
         return "";
      }
      return new String(consumer);
   }

}

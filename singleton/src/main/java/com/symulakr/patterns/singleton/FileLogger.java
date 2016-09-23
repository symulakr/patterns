package com.symulakr.patterns.singleton;

public class FileLogger {
   private static FileLogger ourInstance;

   public static FileLogger getInstance(){
      if (ourInstance == null) {
         ourInstance = new FileLogger();
      }
      return ourInstance;
   }

   private FileLogger(){
   }

   public synchronized void log(String msg){
      //Write to log file
   }
}

package com.symulakr.patterns.adapter;

/**
 * <h1>Adapter Pattern</h1>
 * <i>Also known as Wrapper.</i>
 * <p><b>Definition</b></p>
 * The Adapter pattern is used to translate the interface of one class into
 * another interface. This means that we can make classes work together that
 * couldn't otherwise because of incompatible interfaces. A class com.symulakr.patterns.adapter uses
 * multiple inheritance (by extending one class and/or implementing one or
 * more classes) to adapt one interface to another. An object com.symulakr.patterns.adapter relies on
 * object aggregation.
 * <p><b>Where to use</b></p>
 * <ul>
 * <li>When you want to use an existing class, and its interface does not match the one you need.</li>
 * <li>When you want to create a reusable class that cooperates with unrelated or unforeseen classes,
 * that is, classes that don't necessarily have compatible interfaces.</li>
 * <li>When you want to increase transparency of classes.</li>
 * <li>When you want to make a pluggable kit.</li>
 * </ul>
 * <p><b>Benefits</b></p>
 * <ul>
 * <li>Highly class reusable.</li>
 * <li>Introduces only one object</li>
 * </ul>
 * <p><b>Drawbacks/consequences</b></p>
 * When using Java, Target must be an interface.
 */
public class FileManagerAdapter extends FileManagerUtil implements FileManager {

   public String open(String fileName){
      return Boolean.toString(openFile(fileName));
   }

   public String close(){
      return Boolean.toString(closeFile());
   }

   public String read(int position, int amount, byte[] data){
      return readFromFile(position, amount);
   }

   public String write(int position, int amount, byte[] data){
      return Boolean.toString(writeToFile(new String(data), position, amount));
   }
}

package com.symulakr.patterns.adapter;

public interface FileManager {

   String open(String s);

   String close();

   String read(int position, int amount, byte[] data);

   String write(int position, int amount, byte[] data);

}

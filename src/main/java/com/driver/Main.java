package com.driver;

public class Main {
  public static void main(String[] args) {
    RWOnly obj =new RWOnly();
    obj.setters("Naveen");
    System.out.println(obj.getter());
  }
}
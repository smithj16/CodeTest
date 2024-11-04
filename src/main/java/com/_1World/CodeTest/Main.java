package com._1World.CodeTest;


public class Main{

  public static void main(String[] args) {

   BackPack bag = new BackPack(27);
   BackPack bag2 = new BackPack(38);
   BackPack bag3 = new BackPack(15);

   bag.printContents();

   System.out.println("\n");
   bag2.printContents();

    System.out.println("\n");
   bag3.printContents();
  }

}

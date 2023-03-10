package org.example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class TenCities {
    HashSet<String> h = new HashSet<String>();
    Scanner scan = new Scanner(System.in);
    Iterator<String> i = h.iterator();


   public int cities() {
       h.add("Абаза");
       h.add("Абакан");
       h.add("Абдулино");
       h.add("Абинск");
       h.add("Агидель");
       h.add("Агрыз");
       h.add("Адыгейск");
       h.add("Азнакаево");
       h.add("Азов");
       h.add("Ак-Довурак");
       String[] arr = { "Абаза", "Абакан", "Абдулино", "Абинск", "Агидель","Агрыз","Адыгейск", "Азнакаево", "Азов","Ак-Довурак" };
       System.out.println(h);
       int c = 0;
       for (String i : arr) {
           if (i == "А") {
              c=c+c;

           }
       }
return c;

   }

}

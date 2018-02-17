package com.acme;

import java.time.LocalDateTime;

/**
 * Just output the time stamp.
 */
public class PrintTime {

   public static void main(String[] args) throws Exception {
      for (int i = 0; i < 1000; i++) {

         LocalDateTime localDateTime = LocalDateTime.now();
         System.out.println("It is " + localDateTime);
         Thread.sleep(2000);
      }
   }
}

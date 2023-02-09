/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inclassassignmenttwo;

/**
 *
 * @author Haris Khan
 */
import java.util.Scanner;

public class FindSmallestValue {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter the number of values: ");
      int count = input.nextInt();

      System.out.print("Enter the values: ");
      int smallest = input.nextInt();

      for (int i = 1; i < count; i++) {
         int value = input.nextInt();
         if (value < smallest) {
            smallest = value;
         }
      }

      System.out.println("The smallest value is: " + smallest);
   }
}

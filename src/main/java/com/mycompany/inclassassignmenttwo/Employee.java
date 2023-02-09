/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inclassassignmenttwo;

/**
 *
 * @author Haris Khan
 */
public class Employee {
   private String firstName;
   private String lastName;
   private double monthlySalary;

   public Employee(String firstName, String lastName, double monthlySalary) {
      this.firstName = firstName;
      this.lastName = lastName;
      if (monthlySalary > 0) {
         this.monthlySalary = monthlySalary;
      }
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setMonthlySalary(double monthlySalary) {
      if (monthlySalary > 0) {
         this.monthlySalary = monthlySalary;
      }
   }

   public double getMonthlySalary() {
      return monthlySalary;
   }
}











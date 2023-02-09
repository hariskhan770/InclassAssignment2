/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inclassassignmenttwo;

/**
 *
 * @author Haris Khan
 */
public class EmployeeTest {
   public static void main(String[] args) {
      Employee employee1 = new Employee("John", "Doe", 5000);
      Employee employee2 = new Employee("Jane", "Doe", 6000);

      System.out.println("Employee 1: " + employee1.getFirstName() + " " + employee1.getLastName());
      System.out.println("Yearly salary: $" + Math.round(employee1.getMonthlySalary() * 12));
      System.out.println();
      System.out.println("Employee 2: " + employee2.getFirstName() + " " + employee2.getLastName());
      System.out.println("Yearly salary: $" + Math.round(employee2.getMonthlySalary() * 12));
      System.out.println();

      employee1.setMonthlySalary(employee1.getMonthlySalary() * 1.1);
      employee2.setMonthlySalary(employee2.getMonthlySalary() * 1.1);

      System.out.println("After 10% raise: ");
      System.out.println("Employee 1: " + employee1.getFirstName() + " " + employee1.getLastName());
      System.out.println("Yearly salary: $" + Math.round(employee1.getMonthlySalary() * 12));
      System.out.println();
      System.out.println("Employee 2: " + employee2.getFirstName() + " " + employee2.getLastName());
      System.out.println("Yearly salary: $" + Math.round(employee2.getMonthlySalary() * 12));
   }
}


















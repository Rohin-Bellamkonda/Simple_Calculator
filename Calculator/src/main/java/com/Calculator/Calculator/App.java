package com.Calculator.Calculator;
import java.io.*;
import java.util.*;
public class App 
{
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Simple Claculator");
    System.out.printf("Enter 1 for Addition\nEnter 2 for Substraction\nEnter 3 for Multiplication\nEnter 4 for Division\nEnter 5 for Exit \n");
    while(true)
    {
      System.out.print("Enter your option : ");
      int option = sc.nextInt();
      switch(option)
      {
        case 1:
              System.out.println("Enter first number :");
              double n1=sc.nextDouble();
              System.out.println("Enter second number :");
              double n2=sc.nextDouble();
              Add a=new Add(n1,n2);
              a.add();
              break;
        case 2:
              System.out.println("Enter first number :");
              double n3=sc.nextDouble();
              System.out.println("Enter second number :");
              double n4=sc.nextDouble();
              Sub s=new Sub(n3,n4);
              s.sub();
              break;
        case 3:
              System.out.println("Enter first number :");
              double n5=sc.nextDouble();
              System.out.println("Enter second number :");
              double n6=sc.nextDouble();
              Mul m=new Mul(n5,n6);
              m.mul();
              break;
        case 4:
              System.out.println("Enter first number :");
              double n7=sc.nextDouble();
              System.out.println("Enter second number :");
              double n8=sc.nextDouble();
              Div d=new Div(n7,n8);
              d.div();
              break;
        case 5:
              sc.close();
              return;
        default:
              System.out.println("Enter valid option");
      }
    }
  }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.perez_program;
import java.util.Scanner;

/**
 *
 * @author CL2-PC
 */
public class PEREZ_PROGRAM {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int operator;
        int result;    
        
        System.out.println("Enter a Number!");
        num1 = input.nextInt();
        System.out.println("Enter a Number!");
        num2 = input.nextInt();
        
        System.out.println("Choose operator from 1 to 4");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4.Division");
        operator = input.nextInt();
  
         if (operator ==1){
            result = num1 + num2;
            System.out.println("Sum: " + result);}
            
        else if (operator ==2){
             result = num1 - num2;
             System.out.println("Diff:" + result);}
         else if (operator ==3){
             result = num1 * num2;
             System.out.println("Mul:" + result);}
          else if (operator ==4){
             result = num1 / num2;
             System.out.println("Div:" + result);}
          else {
              System.out.println("INVALID CHOOSE 1 TO 4 ");
          }
    }
}

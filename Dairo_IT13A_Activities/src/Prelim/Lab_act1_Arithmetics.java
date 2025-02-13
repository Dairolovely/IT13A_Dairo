/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prelim;

/**
 *
 * @author User
 */
public class Lab_act1_Arithmetics {
    public static void main(String[] args){
    
        int d= 10;
        int a= 4;
        int i= 6;
        
        int ROne= d*a+i;
        int RTwo=(d-a)%i;
        int RThe=(d+a+i)/3;
        int RFor=d*i-(a*a);
        
        
        System.out.println("10 * 4 + 6      =" + ROne);
        System.out.println("(10 - 4) % 6    =" + RTwo);
        System.out.println("(10 + 4 + 6)/ 3 =" + RThe);
        System.out.println("10 * 5 - (4-4)  =" + RFor);
    
    }
}

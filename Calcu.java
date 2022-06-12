/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calc;

public class Calcu {
    
    public int sum(int x,int y)
    {
       return(x+y) ;
    }
    
    public int sub(int x,int y)
    {
       return(x-y) ;
    }
    
    public int prod(int x,int y)
    {
       return(x*y) ;
    }
    
    public int div(int x,int y)
    {
       return(x/y) ;
    }
    
    public static void main(String[] args) {
       Calcu c = new Calcu();
       int result = c.sub(1,4);
       System.out.println(result);
       result = c.sum(5,4);
       System.out.println(result);
       result = c.prod(4,4);
       System.out.println(result);
       result = c.div(4,4);
       System.out.println(result);
       
    }
}

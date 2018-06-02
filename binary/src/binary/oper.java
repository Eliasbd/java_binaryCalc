/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary;

/**
 *
 * @author Nis
 */

import java.util.Scanner;

public class oper {
    public void newoper(){
        
        Scanner tec = new Scanner(System.in);
        
        
        int res= 0;
        int cos ;
        
        
        System.out.println("Ingrese numero=   ");
        
        
        cos = tec.nextInt();
        
        
        //Logica
        
        
        
        while(cos != 0){
            
            res = cos % 2;
            cos = cos / 2;
            
       
               System.out.println(res);
            
            
         
                
                
                
               
            
        }
    
    }  
}

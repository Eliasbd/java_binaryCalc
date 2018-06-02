/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary;

import java.util.Scanner;

public class home {
    public void newhome(){
        
        Scanner tec = new Scanner(System.in);
        int opc;
        
        System.out.println("Menu");
        System.out.println("1.  Decimal a Binario");
        System.out.println("2. Binario a Decimal");
        System.out.println("3. Salir");
        
        System.out.println();
        
        System.out.print("Eleccion =    ");
        opc = tec.nextInt();
        
      
        if(opc == 1){
            
            System.out.println("************************************************");
            oper callo = new oper();
            callo.newoper();
            
            
        }else if(opc == 2){
            System.out.println("************************************************");
            
            alconter callal = new alconter();
            callal.newalconter();
        }else if(opc == 3){
            System.exit(0);
        }else{
            System.out.println("Seleccion Invalida sea seerio");
                
                
            
        home callh = new home();
        callh.newhome();
        }
        
        
    }
}

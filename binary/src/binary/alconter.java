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

public class alconter {
    public void newalconter(){
        
        long bin = 0;
        long num;
        long opc = 0;
        int count = 1;
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Ingrese numero binario= ");
        num = tec.nextLong();
        
        while(num > 0){
            opc = num % 2;
            bin = bin + opc * count;
            num /= 10;
            count = count * 2;
            
        }
        
        System.out.println(bin);
    }
}

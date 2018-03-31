/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpl_6706160074_modul9_annisa3;

/**
 *
 * @author APEX
 */
public class RPL_6706160074_MODUL9_ANNISA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       java.util.Scanner pramana  = new java.util.Scanner(System.in);
        
        System.out.print("Masukkan Size : ");
        int ukuran = pramana.nextInt();
        
        for (int p = 1; p < ukuran; p+=2) {
            for (int j = 0; j < (ukuran - p - 1) / 2; j++) {
                System.out.print("0");
            }
            for (int j = 0; j < p; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        for (int p = (ukuran - 3); p > 0; p-= 2) {
            for (int j = 0; j < (ukuran - p - 1) / 2; j++) {
                System.out.print("0");
            }
            for (int j = 0; j < p; j++) {
                System.out.print("*");
            }
            System.out.println("");
        } 
    }
    
}

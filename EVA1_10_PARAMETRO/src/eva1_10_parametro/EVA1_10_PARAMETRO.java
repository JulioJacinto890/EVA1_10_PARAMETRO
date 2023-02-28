/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_10_parametro;

/**
 *
 * @author hp
 */
public class EVA1_10_PARAMETRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           nPrintLn("si",5);
    }
    public static void nPrintLn (String message,int n){
        for (int i = 0; i <= n ; i++ ) {
            System.out.println(message);
        }
        
    }
}

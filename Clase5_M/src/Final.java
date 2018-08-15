/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josef
 */
public class Final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            //System.out.println(5/0);
            System.out.println("codigo normal");
            
        } catch (Exception e) {

            System.out.println("mensaje de error");
            
        } finally {
            System.out.println("Ejecucion final");
        }

    }

}

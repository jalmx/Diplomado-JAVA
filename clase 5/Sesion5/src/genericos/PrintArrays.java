/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

/**
 *
 * @author josef
 */
public class PrintArrays {

    public static void printArray(Double a[]) {
        for (int x = 0; x < a.length; x++) {
            System.out.printf("%s ", a[x]);
        }
        System.out.println();

    }

    public static void printArray(Integer a[]) {
        for (int x = 0; x < a.length; x++) {
            System.out.printf("%s ", a[x]);
        }
        System.out.println();

    }

    public static void printArray(Character a[]) {
        for (int x = 0; x < a.length; x++) {
            System.out.printf("%s ", a[x]);
        }
        System.out.println();

    }

//    public static void printArray(Object... a) {
//        for (int x = 0; x < a.length; x++) {
//            System.out.printf("%s ", a[x]);
//        }
//        System.out.println();
//
//    }
}

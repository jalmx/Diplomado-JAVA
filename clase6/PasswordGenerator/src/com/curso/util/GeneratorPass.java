/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.util;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author josef
 */
public final class GeneratorPass {

    private GeneratorPass() {

    }

    /**
     * El método me genera todos los carácteres en minúscula
     *
     * @return carácteres en minúscula
     */
    private static String[] charactersLower() {
        StringBuilder string = new StringBuilder();

        for (char i = 'a'; i <= 'z'; i++) {
            string.append(i);
        }

        return string.toString().split("");
    }

    /**
     * El método me genera todos los carácteres en mayúscula
     *
     * @return carácteres en mayúscula
     */
    private static String[] charactersUpper() {
        String[] uppers = new String[charactersLower().length];

        for (int i = 0; i < uppers.length; i++) {
            uppers[i] = charactersLower()[i].toUpperCase();
        }

        return uppers;
    }

    private static String[] simbols() {
        return "ºª\\!|\"@#·$%&/()=?¿'¡`^*+[]¨´{}ç-_.:,;".split("");
    }

    private static String[] numbers() {
        return "0123456789".split("");
    }

    public static String generatorPassword(int time) {
        StringBuilder stringBuilder = new StringBuilder();
        Random r = new Random();

        for (int i = 0; i < time; i++) {
            stringBuilder.append(
                    charactersLower()[r.nextInt(charactersLower().length)]
            );
            stringBuilder.append(
                    charactersUpper()[r.nextInt(charactersUpper().length)]
            );
            stringBuilder.append(simbols()[r.nextInt(simbols().length)]);
            stringBuilder.append(numbers()[r.nextInt(numbers().length)]);
        }

        return stringBuilder.toString();
    }
    
    public static String generatorPasswordRandom(int lenght) {
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<String[]> characters = new ArrayList<>();
        
        characters.add(charactersLower());
        characters.add(charactersUpper());
        characters.add(simbols());
        characters.add(numbers());
        
        Random r = new Random();

        for (int i = 0; i < lenght; i++) {
            String [] list = characters.get(r.nextInt(characters.size()));
            stringBuilder.append(list[r.nextInt(list.length)]);
        }

        return stringBuilder.toString();
    }

    
}

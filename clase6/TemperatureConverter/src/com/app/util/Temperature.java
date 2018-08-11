/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.util;

/**
 *
 * @author josef
 */
public final class Temperature {
    
    private Temperature(){
        
    }
    
     public static double celsiusToFahrenheit(double celsius) {
        return (celsius * (9.0 / 5.0)) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * (5.0 / 9.0);
    }

    public static double fahrenheitToKelvin(double fahrengeit) {
        return (fahrengeit + 459.67) * 5.0 / 9.0;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin * (5.0 / 9.0)) - 459.67;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
}

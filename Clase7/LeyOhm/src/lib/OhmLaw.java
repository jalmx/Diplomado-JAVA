/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

/**
 *
 * @author josef
 */
public final class OhmLaw {

    private OhmLaw() {
    }

    public static final String UNIT_AMPER = "A";
    public static final String UNIT_VOLTAGE = "V";
    public static final String UNIT_RESISTANCE = "Ω";

    public static final String CURRENT = "Corriente";
    public static final String VOLTAGE = "Voltaje";
    public static final String RESISTANCE = "Resistencia";

    public static double calculateVoltage(double current, double resistance) {
        return current * resistance;
    }

    public static double calculateCurrent(double voltage, double resistance) {
        return voltage / resistance;
    }

    public static double calculateResistance(double voltage, double current) {
        return voltage / current;
    }
}

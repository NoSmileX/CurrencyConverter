package org.example;

import javax.swing.*;

public class CCFunction {
    public boolean check (String input){
        try {
            double x = Double.parseDouble(input);
            if (x >= 0 || x < 0);
            return true;
        }
        catch(NumberFormatException e) {
            return false;
        }
    }

    public void dollarToBtc (double mInput) {
        double btc = mInput / 21000;
        JOptionPane.showMessageDialog(null, "Кількість BTC: " + btc + " біткоїна");
    }

    public void dollarToUah (double mInput) {
        double uah = mInput * 41.1;
        JOptionPane.showMessageDialog(null, "Кількість UAH: " + uah + " грн");
    }
}

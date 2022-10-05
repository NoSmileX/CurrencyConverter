package org.example;

import javax.swing.*;

public class CCRunner {
    public static void main(String[] args) {
        CCFunction f = new CCFunction();
        Object[] option1 = {"BTC", "UAH", "Вихід"};
        Object[] option2 = {"Спробувати ще", "Вихід"};



        while (true) {
            String input = JOptionPane.showInputDialog(null, "Введіть скільки хочете обміняти $");
            System.out.println(input);

            if (f.check(input) == true) {
                double mInput = Double.parseDouble(input);

                int choice1 = JOptionPane.showOptionDialog(null, "Виберіть валюту для обміну",
                        "Обмін валют", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option1, option1[2]);

                if (choice1 == 0){
                    f.dollarToBtc(mInput);

                    int choice2 = JOptionPane.showOptionDialog(null, "Що робимо далі?", "Обмін валют",
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
                    if (choice2 == 0){

                    }else {
                        break;
                    }
                } else if (choice1 == 1) {
                    f.dollarToUah(mInput);

                    int choice2 = JOptionPane.showOptionDialog(null, "Що робимо далі?", "Обмен валют",
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
                    if (choice2 == 0){

                    }else {
                        break;
                    }
                }else {
                    break;
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Помилка! Можливо ввести тільки число.");
            }
        }
    }
}
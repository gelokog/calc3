package com.calc3;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true) {

            System.out.println("Введите уравнение: ");
            String line = in.nextLine();

            if (line.equals("")) {
                break;
            }

            try {
                String[] symbols = line.split(" ");
                if (symbols.length != 3) {
                    throw new Exception("throws Exception //т.к. строка не является математической операцией или длинее трех символов");
                }
                Num odinNumber = NumberService.parseAndValidate(symbols[0]);
                Num dvaNumber = NumberService.parseAndValidate(symbols[2], odinNumber.getType());
                String result = ActionService.calculate(odinNumber, dvaNumber, symbols[1]);
                System.out.println("Ответ: \n" + result);

            } catch (Exception e) {
                System.out.println(e.getMessage());
                break;
            }
        }


    }


}
package com.calc3;

class ActionService {
    public static String calculate(Num odin, Num dva, String action) throws Exception {

        int result;

        switch (action) {
            case "+":
                result = odin.getValue() + dva.getValue();
                break;
            case "-":
                result = odin.getValue() - dva.getValue();
                break;
            case "*":
                result = odin.getValue() * dva.getValue();
                break;
            case "/":
                result = odin.getValue() / dva.getValue();
                break;
            default:
                throw new Exception("Используйте можно только +, -, *, /");
        }

        if (odin.getType() == NumberType.ROMAN) {
            return NumberService.toRomanNumber(result);
        } else return String.valueOf(result);
    }
}


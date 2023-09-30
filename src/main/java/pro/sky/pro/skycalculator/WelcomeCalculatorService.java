package pro.sky.pro.skycalculator;

import org.springframework.stereotype.Service;

@Service
public class WelcomeCalculatorService implements CalculatorInterface{

    public String plusWelcome(int... values) {
        int num1 = Integer.parseInt(String.valueOf(values[0]));
        int num2 = Integer.parseInt(String.valueOf(values[1]));
        int Result = num1 + num2;
        return "<center><b>" + num1 + " + " + num2 + " =  " + Result + "</center></b>";

    }

    public String minusWelcome(int... values) {
        int num1 = Integer.parseInt(String.valueOf(values[0]));
        int num2 = Integer.parseInt(String.valueOf(values[1]));
        int Result = num1 - num2;
        return "<center><b>" + num1 + " - " + num2 + " =  " + Result + "</center></b>";
    }

    @Override
    public String answerWelcome(String userName) {
        return "<center><b> Добро пожаловать в калькулятор " + userName + "</b></center>";
    }

    public String multiplyWelcome(int... values) {
        int num1 = Integer.parseInt(String.valueOf(values[0]));
        int num2 = Integer.parseInt(String.valueOf(values[1]));
        int Result = num1 * num2;
        return "<center><b>" + num1 + " * " + num2 + " =  " + Result + "</center></b>";
    }

    public String divideWelcome(int num1, int num2) {
        if (num2 == 0) {
            return "Деление на 0 недопустимо";
        } else {
            return "<center><b>" + num1 + " / " + num2 + " = " + String.valueOf((float) (num1 / num2)) + "</center></b>";
        }

    }
}


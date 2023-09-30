package pro.sky.pro.skycalculator.service.api;

public interface CalculatorInterface {
    String answerWelcome(String userName);

    String multiplyWelcome(int... values);

    String divideWelcome(int num1, int num2);

    String plusWelcome(int... values);

    String minusWelcome(int... values);
}

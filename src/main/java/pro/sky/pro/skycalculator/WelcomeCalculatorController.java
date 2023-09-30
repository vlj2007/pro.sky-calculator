package pro.sky.pro.skycalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeCalculatorController {

    private final CalculatorInterface welcomeCalculatorService;
    private int num1;
    private int num2;

    public WelcomeCalculatorController(CalculatorInterface welcomeCalculatorService) {
        this.welcomeCalculatorService = welcomeCalculatorService;
        this.num1 = num1;
        this.num2 = num2;
    }

    @GetMapping
    public String welcome() {
        return "<center><b> Добро пожаловать в калькулятор </b></center>";
    }


}

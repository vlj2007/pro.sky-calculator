package pro.sky.pro.skycalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.pro.skycalculator.service.api.CalculatorInterface;

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
        return welcomeCalculatorService.welcome();
    }


    @GetMapping(path = "/calculator")
    public String answerWelcome() {
        return welcomeCalculatorService.answerWelcome();
    }

    @GetMapping(path = "/calculator/plus")
    public String plusWelcome(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return welcomeCalculatorService.plusWelcome(num1, num2);
    }

    @GetMapping(path = "/calculator/minus")
    public String minusWelcome(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return welcomeCalculatorService.minusWelcome(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiplyWelcome(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return welcomeCalculatorService.multiplyWelcome(num1, num2);
    }

    @GetMapping(path = "/calculator/divide")
    public String divideWelcome(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return welcomeCalculatorService.divideWelcome(num1, num2);

    }

}

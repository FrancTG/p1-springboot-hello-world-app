package demoapp.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public boolean isPalindrome(String palindrome) {
        if (palindrome.isEmpty()) {
            return false;
        }
        for (int i = 0; i < (int)palindrome.length() / 2; i++) {
            if (palindrome.charAt(i) != palindrome.charAt(palindrome.length()-i-1)) {
                return false;
            }
        }
        return true;
    }

    public boolean isEvenNum(int number) {
        if (number == 0) {
            return false;
        }
        return number % 2 == 0;
    }

    public boolean isSqrt(double firstNum, double secondNum) {
        if (firstNum == 0 || secondNum == 0) {
            return false;
        }
        return Math.sqrt(secondNum) == firstNum;
    }

    public double calculator(String operation) {
        double result = 0;
        if (operation.isEmpty()) {
            return 0;
        }
        operation = operation.replaceAll("\\s","");
        result = Character.getNumericValue(operation.charAt(0));
        for (int i = 2; i < operation.length(); i*=2) {
            switch (operation.charAt(i-1)) {
                case '-':
                    result = result - Character.getNumericValue(operation.charAt(i));
                    break;
                case '*':
                    result = result * Character.getNumericValue(operation.charAt(i));
                    break;
                case '/':
                    result = result / Character.getNumericValue(operation.charAt(i));
                    break;
                default:
                    result = result + Character.getNumericValue(operation.charAt(i));

            }
        }
        return result;
    }
}

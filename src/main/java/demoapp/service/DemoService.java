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
        String auxNum = "";
        char operator = 'p';

        if (operation.isEmpty()) {
            return 0;
        }

        operation = operation.replaceAll("\\s","");

        int i = 0;
        while(!isOperator(operation.charAt(i))) {
            auxNum += operation.charAt(i);
            i++;
        }
        result = Integer.parseInt(auxNum);

        while (i < operation.length()) {
            operator = operation.charAt(i);
            i++;
            auxNum = "";

            while (i < operation.length() && !isOperator(operation.charAt(i))) {
                auxNum += operation.charAt(i);
                i++;
            }

            switch (operator) {
                case '+':
                    result += Integer.parseInt(auxNum);
                    break;
                case '-':
                    result -= Integer.parseInt(auxNum);
                    break;
                case '*':
                    result *= Integer.parseInt(auxNum);
                    break;
                case '/':
                    result /= Integer.parseInt(auxNum);
                    break;
                default:
            }
        }

        return result;
    }

    boolean isOperator(char posibleOperator) {
        switch (posibleOperator) {
            case '-':
            case '+':
            case '*':
            case '/':
            case ' ':
                return true;
            default:
                return false;
        }
    }
}

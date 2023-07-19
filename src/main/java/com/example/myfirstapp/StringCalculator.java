package com.example.myfirstapp;

import java.util.Stack;

public class StringCalculator {
    // Function to evaluate the stack expression
    public static double evaluateExpression(String expression) {
        // Remove any spaces from the expression
        expression = expression.replaceAll(" ", "");

        // Create stacks to hold operands and operators
        Stack<Double> operandStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();

        // Iterate through each character in the expression
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            // If the character is a digit, parse the operand
            if (Character.isDigit(ch) || ch == '.') {
                StringBuilder operand = new StringBuilder();
                while (i < expression.length() && (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
                    operand.append(expression.charAt(i));
                    i++;
                }
                i--;
                operandStack.push(Double.parseDouble(operand.toString()));
            }
            // If the character is an operator
            else {
                // While the operator stack is not empty and the current operator has lower or equal precedence
                while (!operatorStack.isEmpty() && hasLowerPrecedence(ch, operatorStack.peek())) {
                    double operand2 = operandStack.pop();
                    double operand1 = operandStack.pop();
                    char operator = operatorStack.pop();
                    double result = performOperation(operand1, operand2, operator);
                    operandStack.push(result);
                }
                operatorStack.push(ch);
            }
        }

        // Evaluate the remaining operators in the stack
        while (!operatorStack.isEmpty()) {
            double operand2 = operandStack.pop();
            double operand1 = operandStack.pop();
            char operator = operatorStack.pop();
            double result = performOperation(operand1, operand2, operator);
            operandStack.push(result);
        }

        // The final result will be the only item left in the operand stack
        return operandStack.pop();
    }

    // Function to check if the first operator has lower or equal precedence than the second operator
    private static boolean hasLowerPrecedence(char op1, char op2) {
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;
        return true;
    }

    private static double performOperation(double operand1, double operand2, char operator) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}


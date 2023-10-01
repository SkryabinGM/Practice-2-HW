package org.example.hw0;

public class Calculate {
    private int number;
    public Calculate(int number){
        this.number= number;
    }
    public int sumOfNumbers(){
        int sumOfNumbers = 0;
        while (number>0){
            sumOfNumbers=sumOfNumbers+number %10;
            number=number/10;
        }
        return sumOfNumbers;
    }
    public boolean isPalindrome() {
        int inverted_number = 0;
        int original_number = number;
        while (number > 0) {
            int last_char = number % 10;
            inverted_number = inverted_number * 10 + last_char;
            number /= 10;
        }
        if (original_number == inverted_number) {
            return true;
        }
        else {
            return false;
        }
    }


    public void setNumber(int number) {

        this.number = number;
    }

    public int getNumber() {

        return number;
    }
}

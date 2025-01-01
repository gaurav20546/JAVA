package Saturaday_28_Exam;
interface NumberChecker
{
    boolean checkNumber(int num);
}

interface CharChecker
{
    void checkChar(char c);
}

public class cheker {

    
    public static void main(String[] args) {
        NumberChecker numberChecker = new NumberChecker() 
        {
            @Override
            public boolean checkNumber(int num) {
                return isPrime(int num);
            }
        };

     

        // Testing the CharChecker
        char testChar = 'A';
        charChecker.checkChar(testChar);
    }
}
/*
Create two new functional interfaces, NumberChecker and CharChecker.

NumberChecker Interface:

Functional Interface with a method checkNumber that takes an int parameter and returns a boolean.

CharChecker Interface:

Functional Interface with a method checkChar that takes a char parameter and returns void.

Main class:

Create an anonymous inner class to implement the checkNumber method in the NumberChecker interface. This method should determine whether a given integer is prime.

Create another anonymous inner class to implement the checkChar method in the CharChecker interface. This method should check if the ASCII value of a given character is prime.

Introduce a static method named isPrime in the Main class to handle the prime checking logic for both numbers and ASCII values. This method should take an int parameter and return a boolean.


In the main method:

Create an instance of the NumberChecker interface using an anonymous inner class and execute the checkNumber method with a
 sample integer value (e.g., 7). Print the result.

Create an instance of the CharChecker interface using an anonymous inner class and execute the checkChar method with a sample character (e.g., 'A'). Print the result.

*/
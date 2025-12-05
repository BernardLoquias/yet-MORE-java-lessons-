class Calculator {

    // write function for addition, substraction, multiplication, division, etc

    int add(int a, int b) {
        return a + b; 
    } 

    double add(double a, double b) {
        return a + b; 
    }

    int subtract(int a, int b) {
        return a - b; 
    } 

    int multiply(int a, int b) {
        return a * b; 
    } 

    int divide(int a, int b) {
        return a / b; 
    } 

    // Method Overriding -- POLYMORPHISM
    double divide(double a, double b) { 
        return a / b; 
    } 

    int modulo(int a, int b) {
        return a % b; // returns the remainder of the division 
    } 

} 

public class Math1 {
    public static void main(String[] args) {

        Calculator calc = new Calculator(); 
        
        System.out.println(calc.add(6,7)); 

        System.out.println(calc.add(6,7)); 

        System.out.println(calc.subtract(6, 7)); 
        System.out.println(calc.multiply(6, 7)); 
        System.out.println(calc.divide(6, 7)); 

        System.out.println(calc.divide(6.7, 7.6)); 
        
        System.out.println(calc.modulo(6, 7)); 
    
    }

}

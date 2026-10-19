import  java.util.Scanner;
public class Calculator{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int n1=sc.nextInt();
        System.out.print("Enter second number:");
        int n2=sc.nextInt();
        System.out.print("Enter the symbol(+,-,*,/):");
        String symbol=sc.next();
        switch(symbol){
            case "+":
                System.out.println("Addition:"+(n1+n2));
                break;
            case "-":
                System.out.println("Subtraction:"+(n1-n2));
                break;
            case "*":
                System.out.println("Multiplication:"+(n1*n2));
                break;
            case "/":
                if(n2!=0){
                    System.out.println("Division:"+(n1/n2));
                    break;
                }
                else{
                    System.out.println("Cannot divide by zero");
                    break;
                }
            default:
                System.out.println("Please enter an valid input!");
        }

    }
}
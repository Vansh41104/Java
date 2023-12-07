import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            System.out.println("Choose from 1 to 4\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
            int choice = input.nextInt();
            input.close();
            switch (choice) {
                case 1:
                    System.out.println("The Sum is : " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("The Difference is :" + (num1 - num2));
                    break;
                case 3:
                    System.out.println("The Product is :" + (num1 * num2));
                    break;
                case 4:
                    System.out.println("The Division is: " + (num1 / num2));
                    break;
            }
    }
}

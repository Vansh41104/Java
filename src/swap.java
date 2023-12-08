import java.util.Scanner;
public class swap {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        for(int i=0;i<5;i++) {
            System.out.println("Enter the Numbers");
            int a = input.nextInt();
            int b = input.nextInt();
            int temp;
            System.out.println("Number Non Swapped");
            System.out.println(a);
            System.out.println(b);
            temp = a;
            a = b;
            b = temp;
            System.out.println("Numbers Swapped");
            System.out.println(a);
            System.out.println(b);
        }
        input.close();
    }
}

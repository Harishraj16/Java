package Harish;

import java.util.Scanner;

public class flow_of_program {

    public static int hcf(int a,int b) {
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the temperature in celsius: ");
//        float tempC = input.nextFloat();
//        float tempF = (tempC * 9/5) + 32;
//        System.out.println("Temperature in Fahrenheit: " + tempF);

//        System.out.print("Enter  the year: ");
//        int year = input.nextInt();
//        if((year%4 == 0 || year%400==0) && year%100 !=0)
//        System.out.println( year + " is a leap year");
//        else System.out.println("It is not a leap year!");


//        System.out.print("Enter the two numbers 'a' and 'b' : ");
//        int a=input.nextInt();;
//        int b=input.nextInt();
//        System.out.println("Sum: "+ (a+b));

//          System.out.print("Enter the number(n): ");
//          int n = input.nextInt();
//          for (int i=1;i<=10;i++){
//              System.out.println(i + " * " + n + " = " + (i*n));
//          }

//            System.out.print("Enter the two numbers 'a' and 'b' : ");
//            int a = input.nextInt();
//            int b = input.nextInt();
//            int hcf = hcf(a,b);
//            int lcm = (a*b)/hcf;
//
//            System.out.println("HCF: "+hcf);
//            System.out.println("LCM: "+lcm);


//              int x,n=5;
//              int sum=0;
//              System.out.print("Enter the number(x): ");
//              x= input.nextInt();
//              sum+=x;
//              while(x!=n){
//                  System.out.print("Enter the number(x): ");
//                  x = input.nextInt();
//                  sum += x;
//              }
//              System.out.println("Sum: "+sum);


    }
}

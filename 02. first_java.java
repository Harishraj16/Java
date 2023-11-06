package Harish;

import java.util.Scanner;

public class first_java {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Odd or Even
//        System.out.print("Enter the number: ");
//        int n = in.nextInt();
//        if(n%2 == 0)
//            System.out.println("Even");
//        else
//            System.out.println("Odd");


        //Name input
//        System.out.print("Enter your name: ");
//        string name = in.next();
//        System.out.println("Welcome "+name+" ,happy to see you!");

        //Simple Interest
//        System.out.print("Enter the principal: ");
//        int p=in.nextInt();
//        System.out.print("Enter the time: ");
//        int t=in.nextInt();
//        System.out.print("Enter the rate: ");
//        int r=in.nextInt();
//
//        System.out.println("Simple Interest: "+ (p*t*r)/100 );


        //calculator
//          System.out.print("Enter the first number: ");
//          int a=in.nextInt();
//          System.out.print("Enter the second number: ");
//          int b=in.nextInt();
//          System.out.print("enter the operator(+,-,*,/,%): ");
//          char c=in.next().charAt(0);
//          if(c== '+')
//              System.out.println("sum: "+ (a+b));
//          else if(c== '-')
//              System.out.println("diff: "+ (a-b));
//          else if(c== '*')
//              System.out.println("product: "+ (a*b));
//          else if(c== '/')
//              if (b!=0)
//                  System.out.println("div: "+ (a/b));
//              else
//                  System.out.println("can't divide with zero");
//          else if(c== '%')
//              System.out.println("modulo : "+ (a%b));
//          else
//              System.out.println("Invalid operator");

        //Greater num
//          System.out.print("Enter the first number: ");
//          int a=in.nextInt();
//          System.out.print("Enter the second number: ");
//          int b=in.nextInt();
//          int c=a>b?a:b;
//          System.out.println("Max: "+ c);


        //Currency to USD
//          System.out.print("Enter the amount(inr): ");
//          float x=in.nextInt();
//          System.out.println("In USD: "+ 0.012 * x);


        //fibonacii series
//        System.out.print("Enter the number: ");
//        int n=in.nextInt();
//        int a=0;
//        int b=1;
//        System.out.print(a +" "+ b+ " ");
//        for(int i=3;i<=n;i++){
//            int fibo = a+b;
//            System.out.print(fibo+ " ");
//            a=b;
//            b=fibo;
//        }


        //string palindrome check
//        System.out.print("Enter the String: ");
//        String word=in.next();
//        int n=word.length();
//        boolean ispalindrome=true;
//        for(int i=0;i<n/2;i++){
//            if(word.charAt(i) != word.charAt(n-1-i)){
//                ispalindrome=false;
//                break;
//            }
//        }
//        if(ispalindrome)
//            System.out.println("Palindrome!");
//        else
//            System.out.println("Not a Palindrome!");

         //Armstrong Numbers btw two numbers
        System.out.print("Enter the first number: ");
        int a=in.nextInt();
        System.out.print("Enter the second number: ");
        int b=in.nextInt();
        for (int i=a;i<=b;i++){
            if(isArmstrong(i))
                System.out.print(i+" ");
        }

    }

    public static boolean isArmstrong(int num) {
        int originalnum=num,remainder,result=0;
        int n=String.valueOf(num).length();
        while(originalnum != 0){
            remainder = originalnum%10;
            result += Math.pow(remainder,n);
            originalnum /= 10;
        }
        return result == num;
    }
}

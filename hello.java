
import java.util.Scanner;


public class hello{
    public static void main(String[] args) {
        Scanner DT = new Scanner(System.in);
        int n = DT.nextInt();
      //  int b = DT.nextInt();
       // int a = DT.nextInt();

       // AddTwoNum(a, b);
       // IfGreaterThanZero(n);
       // MultiTable(n);
       // ReverseNum(n);
       // System.out.println(CountDigit(n));
       // sumOfDigit(n);
    //    ValueOfNum(n);
    //    System.out.println("Is Prime: "+IsPrime(n));
        // System.out.println(IsPalindromeString(n));
           System.out.println(IsArmstrong(n));

       

       
       
           }


           public static boolean IsArmstrong(int n){
            int a=n;
            int rem, sum=0;
            int digits = String.valueOf(n).length();
            while (a>0) {
                rem = a%10;
                sum += Math.pow(rem, digits);
                a=a/10;
            }


        if (sum==n) {
            return true;
        }
        return false;
           }




           public static boolean IsPalindromeString(int n){
            String Original = String.valueOf(n);
            String reversed = new StringBuilder(Original).reverse().toString();
            return Original.equals(reversed);
           }



           public static boolean IsPalindrome(int n){
            if (n < 0) {
                return false;
            }
            int original = n;
            int reversed = 0;
            while (n>0) {
                int LD= n%10;
                reversed= reversed*10 +LD;

                n = n/10;
            }return original==reversed;
           }


           public static void PrintFibonacci(int n){
            int a=0, b=1;
            System.out.print(a+", "+b);
            for (int i = 2; i < n; i++) {
               int next = a+b;
               System.out.print(", "+ next);

               a = b;
               b = next;
            }
           }



           public static boolean IsPrime(int n){
            if (n==0) {
                return false;
            }else{
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n%i==0) {
                        return false;
                        
                    }
                }
            }
            return true;
           }



           public static void ValueOfNum(int n){
            if (n> 0) {
                System.out.println("Positive");
            }else if (n<0) {
                System.out.println("Negative");
            }else{
                System.out.println("Zero");
            }
           }



           public static void PrintNumber(int a,int z){
            int o=0;
            if (z>=a) {
                for (int i = a; i <= z; i++, o++) {
                    System.out.print(i+" ");
                    
                    if (o == 10) {
                        System.out.println();
                        o =0;
                    }
                }
            }else{
                for (int i = a; i >= z; i--, o++) {
                    System.out.print(i+" ");

                    if (o == 10) {
                        System.out.println();
                        o =0;
                    }
                }
            }
            
           }

           public static int factorial(int n){
            
                if (n==1|| n==0) {
                    return 1;
                }
                return factorial(n-1)*n;
            }
           

           


           public static boolean IsLeapYear(int n){
            if (n %400==0 || (n%4==0 && n%100!=0 )) {
                return true;
            }else{
                return false;
            }
           }



           static void sumOfDigit(int n){
            int a= n;
            int c=0;
            while (a!=0) {
                int b= a%10;
                a=a/10;
                c=c+b;
            }
            System.out.println(c);
           }


           static void EvenOrOdd(int n){
            if (n%2==0){
                System.out.println("Even");
            }else{
                System.out.println("Odd");
            }
           }






           static int CountDigit(int n){
            if (n ==0)  return 1;

            int a = Math.abs(n);
           
            int c = 0;
            while (a!=0) {
                a = a/10;


                c=c+1;
            }
            return c;
           }






           static void ReverseNum(int n){
            int a =n;
            int c = 0;

            
            while (a!=0) {
                int b = a%10;
                a = a/10;

                c= (c*10)+b;
            }
            
            System.out.println(c);

           }


        static void MultiTable(int n){
            int a;
            for (int i = 1; i <= 10; i++) {
               a=  n*i;
               System.out.println(n+" | x | "+i+" | = | "+a+"|");
               System.out.println("----------------");
            }
        }
       
       
           static void IfGreaterThanZero(int n){
        if (n > 0) {
            System.out.println("Yes It is "+ n);
        }
        else{
            System.out.println(n+" :It is not >0 ");
        }
    }


    static void AddTwoNum(int a, int b) {
        // code to be executed
        System.out.print("Write Number A: ");
        
        
        System.out.print("Write Number B: ");
        


        System.out.println("Total is "+ (a+b));
      }
}
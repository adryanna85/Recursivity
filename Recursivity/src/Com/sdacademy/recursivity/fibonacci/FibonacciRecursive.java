package Com.sdacademy.recursivity.fibonacci;
import java.util.Scanner;

public class FibonacciRecursive {
    static int n1=0,n2=1,n3=0,i=2;
    static int element9=0;
    static void printFibonacci(int count){
        if(count>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            i++;
            if (i==9)
                element9=n3;

            printFibonacci(count-1);

        }
    }
    public static void main(String args[]){
        int count=12;
       /* Scanner scanner= new Scanner(System.in);
        System.out.println("Introduceti n>=11 ");
        int count=scanner.nextInt();*/
        System.out.print(n1+" "+n2);//printing 0 and 1
        printFibonacci(count-2);//n-2 because 2 numbers are already printed
        System.out.println();
        System.out.println("Al 9-lea element din fibonacci este " + element9);
    }
}
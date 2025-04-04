package assignment_4;

import java.util.Scanner;

public class loop_2{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("input number: ");
        int n=scanner.nextInt();
        System.out.print("dispart: ");
        int p=scanner.nextInt();
        scanner.close();

        System.out.println("\nnumber: "+n);

        for(int i=1; i<=n; i++){
            System.out.print(i+" ");
            if(i%5==0){
                System.out.println();
            }
        }

        System.out.println("\n--------------------");
        System.out.println("dispart: "+p);

        for(int i=1; i<=n; i++){
            System.out.print(i+" ");
            if(i%p==0){
                System.out.println();
            }
        }
    }
}

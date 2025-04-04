package assignment_4;

import java.util.Scanner;

public class loop_1{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("input number: ");
        int n=scanner.nextInt();
        scanner.close();

        System.out.println("number: "+n);
        
        int result=1;
        for(int i=1; i<=n; i++){
            if(i==1){
                result=i;
            }else{
                System.out.println(result+" x "+i+" = "+(result*i));
                result *=i;
            }
        }
    }
}

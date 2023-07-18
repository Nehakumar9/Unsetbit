package unsetbit;

import java.util.Scanner;

public class UnsetBit {

	public static int unSet(int A, int B){
        return ((A & (1<<B)) == 0) ? A : (int)(A - Math.pow(2,B));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the A-th Bit :");
        int A=sc.nextInt();
        System.out.println("Enter the B-th Bit :");
        int B=sc.nextInt();
        int val=unSet(A,B);
        System.out.println("The value is :"+val);
    }

}

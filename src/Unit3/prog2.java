package Unit3;

import java.util.Scanner;

public class prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][]=new int [2][3];
        int b[][]=new int [2][3];
        System.out.println("Enter elements of first array");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of 2nd array");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Addition matrix is : ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++) {
                System.out.print(a[i][j]+b[i][j]+" ");
            }
            System.out.println();
        }
    }
}

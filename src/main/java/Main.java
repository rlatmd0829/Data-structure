


import java.util.Scanner;


public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();

        System.out.println(A*(Character.getNumericValue(str.charAt(2))));
        System.out.println(A*(str.charAt(1)-'0'));
        System.out.println(A*(str.charAt(0)-'0'));
        System.out.println(A*(Integer.parseInt(str)));
    }
}


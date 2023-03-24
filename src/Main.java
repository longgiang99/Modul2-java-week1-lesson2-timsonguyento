//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("nhap vao 1 so");
//        int number = scanner.nextInt();
//        if (number < 2){
//            System.out.println(number+ " khong phai snt");
//        }
//        else {
//            int i = 2;
//            boolean check = true;
//            while (i <= Math.sqrt(number)){
//                if (number % i == 0 ){
//                    check = false;
//                    break;
//                }
//                i++;
//            }
//            if ( check)
//                System.out.println(number+ "la snt");
//            else System.out.println(number+ "khong phai snt");
//        }
//
//    }
//}

import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao 1 so nguyen duong");
        int num = scanner.nextInt();
        if (check(num)){
            System.out.println(num + "la so nguyen to");
        } else {
            System.out.println(num + " khong phai so nguyen to");
        }


    }
    public static boolean check(int num){
        if ( num < 2){
            return false;
        }
        for (int i = 2; i <= num/2; i++ ){
            if( num % i == 0){
                return false;
            }
        }
        return true;
    }
}

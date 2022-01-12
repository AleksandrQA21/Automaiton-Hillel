package PracticeLesson4;

import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
//        for (int i = 1; i <= 100 ; i++) {
//            if (i % 7 == 0){
//                System.out.print(i);
//                System.out.print(" ");
//            }
//        }

//        int i = 0;
//
//        while (i <= 10) {
//            System.out.print(i);
//            System.out.print(" ");
//            i++;
//        }


//        do {
//            i++;
//            System.out.print(i);
//            System.out.print(" ");
//        } while (i < 10);

        Scanner sc = new Scanner(System.in);
        int expectednumber = sc.nextInt();
        int[] arr = new int []{10,11,12,13,14,15,16,17,18,19,20};
        boolean result = false;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == expectednumber) {
                result = true;
            }
        }System.out.println(result);
    }
}

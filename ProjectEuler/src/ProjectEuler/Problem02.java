/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectEuler;

/**
 *
 * @author Lenovo
 */
public class Problem02 {
    // Even Fibonacci numbers

    public static void main(String[] args) {

        int no1 = 1;
        int no2 = 2;
        int no3 = 0;
        int sum = 0;

//        System.out.println(no1);
//        System.out.println(no2);
        
        for (int i = 0; i <= 4000000; i++) {
            if (i % 2 == 0) {
                sum += i;
                no3 = no1 + no2;
//            System.out.println(no3);
                no1 = no2;
                no2 = no3;
//                System.out.println(no3);
//                sum += no3;
            }
        }
        System.out.println(sum);
    }
}

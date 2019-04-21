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
public class Problem00s {

    public static void main(String[] args) {

        System.out.print("The 1st solution : ");
        problem01();

        System.out.println("");

        problem02();

        System.out.println("");

    }
        // Multiples of 3 and 5
    static void problem01() {

        int sum = 0;
        for (int no = 0; no < 1000; no++) {
            if (no % 3 == 0 || no % 5 == 0) {
                sum += no;
            }
        }
        System.out.println(sum);
    }

    static void problem02() {
        int no1 = 1;
        int no2 = 2;
        int no3 = 0;
        int sum = 0;

        for (int i = 0; i <= 4000000; i++) {
            if (i % 2 == 0) {
                sum += i;
                no3 = no1 + no2;
                no1 = no2;
                no2 = no3;
            }
        }
        System.out.println(sum);
    }
    
    static void problem03(){}
    
    
}

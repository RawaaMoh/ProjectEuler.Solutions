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
public class Problem003 {
    // Largest prime factor

    public static void main(String[] args) {

        long no = 600851475143L; // L for beeing too large
//        int no = 13195;
        
        for (int i = 2; i <= no; i++) {
            while (no % i == 0) {
                System.out.println(i);
                no /= i;
            }
        }
    }
}

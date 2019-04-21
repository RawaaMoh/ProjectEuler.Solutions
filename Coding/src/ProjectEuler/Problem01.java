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
public class Problem01 {
    // Multiples of 3 and 5
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int sum = 0;

        for (int no = 0; no < 1000; no++) {
            if (no % 3 == 0 || no % 5 == 0) {
                sum += no;
            }
        }
        System.out.println(sum);

    }
}
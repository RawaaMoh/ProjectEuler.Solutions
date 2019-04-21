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
public class Problem005 {
    // Smallest multiple

    public static void main(String[] args) {

        int no = 0;
        for (int i = 1; i <= 10; i++) {
            for (int j = i; j <= 10; j++) {
                if (j % i == 0) {
                    no = i * j;
                }
            }
        }
        System.out.println(no);
    }

}

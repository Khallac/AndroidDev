/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author katie
 */
import java.util.Scanner;
public class Input {
    public static void main (String []args){
        Scanner input = new Scanner (System.in);
        int number = input.nextInt();
        System.out.println(number);
        input.close();
        

    }
}

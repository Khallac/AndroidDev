/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author katie
 */
public class LogicalOperator {
    public static void main(String []args){
        int num1 = 1, num2 = 2, num3 = 9;
        boolean result;
        result = (num1 > num2)||(num3 > num1);
        System.out.println(result);
        result = (num1 > num2)&&(num3 > num1);
        System.out.println(result);
        
        
    }
    
}

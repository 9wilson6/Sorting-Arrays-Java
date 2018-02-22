/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingarray;

import java.util.Arrays;

/**
 *
 * @author wilson
 */
public class SortingArray {
                
    /**          
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int tempVar, num;
String numbersString;
int[] numbers = {4, 11, 13, 12, 17, 35, 15, 7, 19, 3, 45};

for (int i = 0; i < numbers.length; i++) {
    for (int j = i; j < numbers.length; j++) {
        if (numbers[i] > numbers[j]) {
            tempVar = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = tempVar;
        }
    }
}

numbersString = Arrays.toString(numbers);

System.out.println(numbersString);
        
//        for (int i = 0; i < num.length; i++) {
//           
//            System.err.println(num2[i]);
//        }
    }
    
}

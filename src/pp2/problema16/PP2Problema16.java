/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema16;

import java.util.Scanner;

/**
 *
 * @author Enano
 */
public class PP2Problema16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Resolución
        print(getInf());
    }
    public static int[] getInf()
    {
        int[] numbers=new int [3];
        for(int i=0;i<numbers.length;i++)
        {
            Scanner in =new Scanner (System.in);
            System.out.println("Ingrese el número "+(i+1)+" :");
            numbers[i]=in.nextInt();            
        }
        return numbers;
    }
    public static void print (int[]numbers) //Cabe mencionar que hay una función Math. que hace esto, Math.max. 
    {                                       //el código sería Math.max(numbers[2], Math.max(numbers[0],numbers[1]));
        if(numbers[0]>numbers[1] && numbers[0]>numbers[2])  //Se comparan los números
        {
            System.out.println("El primer número ["+numbers[0] + "] es el número más alto");
        }
        else
        {
            if(numbers[1]>numbers[0] && numbers[1]>numbers[2]) //Se comparan los números
            {
                System.out.println("El segundo número ["+numbers[1] + "] es el número más alto");
            }
            else
            {
                if(numbers[2]>numbers[0] && numbers[2]>numbers[1]) //Se comparan los números
                {
                    System.out.println("El tercer número ["+numbers[2] + "] es el número más alto");
                }
            }
        }
    }
    
}

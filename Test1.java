/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diceroller;

public class PathfinderStatRoll {
    public static int[] main(String[] args){
        int [] rolls = new int [4];
        for (int i=0; i<4; i++){
            rolls[i] = (int) (1 + (Math.random()*6));  //This populates "rolls" with four random numbers
            System.out.print("  " + rolls[i]);         //This displays the four numbers on one line
            
            if(i==3)
                System.out.println(" ");  // This is my naive way of doing a carriage return
        }
        
        int min = 6; //This will hold the smallest of the four rolls, to be deducted from total.
        for (int i2=0; i2<4; i2++){  //This loop finds the smallest roll.
            if(rolls[i2] < min)
                min = rolls [i2];
        }
        
        int sum = 0;
        for (int i3=0; i3<4; i3++){ //This loop adds the four numbers;
            sum += rolls[i3];
        }
        sum -= min;  //Subtract the minimum;
        
        System.out.print("  " + sum);
        
        
        
              
    return rolls ;
    }
    
}
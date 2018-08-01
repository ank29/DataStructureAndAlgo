/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fundsindia
 */
public class CrossAndDotProduct {
   public static int[] crossProduct(int[] first,int[] second){
       int[] result = new int[3];
       result[0] = first[1]*second[2] - first[2]*second[1];
       result[1] = first[0]*second[2] - first[2]*second[0];
       result[2] = first[0]*second[1] - first[1]*second[0];
    return result;
    }
   public static int dotProduct(int[] first,int[] second){
     int result =0;
     for(int i = 0;i< first.length;i++){  
         result = result +first[i]*second[i];
     }
     return result;
    }
    public static void main(String args[]){
     int[] first = { 3, -5, 4 };
     int[] second = { 2, 6, 5 };
     int[] result = crossProduct(first,second);
     int result2 = dotProduct(first,second);
     System.out.println("Cross Product is ::"+result[0]+" "+result[1]+" "+result[2]);
     System.out.println("Dot Product is ::"+result2);
    
    }
}

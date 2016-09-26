/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonus.java.assignment;

/**
 *
 * @author Aleaya
 */
public class BonusJavaAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        int j;
        int temp; 
        int a[] = new int[5];
        a[0] = 5;
        a[1] = 2;
        a[2] = 8;
        a[3] = 1;
        a[4] = 4;
        //a[5] = 7;
        
        for (i = 0; i < 5; i++)
        {
            for (j = 1; j < (5- i); j++)
            {
                if (a[j-1] > a[j])
                {
                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int x = 0; x < 5; x++)
        {
            System.out.println(a[x]);
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitsumchallenge;

public class DigitSumChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println( sumDigits(111));
    }
    public static int sumDigits(int number)
    {
        int sum=0;
        int lsd=0;
        if(number<=9)
        {
            return -1;
        }
        else
        {
            while(number>0)
            {
            lsd=number%10;
            sum=sum+lsd;
            number=number/10;
            }
return sum;        }
    }
    
}

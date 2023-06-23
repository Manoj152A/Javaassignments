package com.weekendassignments.tasks;
/*Write a Java program to find if the given number
 is palindrome or not*/

public class Q18 {
    public static void main(String[] args) {
        /*1.Read the input =236
        * 2.Make sure that the input is not zero.
        * 3.if the input is 001 we need to remove the first zeros(what ever the zeros are)
        *4.349 */
        int number=222;
        boolean isPalindrome = isPalindrome(number);
        if (isPalindrome){
            System.out.println(number+".....is a plaindrome");
        }else{
            System.out.println(number+"....is not a plaindrome");
        }

    }
    public static boolean isPalindrome(int number){
        String strNumber=Integer.toString(number);
        int length=strNumber.length();
        for (int i = 0; i <length/2; i++) {
            if (strNumber.charAt(i)!=strNumber.charAt(length-1-i)){
                return false;
            }

            
        }
        return true;
    }


}

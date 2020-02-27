/*
 * Shawn Phung
 * Feb 25, 2020
 * Determmines if the user input contains any palindromes. Diplays them and the amount of palindromes there are
 */

package palindrome2_java;
import javax.swing.JOptionPane;
/**
 *
 * @author shphu0697
 */
public class Palindrome2_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Prommpts user wiht input
        String input = JOptionPane.showInputDialog("Enter in a sentence, without any punctiation");
        String reverse = ""; //Reverse of user input
        String reverseCheck = ""; //String used to check whether the reverse is a palindrome or not
        String end = ""; //The palindrome input (if applicable)
        int numPal = 0; //Number of palindromes present
        //Compares the user input letter by letter
        for (int i = input.length() - 1; i >= 0; i--){
            if(input.charAt(i) != ' '){
            reverse = reverse + input.charAt(i);        
        }
        //Checks for the end of the user word
        if (i == 0 || input.charAt(i) == ' '){
            for (int u = reverse.length() - 1; u >= 0; u--){
                //Sets up a String to test the reverse string, by getting the forward of it
                reverseCheck = reverseCheck + reverse.charAt(u);
            }
        //Change both the test String and the reverse String to lower case 
        reverse = reverse.toLowerCase();
        reverseCheck = reverseCheck.toLowerCase();
        //Compares reverse and forward Strings
            if (reverseCheck.equals(reverse)){
                numPal++;
                end = end + reverseCheck + ",";
            }
        //Resets Strings to blank to ready up for the next word           
            reverse = "";
            reverseCheck = "";
        }    
    }
        //Output message depending on whether there is a palindrome or not
        if(numPal == 0){
            JOptionPane.showMessageDialog(null, "There are no palindromes");
        }
        else{
            JOptionPane.showMessageDialog(null, "There are " + numPal + " palindrome(s) \nThe palindrome(s): " + end);
        }
}
}
        
    
    


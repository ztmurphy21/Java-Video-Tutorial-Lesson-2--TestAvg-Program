
package testaverage;
import java.util.Scanner;


/**
 *
 * @author Zachary Murphy
 */
public class TestAverage {

    public static void main(String[] args) {
        //scanner object
        Scanner keyboard = new Scanner(System.in);
        
        //get user name
        System.out.println("Please enter your name");
        String name = keyboard.next();
        
        //output to welcome user
        System.out.println("Welcome to TestAverage Calculator. ");
        
        //get score #1
        System.out.println("Please enter Test Score #1:");
        int scoreOne = keyboard.nextInt();
        
        //get score #2
        System.out.println("Please enter Test Score #2:");
        int scoreTwo = keyboard.nextInt();
        
        //get score #3
        System.out.println("Please enter Test Score #3:");
        int scoreThree = keyboard.nextInt();
        
        //calculate the average of the three scores
        int total = scoreOne + scoreTwo + scoreThree;
        int avg = total/3;
        
        System.out.println(name + " your averga score is " + avg + " %.");
        
        
        
        
    }
    
}

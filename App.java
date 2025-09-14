//The way this quiz game works is that it will ask the user a question (in this case on the show One Piece)
//Then based on the user's answer it will tell them if it is correct or incorrect.
//Every time the user gets the answer correct it will add one point to the score variable that keeps track of the user's score out of 3 points.
import java.util.Scanner;
public class App {
    public static void main(String[] args){
        int score = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Who is the main character of One Piece");
        String questionone = "Luffy";
        String answer1 = sc.nextLine();
        if (answer1.equals(questionone)) {
            System.out.println("Correct!");
            score = score +1;
        }
        else{
            System.out.println("Incorrect!");
        }
        System.out.println("Who is the second in command to Luffy?");
        String questiontwo = "Zoro";
        String answer2 = sc.nextLine();
        if (answer2.equals(questiontwo)) {
            System.out.println("Correct!");
            score = score +1;
        }
        else{
            System.out.println("Incorrect!");
        }
        System.out.println("Who do the straw hats fight in Wano");
        String questionthree = "Kaido";
        String answer3 = sc.nextLine();
        if (answer3.equals(questionthree)) {
            System.out.println("Correct!");
            score = score +1;
        }
        else{
            System.out.println("Incorrect!");
        }
        System.out.println("Your final score is " + score + "/3 points!");
    }
    }

//What I learned: I learned that simply doing "==" between the answer and question variables won't work as it doesn't actually check if they are equal so it will always return incorrect. I had to use .equals instead to make it actually check.
//A second thing I learned was (though I kind of already knew this) if you do a variable equal to itself + 1, you can add points to the variable using if/else statments really easily!
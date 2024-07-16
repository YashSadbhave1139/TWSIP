import java.util.Scanner;

public class OnlineVotingSystem {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Initialize variables to keep track of the vote count
        int partyAVotes = 0;
        int partyBVotes = 0;

        // Get the user's name
        System.out.print("Please enter your name: ");
        String userName = input.nextLine();

        // Get the user's age
        System.out.print("Please enter your age: ");
        int userAge = input.nextInt();

        // Check if the user is eligible to vote
        if (userAge >= 18) {
            // Present the user with a list of parties to vote for
            System.out.println("Please select a party to vote for:");
            System.out.println("1. Party A");
            System.out.println("2. Party B");

            // Get the user's selection
            int userSelection = input.nextInt();

            // Increment the vote count for the selected party
            if (userSelection == 1) {
                partyAVotes++;
                System.out.println("Thank you for voting for Party A, " + userName + "!");
            } else if (userSelection == 2) {
                partyBVotes++;
                System.out.println("Thank you for voting for Party B, " + userName + "!");
            } else {
                System.out.println("Invalid selection. No vote recorded.");
            }
        } else {
            // Display a message to the user if they are not eligible to vote
            System.out.println("I'm sorry, " + userName + ", you are not eligible to vote.");
        }

        // Display the final vote count
        System.out.println("\nFinal Vote Count:");
        System.out.println("Party A: " + partyAVotes + " votes");
        System.out.println("Party B: " + partyBVotes + " votes");
    }
}
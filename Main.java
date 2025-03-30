import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
    // array for the candidates names
    String [] candidates = {"Obama", "Joe", "Trump"};
    // array to hold the number of votes
    int[] votes = {0, 0, 0};

    //scanner to get the users input
    try (Scanner scanner = new Scanner(System.in)) {
        // Asking the user who they want to vote for
        System.out.println("Wich Candidate do you want to vote for:");
        System.out.println("Obama");
        System.out.println("Joe");
        System.out.println("Trump");

        //using a while loop to repeat the voting proccess
        while (true) {
            // asking the user to input a number to chose an option
            System.out.println("Choose an option");
            System.out.println("1. Vote for a candidate");
            System.out.println("2. Display the reults");
            System.out.println("3. Reset the votes");
            System.out.println("4. EXIT");
            // user inputs a number between 1 and 4
            int choice = scanner.nextInt();
            //blank line
            scanner.nextLine();

            //using a switch to run the users pick of choice
            switch (choice) {
                // choice one lets the user 
                case 1:
                    System.out.println("Enter the candidate Name you want to vote for");
                    String candidateName = scanner.nextLine();
                    CastVote(candidateName);
                    break;
                case 2:
                    DisplayResults();
                    break;
                case 3:
                    ResetVotes();
                    break;
                case 4:
                    return;
            }
        }
    }
  }
  public static void CastVote(String candidateName) {
    for (int i = 0; i < candidates.length; i++){
        if (candidates{i}).
    }

  }
  public static void DisplayResults() {
    System.out.println("Voting Results:");
    for (int i = 0; i < candidates.length; i++) {
        System.out.println(candidates[i] + ": " + votes[i] + " votes");
    }
}
  public static void ResetVotes() {
    for (int i = 0; i < votes.length; i++) {
        votes[i] = 0;
    }
    System.out.println("All votes have been reset.");
  }
}
import java.util.Scanner;  // Import the Scanner class

class Main {
      // array for the candidates names
      public static String [] candidates = {"Obama", "Joe", "Trump"};
      // array to hold the number of votes
      public static int[] votes = {0, 0, 0};
  public static void main(String[] args) {
    //scanner to get the users input
    try (Scanner scanner = new Scanner(System.in)) {

        //using a while loop to repeat the voting proccess
        while (true) {
                  // Asking the user who they want to vote for
        System.out.println("Wich Candidate do you want to vote for:");
        System.out.println("Obama");
        System.out.println("Joe");
        System.out.println("Trump");
      
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
  // Method to vote for a candidate
  public static void CastVote(String candidateName) {
    if (candidateName.equals(candidates[0])) {
        votes[0]++;
        System.out.println("Vote casted for " + candidates[0]);
    } else if (candidateName.equals(candidates[1])) {
        votes[1]++;
        System.out.println("Vote casted for " + candidates[1]);
    } else if (candidateName.equals(candidates[2])) {
        votes[2]++;
        System.out.println("Vote casted for " + candidates[2]);
    } else {
        System.out.println("Invalid candidate name. Please try again.");
    }
}
  //method to display the results of the voting
  public static void DisplayResults() {
    System.out.println("Voting Results:");
    for (int i = 0; i < candidates.length; i++) {
        System.out.println(candidates[i] + ": " + votes[i] + " votes");
    }
}
// method to reset the voting 
  public static void ResetVotes() {
    for (int i = 0; i < votes.length; i++) {
        votes[i] = 0;
    }
    System.out.println("All votes have been reset.");
  }
}
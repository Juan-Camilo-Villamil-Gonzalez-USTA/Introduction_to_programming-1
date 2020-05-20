package usta.sistemas;

public class Main {
    // AUTHOR: lUIS FERNANDO CASTELLANOS
    // DATE:  2020-MAY-05
    // DESCRIPTION:There are 123 municipalities and each municipality will vote for 0-NO, 1-YES (the votes will be random numbers between 0 and 5000).
    public static int[][] matrix_votes=new int[10][2];
    public static int winner;   //column 0 (no) or 1 (yes)
    public static int loser;   //column 0 (no) or 1 (yes)

    public static void main(String[] args) {
	    f_menu();
	    f_fill_matrix();
	    f_show_winner();
	    f_show_row_winner();
	    f_show_all_votes();
    }

    public static void f_menu() {
        //DESCRIPTION: This method show the initial menu and returns the total competitors
        System.out.println("╔════════════════════════════╗");
        System.out.println("║  SoftVotesClubsAndBars     ║");
        System.out.println("║ Maker:LuisFdo Castellanosg ║");
        System.out.println("║ Date: 2020-may-19          ║");
        System.out.println("╚════════════════════════════╝");
    }
    public static void f_fill_matrix(){
        //DESCRIPTION: this method fill the matrix
        for (int i=0; i<matrix_votes.length;i++){
            matrix_votes[i][0]= (int) Math.floor((Math.random()*5000)+1); //votes by  NOT
            matrix_votes[i][1]= (int) Math.floor((Math.random()*5000)+1); // votes by YES
        }
    }
    public static void f_show_winner(){
        //DESCRIPTION: this method show the winner
        int total_yes=0, total_not=0;
        for (int i=0; i<matrix_votes.length;i++){
            total_not+=matrix_votes[i][0];
            total_yes+=matrix_votes[i][1];
        }
        if(total_not==total_yes){
            System.out.println("YES and NOT are same= "+total_not);
            winner=-1;
        }else if(total_not>total_yes){
            System.out.println("The winner is the NOT :"+total_not+" and the loser is YES :"+total_yes +" con el %"+(total_not*100/(total_not+total_yes)));
            winner=0;
            loser=1;
        }else{
            System.out.println("The winner is the YES :"+total_yes+" and the loser is NOT :"+total_not+" con el %"+(total_yes*100/(total_not+total_yes)));
            winner=1;
            loser=0;
        }
    }
    public static void f_show_row_winner(){
        //description: this you must view the rows that have the most voted for the winner and those that least
        int more_votes_winner=matrix_votes[0][winner], more_votes_winner_row=0;
        int more_votes_loser=matrix_votes[0][loser], more_votes_loser_row=0;

        for (int i=0; i< matrix_votes.length;i++){  //to walk the matrix | row to row

            if (more_votes_winner<matrix_votes[i][winner]){
                more_votes_winner=matrix_votes[i][winner];
                more_votes_winner_row=i;
            }
            if (more_votes_loser<matrix_votes[i][loser]){
                more_votes_loser=matrix_votes[i][loser];
                more_votes_loser_row=i;
            }

        }
        System.out.println(" the municipality whit the more votes by winner was :"+(more_votes_winner_row+1)+" total votes: "+more_votes_winner);
        System.out.println(" the municipality whit the more votes by loser was :"+(more_votes_loser_row+1)+" total votes: "+more_votes_loser);
    }
    public static void f_show_all_votes(){
        //description: this methods show the all votes
        System.out.println(" NO | YES");
        for (int i=0; i<matrix_votes.length;i++){
            System.out.println(matrix_votes[i][0]+" | "+matrix_votes[i][1]);
        }
    }
}

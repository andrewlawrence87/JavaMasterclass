public class Main {
    public static void main(String[] args) {

String playerName = "Andrew";
int playerScore = 1500;
int playerPosition;

playerPosition=calculateHighScorePosition(playerScore);
displayHighScorePosition(playerName,playerPosition);

playerName = "Jeff";
playerScore = 900;

        playerPosition=calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName,playerPosition);

        playerName = "Jeff";
        playerScore = 400;


        playerPosition=calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName,playerPosition);

        playerName = "Jeff";
        playerScore = 50;

        playerPosition=calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName,playerPosition);

    }

    public static void displayHighScorePosition(String player, int position){
        System.out.println(player + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score){
        if(score > 1000){
            return 1;
        }
        if (score >500 && score <1000){
            return 2;
        }
        if (score > 100 && score <500){
            return 3;
        }
        return 4;
    }
}

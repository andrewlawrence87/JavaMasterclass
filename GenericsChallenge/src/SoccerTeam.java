/**
 * Created by Andrew on 14-May-18.
 */
public class SoccerTeam extends Teams {

    private String teamName;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public SoccerTeam(int noplayers, int score, String teamName) {
        super(noplayers, score);
        this.teamName = teamName;
    }

    @Override
    public int compareTo(Teams team) {
        if (this.getScore() < team.getScore()){
            return -1;
        }
        else if (this.getScore() == team.getScore()){
            return 0;
        }
        else return 1;
    }
}

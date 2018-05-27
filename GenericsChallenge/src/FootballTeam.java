/**
 * Created by Andrew on 14-May-18.
 */
public class FootballTeam extends Teams {

    public FootballTeam(int noplayers, int score, String teamName) {
        super(noplayers, score);
        this.teamName = teamName;
    }

    private String teamName;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public int compareTo(Teams team) {
        if (this.getNoplayers() < team.getNoplayers()){
            return -1;
        }
        else if (this.getNoplayers() == team.getNoplayers()){
            return 0;
        }
        else return 1;
    }
}

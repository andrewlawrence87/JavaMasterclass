import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Andrew on 14-May-18.
 */
public class LeagueTable<T extends Teams> {

    private ArrayList<T> leagueTable = new ArrayList<>();

    public void addTeam(T team){
        leagueTable.add(team);
        Collections.sort(leagueTable);
    }

    public void printTeam(){
        for(T team: leagueTable){
            System.out.println(team.getScore());
        }
    }


}

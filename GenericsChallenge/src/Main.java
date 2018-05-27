/**
 * Created by Andrew on 14-May-18.
 */
public class Main {

    public static void main(String[] args){

        SoccerTeam scullys = new SoccerTeam(5,10,"Scully");

        SoccerTeam heaters = new SoccerTeam(6,8,"Heater");

        FootballTeam paintings = new FootballTeam(7,11,"Paintings");

       LeagueTable leage = new LeagueTable();

        leage.addTeam(scullys);
        leage.addTeam(heaters);
        leage.addTeam(paintings);

        leage.printTeam();

    }
}

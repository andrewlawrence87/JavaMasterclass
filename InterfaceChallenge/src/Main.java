/**
 * Created by Andrew on 09-May-18.
 */
public class Main {



public static void main(String[] args){
    ISaveable warrior = new Warrior();
    ISaveable monster = new Monster();



    warrior.readValues();
    warrior.writeValues();

    monster.readValues();
    monster.writeValues();


}


}

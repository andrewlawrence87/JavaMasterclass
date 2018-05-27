import java.util.ArrayList;

/**
 * Created by Andrew on 09-May-18.
 */
public interface ISaveable {

    ArrayList<String> inventory = new ArrayList<>();

    void writeValues();

    ArrayList<String> readValues();

    String toString();

}



import java.util.Scanner;

/**
 * Created by Andrew on 26-May-18.
 */
public class Main {
    public static void main(String[] args){

        System.out.println("Enter the number");
        X x = new X(X());
        x.x();
    }

    private static int X(){
        Scanner x = new Scanner(System.in);
        return x.nextInt();
    }
}

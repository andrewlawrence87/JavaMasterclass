/**
 * Created by Andrew on 14-May-18.
 */
public abstract class Teams implements Comparable<Teams> {

    int noplayers;
    int score;
/*
         * Compares this object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
     *
     * */

    public Teams(int noplayers, int score) {
        this.noplayers = noplayers;
        this.score = score;
    }

    public int getNoplayers() {
        return noplayers;
    }

    public void setNoplayers(int noplayers) {
        this.noplayers = noplayers;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public abstract int compareTo(Teams team);




}

package valmx.nelly.studienfahrtapp.containers;

import java.util.Date;
import java.util.List;

public class Day {

    private final Date date;
    private final List<Card> programmPunkte;

    public Day(Date date, List<Card> programmPunkte) {
        this.date = date;
        this.programmPunkte = programmPunkte;
    }

    public Date getDate() {
        return date;
    }

    public List<Card> getProgrammPunkte() {
        return programmPunkte;
    }
}
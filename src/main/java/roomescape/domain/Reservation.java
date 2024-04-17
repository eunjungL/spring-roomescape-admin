package roomescape.domain;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reservation {

    private final int id;
    private final String name;
    private final LocalDate date;
    private final LocalTime time;

    public Reservation(int id, String name, LocalDate date, LocalTime time) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public LocalTime getTime() {
        return time;
    }
}

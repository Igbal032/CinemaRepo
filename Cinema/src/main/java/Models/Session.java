package Models;

import java.util.Collection;
import java.util.Date;

enum SessionType {
    MORNING,
    NOON,
    NIGHT
}

public class Session {
    private int id;
    private SessionType type;
    private Collection<Movie> movies;
    private Date startTime;
    private Date endTime;
    private double priceIndex;
    private Collection<Room> rooms;
}

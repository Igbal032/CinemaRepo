package Models;

import java.util.Collection;

enum RoomType {
    STANDARD,
    VIP,
    PREMIUM,
    SUPER
}

public class Room {
    private int id;
    private String name;
    private RoomType type;
    private double width;
    private double height;
    private int countOfRows;
    private int countOfColumns;
    private Collection<Seat> seats;
    private CinemaScreen screen;
}

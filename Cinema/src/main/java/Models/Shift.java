package Models;

public enum Shift {
    REGULAR("08:00", "20:00"),
    NIGHT("20:00", "08:00");

    public String starShift;
    public String endShift;

    Shift(String starShift, String endShift) {
        this.starShift = starShift;
        this.endShift = endShift;
    }
}

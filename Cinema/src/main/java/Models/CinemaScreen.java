package Models;

//Pervin
public class CinemaScreen {
    private final double widthMeters;
    private final double lengthMeters;
    private final double width;
    private final double length;
    private final String model;

    public CinemaScreen(double widthMeters, double lengthMeters, double width, double length, String model) {
        this.widthMeters = widthMeters;
        this.lengthMeters = lengthMeters;
        this.width = width;
        this.length = length;
        this.model = model;
    }

    public double getWidthMeters() {
        return widthMeters;
    }

    public double getLengthMeters() {
        return lengthMeters;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public String getModel() {
        return model;
    }
}

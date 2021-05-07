package Models;
//Valeh

public class Seat {
    private int seatNumber;
    private int column;
    private int row;
    private boolean isFree;
    private boolean isForCouples;

    public Seat(int seatNumber, int column, int row, boolean isFree, boolean isForCouples) {
        this.seatNumber = seatNumber;
        this.column = column;
        this.row = row;
        this.isFree = isFree;
        this.isForCouples = isForCouples;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public boolean isForCouples() {
        return isForCouples;
    }

    public void setForCouples(boolean forCouples) {
        isForCouples = forCouples;
    }
}

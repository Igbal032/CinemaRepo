//Valeh

public class Seat {
    private int column;
    private int row;
    private boolean isFree;

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

    public Seat(int column, int row, boolean isFree) {
        this.column = column;
        this.row = row;
        this.isFree = isFree;
    }
}

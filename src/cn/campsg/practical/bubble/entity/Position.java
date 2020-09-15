package cn.campsg.practical.bubble.entity;
public class Position  implements Cloneable  {
    private int row,column;
    public Position(int row,int colum){
        this.row=row;
        this.column=colum;
    }
    public Position(){

    }
    public int getColumn() {
        return column;
    }
    public int getRow() {
        return row;
    }
    public void setRow(int row) {
        this.row = row;
    }
    public void setColumn(int colum) {
        this.column = colum;
    }

    @Override
    public String toString() {
        return
                "(" + row +
                        "," + column +
                        ')';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Position position = (Position) o;

        if (getRow() != position.getRow()) return false;
        return this == position;
    }


}

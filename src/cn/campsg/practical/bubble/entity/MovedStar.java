//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package cn.campsg.practical.bubble.entity;

import cn.campsg.practical.bubble.entity.Star.StarType;

public class MovedStar extends Star {
    private Position movedPosition = null;

    public MovedStar() {
        this.movedPosition = new Position();
    }

    public MovedStar(Position position, StarType type, Position movedPosition) {
        super(new Position(position.getRow(), position.getColumn()), type);
        this.movedPosition = movedPosition;
    }

    public Position getMovedPosition() {
        return this.movedPosition;
    }

    public void setMovedPosition(Position movedPosition) {
        this.movedPosition = movedPosition;
    }

    public String toString() {
        int orowNum = this.getPosition().getRow();
        int ocolNum = this.getPosition().getColumn();
        int rowNum = this.getMovedPosition().getRow();
        int colNum = this.getMovedPosition().getColumn();
        return "(" + orowNum + "," + ocolNum + ")->" + "(" + rowNum + "," + colNum + ")";
    }
}

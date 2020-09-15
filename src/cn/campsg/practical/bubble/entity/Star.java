package cn.campsg.practical.bubble.entity;

import java.util.Objects;

public class Star implements Cloneable  {


    public enum StarType {
        BLUE(0),  GREEN(1),  YELLOW(2),  RED(3),  PURPLE(4);
        private int value = 0;
        public int value() {
            return this.value;
        }
        StarType(int value){
            this.value=value;
        }
        public static StarType valueOf(int value){
            return switch (value) {
                case 0 -> BLUE;
                case 1 -> GREEN;
                case 2 -> YELLOW;
                case 3 -> RED;
                case 4 -> PURPLE;
                default -> null;
            };
        }
    }
    private Position position = null;
    private StarType starType = null;
    public Position getPosition() {
        return position;
    }
    public StarType getType() {
        return starType;
    }
    public void setPosition(Position position) {
        this.position = position;
    }
    public void setType(StarType starType) {
        this.starType = starType;
    }

    public Star(){
        this.position = new Position();
        this.starType = StarType.BLUE;
    }
    public Star(Position position,StarType starType){
        this.position=position;
        this.starType=starType;
    }
    @Override
    public String toString() {
        return
                position.toString() +
                        "-" + starType
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Star star = (Star) o;

        if (!getPosition().equals(star.getPosition())) return false;
        return this == star;
    }

    @Override
    public int hashCode() {
        return 0;
    }


}

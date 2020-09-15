//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package cn.campsg.practical.bubble.entity;

import java.util.ArrayList;

public class StarList extends ArrayList<Star> {
    private static final long serialVersionUID = 1L;

    public StarList() {
    }

    public Star findout(int row, int column) {
        for(int i = 0; i < super.size(); ++i) {
            Star star = (Star)super.get(i);
            if (star != null && star.getPosition().getRow() == row && star.getPosition().getColumn() == column) {
                return star;
            }
        }

        return null;
    }

    private Star findout(Position position) {
        return this.findout(position.getRow(), position.getColumn());
    }

    public boolean isexisted(Star star) {
        if (star == null) {
            return false;
        } else {
            Star ret = this.findout(star.getPosition());
            return ret != null;
        }
    }

    public int indexOf(int row, int column) {
        int base = (int)Math.sqrt((double)this.size());
        return row * base + column;
    }

    public void setNull(int row, int column) {
        Star star = this.findout(row, column);
        int seq = this.indexOf(star);
        if (seq >= 0) {
            this.set(seq, (Star) null);
        }
    }

    public void update(int orow, int ocolumn, int row, int column) {
        Star ostar = this.findout(orow, ocolumn);
        this.setNull(orow, ocolumn);
        ostar.setPosition(new Position(row, column));
        this.set(this.indexOf(row, column), ostar);
    }

    public Star lastElement() {
        int size = this.size();
        return size == 0 ? null : (Star)this.get(size - 1);
    }

    public String toString() {
        StringBuffer date = new StringBuffer("·");

        for(int seq = 0; seq < this.size(); ++seq) {
            Star star = (Star)this.get(seq);
            if (star != null) {
                int orowNum;
                if (star instanceof MovedStar) {
                    MovedStar movedStar = (MovedStar)star;
                    orowNum = movedStar.getPosition().getRow();
                    int ocolNum = movedStar.getPosition().getColumn();
                    int rowNum = movedStar.getMovedPosition().getRow();
                    int colNum = movedStar.getMovedPosition().getColumn();
                    date.append("(" + orowNum + "," + ocolNum + ")->" + "(" + rowNum + "," + colNum + ")" + "\t");
                } else {
                    int rowNum = star.getPosition().getRow();
                    orowNum = star.getPosition().getColumn();
                    date.append("(" + rowNum + "," + orowNum + "-" + star.getType() + ") \t");
                }
            } else {
                date.append("(null) \t\t");
            }

            if ((seq + 1) % 10 == 0) {
                date.append("\n");
            } else {
                date.append(" ,");
            }
        }

        date.deleteCharAt(date.length() - 1);
        return date.toString();
    }
}

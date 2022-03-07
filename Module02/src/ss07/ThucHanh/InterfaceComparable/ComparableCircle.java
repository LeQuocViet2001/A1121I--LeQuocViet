package ss07.ThucHanh.InterfaceComparable;

import ss06.BaiTap.Circle;

public class ComparableCircle extends Circle  implements Comparable<ComparableCircle> {

    public ComparableCircle() {
    }


    public ComparableCircle(double r) {
        super(r);
    }

    public ComparableCircle(double r, String color) {
        super(r, color);

    }


    @Override
    public int compareTo(ComparableCircle o) {
       if(  getR() > o.getR() ) return  1;
       else if( getR() < o.getR()  ) return  -1;
       else return 1;
    }
}

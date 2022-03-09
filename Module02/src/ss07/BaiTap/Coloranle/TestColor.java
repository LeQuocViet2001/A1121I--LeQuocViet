package ss07.BaiTap.Coloranle;

import ss06.ThucHanh.Shape;
import ss07.BaiTap.ITFResizeable.Rectangle;

public class TestColor {

    public static void main(String[] args) {


        Shape arr[] = new Shape[3];
        arr[0] = new Square(4);
        arr[1] = new Circle();
        arr[2] = new Square(7.5);

        for (int i =0 ; i<3  ;i++){

               if( arr[i] instanceof Colorable ) {
                   Colorable t = (Colorable)arr[i];
                   System.out.println("Arr[" + i + "]: " );
                   t.howToColor();
               }

        }


    }
}

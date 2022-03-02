package ss06.BaiTap;

import java.util.Arrays;

public class Point2D {

    private float x = 0f;
    private float y = 0f;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void setXY( float x , float y){
        this.x =x;
        this.y =y;

    }


    private float [] getXY(){
       float [] z = { this.x, this.y  };
        return z;
    }

    @Override
    public String toString() {
      //  return  "( " + this.x  + ',' + this.y +  " )" ;
   return Arrays.toString( this.getXY());
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}

package ss06.BaiTap;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Point3D extends  Point2D {

    private  float z = 0f;

    public Point3D(){

    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public  Point3D( Point2D b, float z){
        super(b.getX(), b.getY());
        this.z =z;


    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }


    public void setXYZ(float x, float y, float z){

        super.setXY(x,y);
        this.z =z;
    }

    public float [] getXYZ(){


        float [] r = { super.getX(), super.getY(), this.z };
        return r;
    }

    @Override
    public String toString() {
        return Arrays.toString( this.getXYZ());
    }
}

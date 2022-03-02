package ss06.BaiTap;

import java.util.Arrays;

public class MovablePoint extends Point2D {

    private  float xSpeed = 0f;
    private  float ySpeed = 0f;

    public MovablePoint(float xSpeed, float ySpeed) {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(){

    }

    public void  seSpeed( float xp, float yp){
        this.xSpeed = xp;
        this.ySpeed = yp;

    }

    public float [] getSpeed(  ){
        float [] rs = {this.xSpeed, this.ySpeed};

        return  rs;

    }


    @Override
    public String toString() {
        return super.toString() + " ,speed= " + Arrays.toString(getSpeed());
    }

    public  MovablePoint move(){
        super.setXY(  this.getX() + this.xSpeed,
                      this.getY() + this.ySpeed);
       return this;

    }



    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
}

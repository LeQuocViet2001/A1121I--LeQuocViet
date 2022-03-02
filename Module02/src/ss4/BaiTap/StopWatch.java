package ss4.BaiTap;

import java.sql.Time;
import java.time.LocalDateTime;

public class StopWatch {
     private double starTime, endTime;

    public double getStarTime() {
        return starTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public StopWatch(double starTime, double endTime) {
        this.starTime = starTime;
        this.endTime = endTime;
    }




}

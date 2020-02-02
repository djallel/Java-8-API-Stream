package Java8Streams;
import java.math.*;
import java.util.ArrayList;

public class CodinGameClosestToZero {

    public static void main(String[] args) {
        double[] nums= new double[100];;
        nums[0] = 273l;
        nums[1] = -273l;
        nums[2] = 5526l;
        nums[3] = 3;
        nums[4] = 22l;
        nums[5] = -22l;
        closestToZero(nums);
    }

        static double closestToZero(double[] ts) {
            if (ts.length == 0) return 0;

            double closest = ts[0];
            for (double i : ts) {
                double abs = Math.abs(i);
                double absClosest = Math.abs(closest);
                if (abs < absClosest) {
                    closest = i;
                } else if (abs == absClosest && closest < 0) {
                    closest = i;
                }
            }
            return closest;
        }

}




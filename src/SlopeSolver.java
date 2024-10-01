import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class SlopeSolver {
    private double x1;
    private double x2;
    private double y1;
    private double y2;
    private double x3;

    SlopeSolver(double x1, double x2, double y1, double y2)
    {
        x1 = this.x1;
        x2 = this.x2;
        y1 = this.y1;
        y2 = this.y2;
    }

    public double slope()
    {
        double slope = (y2 - y1) / (x2 - x1);
        return slope;
    }

    public double yIntercept()
    {
        double slope = (y2 - y1)/(x2 - x1);
        double yIntercept = y1 - slope*x1;
        return yIntercept;
    }

    public double distance()
    {
        double distance = sqrt(pow((x2-x1),2) + pow((y2-y1),2));
        return distance;
    }



    public String toString()
    {
        String str = "First pair: " + "(" + x1 + "," + y1 + ")\n";
        str += "Second pair: " + "(" + x2 + "," + y2 + ")\n";
        str += "Slope of the line: " + slope() + "\n";
        str += "Y-intercept: " + yIntercept() + "\n";
        str += "Slope-int form: y = " + (y2-y1) + "/" + (x2-x1) + "x" + " + " + yIntercept() + "\n";
        str += "Distance between points: " + distance();


        return str;
    }


}

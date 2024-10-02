import java.text.DecimalFormat;
import java.text.NumberFormat;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;


public class SlopeSolver {
    private double x1;
    private double x2;
    private double y1;
    private double y2;
    private double x3;
    private double slope;



    NumberFormat formatter = new DecimalFormat("#0.00");

    SlopeSolver(double x1, double x2, double y1, double y2)
    {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }


    public String slope()
    {
        double slope = (y2 - y1) / (x2 - x1);
        if(slope == (int)Math.round(slope))
        {
            String wow = String.valueOf((int)Math.round(slope));
            return wow;
        }
        else
            return (y2-y1) + "/" + (x2-x1);
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
        String str = "First pair: " + "(" + (int)Math.round(x1) + "," + (int)Math.round(y1) + ")\n";
        str += "Second pair: " + "(" + (int)Math.round(x2) + "," + (int)Math.round(y2) + ")\n";
        str += "Slope of the line: " + slope() + "\n";
        str += "Y-intercept: (" + (int)Math.round(yIntercept()) + ", 0)" + "\n";
        str += "Slope-int form: y = " + slope() + "x" + " + " + yIntercept() + "\n";
        str += "Distance between points: " + formatter.format(distance());

        return str;
    }

    public String pointFinder()
    {
        String point = "hi";
        return point;
    }

}

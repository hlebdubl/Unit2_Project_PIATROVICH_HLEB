public class SlopeSolver {
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private double x3;

    SlopeSolver(int x1, int x2, int y1, int y2)
    {
        x1 = this.x1;
        x2 = this.x2;
        y1 = this.y1;
        y2 = this.y2;
    }

    public double Slope()
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

    public String toString()
    {
        String str = (" " + Slope() + " " + yIntercept());




        return str;
    }


}

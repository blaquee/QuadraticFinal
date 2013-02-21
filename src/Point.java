
public class Point
{
    private double x;
    private double y;
    
    public Point()
    {
        x=y=0;
    }
    
    @Override
    public String toString()
    {
        return "(" + x + " , " + y + ")";
    }
    public Point(double x1, double y1)
    {
        x = x1;
        y = y1;
    }
    
    public double getX()
    {
        return x;
    }
    
    public double getY()
    {
        return y;
    }
    
    public void setX(double x1)
    {
        x = x1;
    }
    
    public void setY(double y1)
    {
        y = y1;
    }
    
    public void print()
    {
        System.out.println( "(" + x + "," + y + " )" );
    }
    
    public double area()
    {
        return 0;
    }
}
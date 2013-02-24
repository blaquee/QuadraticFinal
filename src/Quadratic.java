

public class Quadratic
{
    private double a,b,c;
    private double x,y;
    Point vertex;

    public Quadratic()
    {
    }
    
    public Quadratic(double a1, double b1, double c1)
    {
        a = a1;
        b = b1;
        c = c1;
    }

    public double getA()
    {
        return a;
    }

    public double getB()
    {
        return b;
    }

    public double getC()
    {
        return c;
    }


    public void setA(double a)
    {
        this.a = a;
    }

    public void setB(double b)
    {
        this.b = b;
    }

    public void setC(double c)
    {
        this.c = c;
    }

    
    
    /**
     *
     * @return returns the Point of symmetry
     */
    public Point calcVertex()
    {
        //get x value formula
        x = (-b)/ (2.0*a);
        //get y value formula y=c-b^2/4a
        y = c - Math.pow(b, 2) / 4.0 * a;
        vertex = new Point(x,y);
        return vertex;
    }
    
    /**
     *
     * @param positive
     * @return
     */
    public double roots(boolean positive)
    {
        double res;
        if(positive)
        {
            res = (-b + ( Math.sqrt( Math.pow(b, 2) - 4 * a * c) ) ) / (2.0 * a);
            return res;
        }
        else
        {
            res = (-b - ( Math.sqrt( Math.pow(b, 2) - 4 * a * c) ) ) / (2.0 * a);
            return res;
        }
         
    }   
    
    /**
     *
     * @return
     */
    public int checkDiscriminate()
    {
        double dis = (Math.pow(b, 2) - (4 * a * c));
        if( dis < 0 )
        {
            return -1;
        }
        else if( dis == 0){
            return 0;
        }
        else
        {
            return 1;
        }
    }
}
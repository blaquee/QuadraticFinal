
import java.awt.Graphics;
import javax.swing.JPanel;

public class JPanelGraph extends JPanel
{
    public JPanelGraph()
    {
        
    }
    
        
    public int getY(int x)
    {
        return ( x*x + (6*x) + 5 );
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        g.drawString("HEllo GrAPH! LULZ", 10, 20);
        /*for( int x = -5; x <= -1; ++x )
        {
            g.drawLine(x, getY(x), x+1, getY(x+1) );
        }*/
    }
}
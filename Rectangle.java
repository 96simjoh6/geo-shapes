
import java.awt.Graphics;

public class Rectangle extends GeoShape implements Comparable{
    protected int sideA, sideB;
    
    public Rectangle(int a, int b){
	
	super();
	sideA = a;
	sideB = b;
	
    }
    
    @Override
    public double calcArea(){
	return sideA * sideB;
    }
    
    @Override
    public void drawShape(Graphics g){
	g.drawRect(posX, posY, sideA, sideB);
    }
    /*
    @Override
    public int compareTo(Comparable o) {
	if ( this.calcArea() < (GeoShape)o.calcArea() ){
	    return -1;
	}
	    
	if ( this.calcArea() > (GeoShape)o.calcArea() ){
	    return 1;
	} else {
	    return 0;
	}
    }
    */

    @Override
    public int compareTo(Comparable o) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

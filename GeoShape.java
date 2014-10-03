
import java.awt.Graphics;

public abstract class GeoShape {

    int posX, posY;
    double area;
    
    public GeoShape(){
	this.posX = 0;
	this.posY = 0;
	this.area = calcArea();
	
    }
    
    public abstract double calcArea();
    public abstract void drawShape( Graphics g );
    public void setPos(int x, int y){
	posX = x;
	posY = y;
    }
}

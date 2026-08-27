package ar.edu.unq.po2.tp3;

public class Punto {
   private Float x;
   private Float y;
   public Punto(Float x, Float y) {
	super();
	this.setXY(x,y);
   }
   public void setXY(float x,float y ) {
	   this.setY(x);
	   this.setY(y);
   }
   public Float getX() {
	return x;
   }
   public void setX(Float x) {
	this.x = x;
   }
   public Float getY() {
	return y;
   }
   public void setY(Float y) {
	this.y = y;
   }   
}

package ch6Q;
class Circle{
	
	int x;
	int y;
	int radius;
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public boolean equals(Object obj) {
if(x==((Circle)obj).getX() && y==((Circle)obj).getY()){
	
	return true;
}
		
		
		return false;
	}
	@Override
	public String toString() {
		return "Circle("+x+","+y+")반지름"+radius;
	}
	
	
}
public class N2 {
public static void main(String[] args) {
	
	Circle a = new Circle(2,3,5);
	Circle b = new Circle(2,3,30);
	System.out.println("원 a는"+a);
	System.out.println("원 b는"+b);
	if(a.equals(b))
		System.out.println("같음");
	else
		System.out.println("다름");

}	
}

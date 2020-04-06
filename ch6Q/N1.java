package ch6Q;
class MyPoint{
	
	int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	int b;
	
	 public MyPoint(int a, int b) {
			this.a = a;
			this.b = b;
		}
	
	 @Override
	public String toString() {
		return "POINT ("+a+","+b+")";
	}

@Override
public boolean equals(Object obj) {

	if(a==((MyPoint)obj).getA() && b==((MyPoint)obj).getB()){
		return true;
	}
	
	
	return false;
}
	 
	 
	 
}
public class N1 {

	
	
	public static void main(String[] args) {
		
		
		
		MyPoint p = new MyPoint(3,50);
		MyPoint q = new MyPoint(4,50);
		System.out.println(p);
		if(p.equals(q)){
			System.out.println("같음");
		}else System.out.println("다름");
	}
	
	
	
	
}

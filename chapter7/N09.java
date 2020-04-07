package chapter7;

import java.util.Vector;

interface IStack<t>{
	t pop();
	boolean push(t ob);
	
}
class MyStack <e> implements IStack{
	public Vector<e> ev = new Vector<>();
	
	@Override
	public Object pop() {
		
		
		ev.remove(ev.size()-1);
		return ev.elementAt(ev.size()-1) ;
	}

	@Override
	public boolean push(Object ob) {
		
		ev.add((e)ob);
		
		return false;
	}
	
}


public class N09  {
	public static void main(String[] args) {
		
		IStack<Integer> stack =  new MyStack<Integer>();
		for(int i=0 ;  i<10 ; i++)stack.push(i);
		while(true){
			
			Integer n = stack.pop();
			if(n==null)break;
			System.out.print(n+" ");
		}
		
		
		
		
	}


}

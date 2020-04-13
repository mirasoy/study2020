package Control;

public class DeleteCont implements Controller{

	public DeleteCont() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void service() {
		
		int idx = listview.idxnumber();
		if(idx==-1){return;}
		dao.delete(idx);
		
	}

}

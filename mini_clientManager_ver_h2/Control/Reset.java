package Control;

public class Reset implements Controller {

	public Reset() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void service() {
		nameField.setText(null);
		phoneField.setText(null);
		mailField.setText(null);
		
		
		
	}

}

package Control;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Model.Member;

public class Inputcont implements Controller {

	@Override
	public void service() {
		
		String name = nameField.getText();
		String mail = mailField.getText();
		String phone = phoneField.getText();
		
		if(name.equals("")||mail.equals("")||phone.equals(""))
		{JOptionPane.showMessageDialog(null, "항목을 모두 입력하세요");
		return;}
		
		Member dto = new Member();
		dto.setName(name);
		dto.setMail(mail);
		dto.setPhone(phone);
		dao.insert(dto);
		
		
	}
	
	

}

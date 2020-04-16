package EventHandler;

import static Resources.R.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Control.Inputcont;
import View.ButtonView;
import View.InputView;

public class BteveHandler implements ActionListener {

	ButtonView target;

	public BteveHandler(ButtonView target) {

		this.target = target;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {
			JButton btn = (JButton) e.getSource();
			if (btn == target.allB) {
				listcont.service();

			}
			if (btn == target.searchB) {
				searchcont.service();
			}
			if (btn == target.cancleB) {

			}
			if (btn == target.delB) {
				deletecont.service();
				listcont.service();
			}
			if (btn == target.inputB) {
//
					inputcont.service();
					listcont.service();
					reset.service();

			}

		}

	}

}
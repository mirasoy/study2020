package Resources;

import java.util.Vector;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Control.DeleteCont;
import Control.Inputcont;
import Control.ListCont;
import Control.Reset;
import Control.SearchCont;
import Model.Dao;
import View.InputView;
import View.ListView;

public interface R {
//	Vector<String> columnNames = new Vector<>(); 
	
	DefaultTableModel dm = new DefaultTableModel(10,4);
//		InputvView inputview =  new InputvView();
	Object[] colnames = {"번호","이름","메일","전화번호"};
	Dao dao = new Dao();
	ListView listview = new ListView(dm, colnames);
	ListCont listcont =  new  ListCont(); 
	Inputcont inputcont = new Inputcont();
	SearchCont searchcont =  new SearchCont(); 
	DeleteCont deletecont =  new DeleteCont() ;
	Reset reset = new Reset(); 
	JTextField nameField = new JTextField(15);
	JTextField mailField = new JTextField(15);
	JTextField phoneField = new JTextField(15);
	InputView iv = new InputView();
	
}

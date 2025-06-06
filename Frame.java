package Jollibed2;




import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;



public class Frame extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private MenuControl menuControl;
    JButton btnFoods,btnDrinks,btnOthers ,CheckOut_Btn;
    
	//Drinks Drinkbtn;
  
	public Frame() {
		
		//Main_Menu = JPanel
		//CheckOut = JPanel
		//Reciept = JPanel
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1350, 770);
	    menuControl = new MenuControl();
	   
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Main_Menu = new JPanel();
		Main_Menu.setBounds(59, 78, 367, 623);
		contentPane.add(Main_Menu);
		Main_Menu.setLayout(null);
		
		btnFoods = new JButton("FOOD");
		btnFoods.setBackground(new Color(255, 255, 255));
		btnFoods.setBounds(24, 555, 85, 46);
		Main_Menu.add(btnFoods);
		btnFoods.addActionListener(this);
		
		
		btnDrinks = new JButton("DRINKS");
		btnDrinks.setBackground(Color.WHITE);
		btnDrinks.setBounds(139, 555, 85, 46);
		Main_Menu.add(btnDrinks);
		btnDrinks.addActionListener(this);
		
		
		btnOthers = new JButton("OTHERS");
		btnOthers.setBackground(Color.WHITE);
		btnOthers.setBounds(253, 555, 85, 46);
		Main_Menu.add(btnOthers);
		btnOthers.addActionListener(this);
		
		
		
		Main_Menu.add(menuControl.getFoods().getc1());
		Main_Menu.add(menuControl.getFoods().getc2());
		Main_Menu.add(menuControl.getFoods().getc3());
		Main_Menu.add(menuControl.getFoods().getc4());
		Main_Menu.add(menuControl.getFoods().getc5());
		Main_Menu.add(menuControl.getFoods().getc6());

	        // Add drink buttons
		
		Main_Menu.add(menuControl.getDrinks().getD1());
		Main_Menu.add(menuControl.getDrinks().getD2());
		Main_Menu.add(menuControl.getDrinks().getD3());
		Main_Menu.add(menuControl.getDrinks().getD4());
		Main_Menu.add(menuControl.getDrinks().getD5());
		Main_Menu.add(menuControl.getDrinks().getD6());
		
		Main_Menu.add(menuControl.getOthers().geto1());
		Main_Menu.add(menuControl.getOthers().geto2());
		Main_Menu.add(menuControl.getOthers().geto3());
		Main_Menu.add(menuControl.getOthers().geto4());
		Main_Menu.add(menuControl.getOthers().geto5());
		Main_Menu.add(menuControl.getOthers().geto6());
		
		menuControl.showFoods(true);
	    menuControl.showDrinks(false);
	   menuControl.showOthers(false);
		
		// for the Checkout panel
	    
		JPanel CheckOut = new JPanel();
		CheckOut.setLayout(null);
		CheckOut.setBounds(478, 78, 367, 623);
		contentPane.add(CheckOut);
		
		CheckOut_Btn = new JButton("CHECKOUT");
		CheckOut_Btn.setBackground(new Color(255, 255, 255));
		CheckOut_Btn.setForeground(Color.BLACK);
		CheckOut_Btn.setBounds(109, 557, 153, 39);
		CheckOut.add(CheckOut_Btn);
		
		JPanel Reciept = new JPanel();
		Reciept.setLayout(null);
		Reciept.setBounds(904, 78, 367, 623);
		contentPane.add(Reciept);
		
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object source = e.getSource();
				
		if(source == btnFoods ) {
			 menuControl.showFoods(false);
			 menuControl.showDrinks(true);
			 menuControl.showOthers(false);
			
			
		}else if(source == btnDrinks) {
			
			 menuControl.showFoods(true);
			 menuControl.showDrinks(false);
			 menuControl.showOthers(false);
			
			
			
		}else if(source == btnOthers ) {
			
			
			 menuControl.showFoods(false);
			 menuControl.showDrinks(false);
			 menuControl.showOthers(true);
			
		}
		
		
	}
}

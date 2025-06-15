package Jollibed2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import java.awt.Font;



  public class Frame extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private MenuControl menuControl;
    JButton btnFoods,btnDrinks,btnOthers ,CheckOut_Btn;
    private DefaultListModel<String> selectedItemsModel;
    private JList<String> selectedItemsList;
    private JButton Remove_btn;
    
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
		Main_Menu.setBounds(67, 78, 367, 623);
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
		
	   menuControl.showFoods(false);
	   menuControl.showDrinks(true);
	   menuControl.showOthers(false);
		
		// for the Checkout panel
	    
		JPanel CheckOut = new JPanel();
		CheckOut.setLayout(null);
		CheckOut.setBounds(478, 78, 367, 623);
		contentPane.add(CheckOut);
		
		  // JList to display selected items
        selectedItemsModel = new DefaultListModel<>();
        selectedItemsList = new JList<>(selectedItemsModel);
        JScrollPane scrollPane = new JScrollPane(selectedItemsList); 
        selectedItemsList.setFont(new Font("Arial", Font.BOLD, 14));
        selectedItemsModel.addElement(String.format("%-20s %10s", "PRODUCT", "PRICE"));
        scrollPane.setBounds(15, 15, 339, 400);
        CheckOut.add(scrollPane);
       
        
        
		CheckOut_Btn = new JButton("CHECKOUT");
		CheckOut_Btn.setBackground(new Color(255, 255, 255));
		CheckOut_Btn.setForeground(Color.BLACK);
		CheckOut_Btn.setBounds(45, 555, 132, 39);
		CheckOut.add(CheckOut_Btn);
		
		Remove_btn = new JButton("REMOVE");
		Remove_btn.setForeground(Color.BLACK);
		Remove_btn.setBackground(Color.WHITE);
		Remove_btn.setBounds(187, 555, 132, 39);
		CheckOut.add(Remove_btn);
		

		JPanel Reciept = new JPanel();
		Reciept.setLayout(null);
		Reciept.setBounds(904, 78, 367, 623);
		contentPane.add(Reciept);
		
		
		
		ImageIcon originalIcon = new ImageIcon("C:\\JAVA.JOLLIBED\\Pictures\\Jollibed logo.png");
		Image originalImage = originalIcon.getImage();

		// Resize the image
		Image resizedImage = originalImage.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		ImageIcon resizedIcon = new ImageIcon(resizedImage);

		// Create JLabel for the logo
		JLabel Logo = new JLabel();
		Logo.setIcon(resizedIcon);
		Logo.setBounds(62, -28, 150, 150); // Match label size to resized image

		contentPane.add(Logo);

		// Refresh UI to ensure the JLabel displays properly
		contentPane.revalidate();
		contentPane.repaint();
		
		
		    menuControl.getDrinks().getD1().addActionListener(this);
	        menuControl.getDrinks().getD2().addActionListener(this);
	        menuControl.getDrinks().getD3().addActionListener(this);
	        menuControl.getDrinks().getD4().addActionListener(this);
	        menuControl.getDrinks().getD5().addActionListener(this);
	        menuControl.getDrinks().getD6().addActionListener(this);

		
		
		
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
			
		}else if (source == menuControl.getDrinks().getD1()) {
            selectedItemsModel.addElement(" Siken 1                       400$");
        } else if (source == menuControl.getDrinks().getD2()) {
            selectedItemsModel.addElement(" Siken 2                       240$");
        } else if (source == menuControl.getDrinks().getD3()) {
            selectedItemsModel.addElement(" Siken 3                       100$");
        } else if (source == menuControl.getDrinks().getD4()) {
        	selectedItemsModel.addElement(" Siken 3                        60$");
        } else if (source == menuControl.getDrinks().getD5()) {
        	selectedItemsModel.addElement(" Siken 3                        70$");
        } else if (source == menuControl.getDrinks().getD6()) {
            selectedItemsModel.addElement(" Siken 6                        25$");
        };
		
        
		
	}
	
}

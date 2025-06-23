package Jollibed2;
import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Foods{


	private JButton c1,c2,c3,c4,c5,c6;
	
	
	public  Foods() {
		
		
		ImageIcon Chicken1 = new ImageIcon("C:/JAVA.JOLLIBED/Pictures/chicken 1.png");
	    Image imgckn1 = Chicken1.getImage();
	    Image ScaledImg_ckn1 = imgckn1.getScaledInstance(130,130, Image.SCALE_SMOOTH);
		
	    
	    
	    c1 = new JButton(new ImageIcon(ScaledImg_ckn1));
		c1.setBounds(40,30,120,120);
		c1.setBounds(40,30,120,120);
		c1.setBackground(Color.white);
		c1.setOpaque(false);      
		c1.setBorderPainted(false);   
		                               
		                                                          // setters 
		
		ImageIcon Chicken2 = new ImageIcon("C:/JAVA.JOLLIBED/Pictures/food (1).png");
		Image imgckn2 = Chicken2.getImage();
	    Image ScaledImg_ckn2 = imgckn2.getScaledInstance(130,130, Image.SCALE_SMOOTH);
	    c2 = new JButton(new ImageIcon(ScaledImg_ckn2));
	    c2.setBounds(40,210,120,120);
	    c2.setOpaque(false);
	    c2.setBorderPainted(false);   
	    c2.setBackground(null);
		
		
		
		ImageIcon Chicken3 = new ImageIcon("C:/JAVA.JOLLIBED/Pictures/food (2).png");
		Image imgckn3 = Chicken3.getImage();
		Image ScaledImg_ckn3 = imgckn3.getScaledInstance(130,130, Image.SCALE_SMOOTH);
        c3 = new JButton(new ImageIcon(ScaledImg_ckn3));
        c3.setBounds(40,390,120,120);
        c3.setOpaque(false);
	    c3.setBorderPainted(false);   
	    c3.setBackground(null);
        
        
	    ImageIcon Chicken4 = new ImageIcon("C:/JAVA.JOLLIBED/Pictures/food (3).png");
		Image imgckn4 = Chicken4.getImage();
		Image ScaledImg_ckn4 = imgckn4.getScaledInstance(130,100, Image.SCALE_SMOOTH);
        c4 = new JButton(new ImageIcon(ScaledImg_ckn4));
        c4.setBounds(200,210,120,120);
        c4.setOpaque(false);
        c4.setBorderPainted(false);   
	   
        
        c5 = new JButton("food 5");
        c5.setBounds(200,390,120,120);
        
        c6 = new JButton("food 6");
        c6.setBounds(200,30,120,120);
		
	}
	
	
	 public JButton getc1() {return c1;}                             // getters
     public JButton getc2() {return c2;}
	 public JButton getc3() {return c3;}
	 public JButton getc4() {return c4;}
     public JButton getc5() {return c5;}
     public JButton getc6() {return c6;}
	
     
     public void setFoodVisibility(boolean visible) {
    	 
         c1.setVisible(visible);
         c2.setVisible(visible);
         c3.setVisible(visible);
         c4.setVisible(visible);
         c5.setVisible(visible);
         c6.setVisible(visible);
         
       }
     
   }

		
	



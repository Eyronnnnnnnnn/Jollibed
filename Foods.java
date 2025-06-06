package Jollibed2;
import javax.swing.JButton;

public class Foods{


	private JButton c1,c2,c3,c4,c5,c6;
	
	
	public  Foods() {
		
		c1 = new JButton("drink1");
		c1.setBounds(40,30,120,120);
		
		                              // setters 
		
		c2 = new JButton("drink 2");
		c2.setBounds(40,210,120,120);
		
		
        c3 = new JButton("drink 3");
        c3.setBounds(40,390,120,120);
        
        c4 = new JButton("drink 4");
        c4.setBounds(200,210,120,120);
        
        
        c5 = new JButton("drink 5");
        c5.setBounds(200,390,120,120);
        
        c6 = new JButton("drink 6");
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

		
	


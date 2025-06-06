package Jollibed2;
import javax.swing.JButton;

public class Drinks {
	

	private JButton d1,d2,d3,d4,d5,d6;
	
	public Drinks() {
		
		d1 = new JButton("siken1");
		d1.setBounds(40,30,120,120);
		
		                                  // setters 
		
		d2 = new JButton("siken 2");
		d2.setBounds(40,210,120,120);
		
		
		d3 = new JButton("siken3");
		d3.setBounds(40,390,120,120);
        
		d4 = new JButton("siken 4");
		d4.setBounds(200,210,120,120);
        
        
		d5 = new JButton("siken 5");
		d5.setBounds(200,390,120,120);
        
		d6 = new JButton("siken 6");
		d6.setBounds(200,30,120,120);
		
		
	}
	
	

	    public JButton getD1() { return d1; }
	    public JButton getD2() { return d2; }
	    public JButton getD3() { return d3; }
	    public JButton getD4() { return d4; }
	    public JButton getD5() { return d5; }
	    public JButton getD6() { return d6; }
	
            
	    public void  setDrinkVisibility(boolean visible) {
	    	
	    	 d1.setVisible(visible);
	         d2.setVisible(visible);
	         d3.setVisible(visible);
	         d4.setVisible(visible);
	         d5.setVisible(visible);
	         d6.setVisible(visible);
	    	
	    }
}

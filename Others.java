package Jollibed2;

import javax.swing.JButton;

public class Others {
	
	private JButton o1,o2,o3,o4,o5,o6;
	
	public Others() {
		
		
		o1 = new JButton("others1");
		o1.setBounds(40,30,120,120);
		
	                               // setters 
		
		o2 = new JButton("others2");
		o2.setBounds(40,210,120,120);
		
		
		o3 = new JButton("others3");
		o3.setBounds(40,390,120,120);
        
		o4 = new JButton("others4");
		o4.setBounds(200,210,120,120);
        
        
		o5 = new JButton("others5");
		o5.setBounds(200,390,120,120);
        
		o6 = new JButton("others6");
		o6.setBounds(200,30,120,120);
		
		
	}
	
    public JButton geto1() { return o1; }
    public JButton geto2() { return o2; }
    public JButton geto3() { return o3; }
    public JButton geto4() { return o4; }
    public JButton geto5() { return o5; }
    public JButton geto6() { return o6; }
    
    
    public void setOthersVisibility(boolean visible) {
   	 
    	o1.setVisible(visible);
    	o2.setVisible(visible);
    	o3.setVisible(visible);
    	o4.setVisible(visible);
    	o5.setVisible(visible);
    	o6.setVisible(visible);
        
      }

}

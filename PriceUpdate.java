package Jollibed2;
 
import javax.swing.DefaultListModel;
import javax.swing.JLabel;

public class PriceUpdate  {
	
	public static void removeditem_updatetotal(DefaultListModel<String> selectedItemsModel,int i,JLabel totalLabel,Frame frame) {
		
  	 
		if (i > 0 ) {
			
			String item = selectedItemsModel.getElementAt(i);
			 String[] parts = item.trim().split("\\s+");
			 String priceText = parts[parts.length - 1].replace("₱", "");
			 
			 try {
				 
				 float price  = Float.parseFloat(priceText);
				 frame.sum-= price;
				 totalLabel.setText("TOTAL: ₱" + String.format("%.2f", frame.sum));
				 
			 }catch (NumberFormatException e) {
				 System.out.println("Could not parse price from item: " + item);
			 }
			 
			 selectedItemsModel.remove(i);
		}
	  	
		
	}

}

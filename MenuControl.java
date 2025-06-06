package Jollibed2;

public class MenuControl {
	
	
	     private Foods foods;
	     private Drinks drinks;
	     private Others others;
	    
	  public MenuControl(){
		  
		    foods = new Foods();
	        drinks = new Drinks();
	        others = new Others();
		  
	  }
	  
	  
	  
	 
	    public Foods   getFoods() { return foods; }
	    public Drinks getDrinks() { return drinks;}
	    public Others getOthers() {return others;}
	    
	    
	    
	    public void showFoods(boolean visible) {
	    	
	    	 foods.setFoodVisibility(visible);
	    	// drinks.setDrinkVisibility(visible);
	    	// others.setOthersVisibility(visible);
	    	 
	    }

	    public void showDrinks(boolean visible) {
	    	
	    	
	   drinks.setDrinkVisibility(visible);
	    others.setOthersVisibility(visible);
	        
	    } public void showOthers(boolean visible) {
	    	
	    	
	  others.setOthersVisibility(visible);
	    	
	    }

}

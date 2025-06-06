package Jollibed2;

import java.awt.EventQueue;

public class Main {

	public static void main(String[] args) {
		System.out.println("Main method started");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}

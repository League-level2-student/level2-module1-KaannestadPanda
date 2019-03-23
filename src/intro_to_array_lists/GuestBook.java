package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Console;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	
	JButton add = new JButton("add name");
	JButton view = new JButton("view guest list");
	ArrayList<String> names=new ArrayList<String>();
	
	public static void main(String[] args) {
		new GuestBook().build();
		
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	void build() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		add.addActionListener(this);
		
		view.addActionListener(this);
		
		frame.add(panel);
		panel.add(add);
		panel.add(view);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton check= (JButton) e.getSource();
		
		if(check==add) {
			String g= JOptionPane.showInputDialog("Name?");
			
			names.add(g);
			

			
		}
		else {
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
			int q=1;
			for(int i=0; i<names.size();i++) {
		System.out.print("Guest #"+q+": ");
		q++;
		
		System.out.println(names.get(i));
			}
		
		}
		
	}
}

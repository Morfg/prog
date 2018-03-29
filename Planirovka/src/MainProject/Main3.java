package MainProject;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main3 {

	private JFrame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main3 window = new Main3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main3() {
		initialize();
		Main2 window2 = new Main2();
		window2.frame.setVisible(false);
	}
	public void Main2Vis() {
		Main2 window2 = new Main2();
		window2.frame.setVisible(false);
	}
	public void Main2Vis3() {
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Главное меню");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Планировщик");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(45, 85, 143, 77);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("Отделочник");
		button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button.setBounds(245, 85, 143, 77);
		frame.getContentPane().add(button);
		
		btnNewButton.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		    	 frame.setVisible(false);
		    	 MainProject.Main2.main(null);
		    	 
		     }
		});
		
		button.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		    	 frame.setVisible(false);
		    	 MainProject.Main4.main(null);
		    	 
		     }
		});
		
	}
}

package MainProject;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class Main4 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main4 window = new Main4();
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
	public Main4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Отделочник");
		frame.setBounds(100, 100, 404, 365);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Значение площади помещения(кв.м):");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(38, 11, 285, 25);
		frame.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("Количество объектов в комнате(шт):");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(38, 80, 260, 25);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setBounds(38, 49, 155, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setColumns(10);
		textField_1.setBounds(38, 116, 155, 20);
		frame.getContentPane().add(textField_1);
		
		JLabel label_1 = new JLabel("Свободного пространства в комнате(кв.м):");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(38, 147, 306, 25);
		frame.getContentPane().add(label_1);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setColumns(10);
		textField_2.setBounds(38, 183, 155, 20);
		frame.getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("Сохранить в файл");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(38, 214, 170, 36);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("Выйти из режима");
		button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button.setBounds(208, 279, 170, 36);
		frame.getContentPane().add(button);
		
		int j = MainProject.AmountObj.amount;
		textField_1.setText(String.valueOf(MainProject.AmountObj.amount));
		textField_2.setText(String.valueOf(MainProject.place.freearea));
		textField.setText(String.valueOf(MainProject.place.totalarea));
		button.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		    	 frame.setVisible(false);
		    	 MainProject.Main3.main(null);
		     }
		});
		btnNewButton.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		    	 MainProject.SuccessSave.main(null);

		     }
		});
		
	}
}

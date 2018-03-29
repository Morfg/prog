package MainProject;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main2 {

	JFrame frame;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton_3;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main2 window = new Main2();
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
	public Main2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Планировщик");
		frame.setBounds(100, 100, 389, 545);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(30, 54, 152, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Введите значение площади комнаты(кв.м)");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(20, 23, 348, 20);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Значение ширины объекта(м)");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(20, 155, 214, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		//Поле для ширины объекта
		textField_1 = new JTextField();
		textField_1.setBounds(30, 180, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		//Поле для длины объекта
		textField_2 = new JTextField();
		textField_2.setBounds(30, 235, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Значение длины объекта(м)");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(20, 211, 200, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Параметры объекта");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(20, 121, 152, 23);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("Рассчитать свободное место");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.setBounds(20, 366, 208, 33);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Добавить объект");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_2.setBounds(20, 270, 139, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_4 = new JLabel("Свободное место(кв.м): ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(30, 410, 170, 20);
		frame.getContentPane().add(lblNewLabel_4);
		
		btnNewButton_3 = new JButton("Выйти из режима");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3.setBounds(193, 458, 170, 36);
		frame.getContentPane().add(btnNewButton_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(202, 412, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		
		AmountObj AmountObj = new AmountObj();
		Objects[] Obj = new Objects[100];
		
		btnNewButton_3.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		    	 frame.setVisible(false);
		    	 MainProject.Main3.main(null);
		    	 
		     }
		});
		
		btnNewButton_2.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		    	 if(textField_1.getText().length() != 0 && textField_2.getText().length() != 0) { 
		    		 AmountObj.amount+=1;
		    		 Obj[AmountObj.amount] = new Objects();
		    		 Obj[AmountObj.amount].width=Float.parseFloat(textField_1.getText());
		    		 Obj[AmountObj.amount].length=Float.parseFloat(textField_2.getText());
		    		 Obj[AmountObj.amount].objNumbet=AmountObj.amount;
		    		 Obj[AmountObj.amount].area=Float.parseFloat(textField_1.getText())*Float.parseFloat(textField_2.getText());
		    		 
		    	 }
		    	 
		     }
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		    	 if(textField.getText().length()>0 && (Float.parseFloat(textField.getText()))>=0){
		    	 MainProject.place.totalarea= Float.parseFloat(textField.getText());
		    	 MainProject.place.freearea=Float.parseFloat(textField.getText());
		    	 for(int i=0;i<AmountObj.amount;i++) {
		    		 MainProject.place.freearea-=Obj[AmountObj.amount].area;
		    	 }
		    	 textField_3.setText(String.valueOf(MainProject.place.freearea));
		    	 System.out.println("dsad");
		     }else {
		    	 MainProject.Dial1.main(null);
		     }}
		     
		});
		
	}
}

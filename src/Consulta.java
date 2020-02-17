import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import java.awt.TextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Consulta extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consulta frame = new Consulta();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Consulta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label = new Label("Titulo:");
		label.setBounds(114, 30, 46, 22);
		contentPane.add(label);
		
		TextField textField = new TextField();
		textField.setBounds(166, 30, 152, 22);
		contentPane.add(textField);
		
		Label label_1 = new Label("Autor:");
		label_1.setBounds(114, 58, 46, 22);
		contentPane.add(label_1);
		
		TextField textField_1 = new TextField();
		textField_1.setBounds(166, 58, 152, 22);
		contentPane.add(textField_1);
		
		Label label_2 = new Label("Genero:");
		label_2.setBounds(114, 86, 46, 22);
		contentPane.add(label_2);
		
		TextField textField_2 = new TextField();
		textField_2.setBounds(166, 86, 152, 22);
		contentPane.add(textField_2);
		
		Label label_3 = new Label("ISBN:");
		label_3.setBounds(114, 114, 46, 22);
		contentPane.add(label_3);
		
		TextField textField_3 = new TextField();
		textField_3.setBounds(166, 114, 152, 22);
		contentPane.add(textField_3);
		
		Label label_4 = new Label("Paginas:");
		label_4.setBounds(114, 142, 46, 22);
		contentPane.add(label_4);
		
		TextField textField_4 = new TextField();
		textField_4.setBounds(166, 142, 152, 22);
		contentPane.add(textField_4);
		
		Label label_5 = new Label("A\u00F1o:");
		label_5.setBounds(114, 170, 46, 22);
		contentPane.add(label_5);
		
		TextField textField_5 = new TextField();
		textField_5.setBounds(166, 170, 152, 22);
		contentPane.add(textField_5);
		
		Label label_6 = new Label("Editorial:");
		label_6.setBounds(114, 198, 46, 22);
		contentPane.add(label_6);
		
		TextField textField_6 = new TextField();
		textField_6.setBounds(166, 198, 152, 22);
		contentPane.add(textField_6);
		
		JLabel lblConsulta = new JLabel("Consulta");
		lblConsulta.setHorizontalAlignment(SwingConstants.CENTER);
		lblConsulta.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblConsulta.setBounds(182, 0, 96, 24);
		contentPane.add(lblConsulta);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GUI consulta= new GUI();
				consulta.getFrame().setVisible(true);	
				dispose();	
				
			}
		});
		btnVolver.setBounds(176, 226, 89, 23);
		contentPane.add(btnVolver);
	}
	
	
}

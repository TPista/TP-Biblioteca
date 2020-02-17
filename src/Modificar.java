import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Label;
import java.awt.TextField;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Modificar extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modificar frame = new Modificar();
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
	public Modificar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblModificarLibro = new JLabel("Modificar libro");
		lblModificarLibro.setBounds(5, 5, 424, 22);
		lblModificarLibro.setHorizontalAlignment(SwingConstants.CENTER);
		lblModificarLibro.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblModificarLibro);
		
		Label label = new Label("Titulo:");
		label.setBounds(10, 44, 46, 22);
		contentPane.add(label);
		
		TextField textField = new TextField();
		textField.setBounds(62, 44, 152, 22);
		contentPane.add(textField);
		
		Label label_1 = new Label("Autor:");
		label_1.setBounds(10, 72, 46, 22);
		contentPane.add(label_1);
		
		TextField textField_1 = new TextField();
		textField_1.setBounds(62, 72, 152, 22);
		contentPane.add(textField_1);
		
		Label label_2 = new Label("Genero:");
		label_2.setBounds(10, 100, 46, 22);
		contentPane.add(label_2);
		
		TextField textField_2 = new TextField();
		textField_2.setBounds(62, 100, 152, 22);
		contentPane.add(textField_2);
		
		Label label_3 = new Label("ISBN:");
		label_3.setBounds(10, 128, 46, 22);
		contentPane.add(label_3);
		
		TextField textField_3 = new TextField();
		textField_3.setBounds(62, 128, 152, 22);
		contentPane.add(textField_3);
		
		Label label_4 = new Label("Paginas:");
		label_4.setBounds(10, 156, 46, 22);
		contentPane.add(label_4);
		
		TextField textField_4 = new TextField();
		textField_4.setBounds(62, 156, 152, 22);
		contentPane.add(textField_4);
		
		Label label_5 = new Label("A\u00F1o:");
		label_5.setBounds(10, 184, 46, 22);
		contentPane.add(label_5);
		
		TextField textField_5 = new TextField();
		textField_5.setBounds(62, 184, 152, 22);
		contentPane.add(textField_5);
		
		Label label_6 = new Label("Editorial:");
		label_6.setBounds(10, 212, 46, 22);
		contentPane.add(label_6);
		
		TextField textField_6 = new TextField();
		textField_6.setBounds(62, 212, 152, 22);
		contentPane.add(textField_6);
		
		JTextPane txtpnSadasdas = new JTextPane();
		txtpnSadasdas.setBackground(UIManager.getColor("Button.background"));
		txtpnSadasdas.setFont(new Font("Tahoma", Font.ITALIC, 11));
		txtpnSadasdas.setText("Ingrese datos en campos a modificar");
		txtpnSadasdas.setBounds(282, 111, 126, 39);
		contentPane.add(txtpnSadasdas);
		
		Button button = new Button("Aceptar");
		button.setBounds(354, 202, 70, 22);
		contentPane.add(button);
		
		Button button_1 = new Button("Volver");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GUI modificar= new GUI();
				modificar.getFrame().setVisible(true);	
				
			    dispose();
			}
		});
		button_1.setBounds(354, 230, 70, 22);
		contentPane.add(button_1);
	}
}

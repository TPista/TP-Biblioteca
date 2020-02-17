import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.TextField;

public class GUI {
  
	private JFrame frame;

	/**
	 * Launch the application.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * @throws IOException 
	 */
	Alta alta;
	Libro libro;
    Biblioteca biblio;
	/**
	 * Create the application.
	 * @throws FileNotFoundException 
	 */
	public GUI(Biblioteca b) throws FileNotFoundException {
		biblio = b;
		initialize();

	}

	 public JFrame getFrame()
	 {
		 return frame;
	 }
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		frame.setBounds(100, 100, 611, 247);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSupermercado = new JLabel("LIBRERIA");
		lblSupermercado.setFont(new Font("Tahoma", Font.ITALIC, 21));
		lblSupermercado.setHorizontalAlignment(SwingConstants.CENTER);
		lblSupermercado.setBounds(225, 11, 141, 23);
		frame.getContentPane().add(lblSupermercado);
		
		JButton btnAlta = new JButton("Alta");
		btnAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				alta = new Alta(frame,biblio);
				alta.setVisible(true);	
			}
		});
		btnAlta.setBounds(474, 158, 89, 23);
		frame.getContentPane().add(btnAlta);
		
		TextField textField = new TextField();
		textField.setBounds(225, 81, 113, 23);
		frame.getContentPane().add(textField);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				Consulta buscar= new Consulta();
				buscar.setVisible(true);
				
			}
		});
		btnBuscar.setBounds(344, 81, 89, 23);
		frame.getContentPane().add(btnBuscar);
		
		JButton btnBaja = new JButton("Baja");
		btnBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				Baja baja= new Baja();
				baja.setVisible(true);
				
			}
		});
		btnBaja.setBounds(249, 158, 89, 23);
		frame.getContentPane().add(btnBaja);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				Modificar modi= new Modificar();
				modi.setVisible(true);
				
			}
		});
		btnModificar.setBounds(34, 158, 89, 23);
		frame.getContentPane().add(btnModificar);
		
		JLabel lblConsulte = new JLabel("Consulte:");
		lblConsulte.setHorizontalAlignment(SwingConstants.CENTER);
		lblConsulte.setBounds(166, 81, 53, 23);
		frame.getContentPane().add(lblConsulte);
	}

	
}

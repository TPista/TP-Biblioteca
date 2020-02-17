import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Alta extends JFrame {

	private JPanel contentPane;
   JFrame estaVentana ;
	Libro libro;
	Biblioteca biblio;
	/**
	 * Launch the application.
	 */
   
   
	/*public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Alta frame = new Alta();
					estaVentana = frame;
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 * @param biblio 
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	//public Alta() throws ClassNotFoundException, SQLException {
		public Alta(JFrame f, Biblioteca biblio)
		{
			estaVentana = this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 439, 304);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.biblio = biblio;
		//bd = new Base();
		JLabel lblAlta = new JLabel("ALTA");
		lblAlta.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlta.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAlta.setBounds(183, 11, 61, 14);
		contentPane.add(lblAlta);
		
		Label label = new Label("Por favor, complete los campos:");
		label.setBounds(10, 32, 177, 22);
		contentPane.add(label);
		
		Label label_1 = new Label("Titulo:");
		label_1.setBounds(111, 60, 46, 22);
		contentPane.add(label_1);
		
		Label label_2 = new Label("Autor:");
		label_2.setBounds(111, 88, 46, 22);
		contentPane.add(label_2);
		
		Label label_3 = new Label("Genero:");
		label_3.setBounds(111, 116, 46, 22);
		contentPane.add(label_3);
		
		Label label_4 = new Label("ISBN:");
		label_4.setBounds(111, 144, 46, 22);
		contentPane.add(label_4);
		
		Label label_5 = new Label("Paginas:");
		label_5.setBounds(111, 172, 46, 22);
		contentPane.add(label_5);
		
		Label label_6 = new Label("A\u00F1o:");
		label_6.setBounds(111, 200, 46, 22);
		contentPane.add(label_6);
		
		Label label_7 = new Label("Editorial:");
		label_7.setBounds(111, 228, 46, 22);
		contentPane.add(label_7);
		
		TextField txtTitulo = new TextField();
		txtTitulo.setBounds(163, 60, 152, 22);
		contentPane.add(txtTitulo);
		
		TextField txtAutor = new TextField();
		txtAutor.setBounds(163, 88, 152, 22);
		contentPane.add(txtAutor);
		
		TextField txtGenero = new TextField();
		txtGenero.setBounds(163, 116, 152, 22);
		contentPane.add(txtGenero);
		
		TextField txtISBN = new TextField();
		txtISBN.setBounds(163, 144, 152, 22);
		contentPane.add(txtISBN);
		
		TextField txtPaginas = new TextField();
		txtPaginas.setBounds(163, 172, 152, 22);
		contentPane.add(txtPaginas);
		
		TextField txtAño = new TextField();
		txtAño.setBounds(163, 200, 152, 22);
		contentPane.add(txtAño);
		
		TextField txtEditorial = new TextField();
		txtEditorial.setBounds(163, 228, 152, 22);
		contentPane.add(txtEditorial);
		
		
		
		Button button = new Button("Aceptar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				libro = new Libro(txtTitulo.getText() ,
						          txtAutor.getText() ,
						          txtPaginas.getText(),
						          txtISBN.getText(),
						          txtAño.getText() ,
						          txtEditorial.getText() ,
						          txtGenero.getText() );
				biblio.biblio.add(libro);
				try {
					grabarBiblio();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				estaVentana.setVisible(false);	
				f.setVisible(true);
			}
		});
		button.setBounds(343, 209, 70, 22);
		contentPane.add(button);
		//button.addActionListener(new ActionListener()){
		// bd.altaLibro()
		
		//CAMPOS PARA AGREGAR
		
		
		
		Button button_1 = new Button("Volver");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				  estaVentana.setVisible(false);	
				f.setVisible(true);
				
			}
		});
		button_1.setBounds(343, 237, 70, 22);
		contentPane.add(button_1);
	}
		public void grabarBiblio() throws IOException
		{
			FileWriter fw = new FileWriter("src/biblio.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			for (int i = 0; i< biblio.cantLibros(); i++)
			{
				System.out.println(biblio.getLibro(i).toString());
				bw.write(biblio.getLibro(i).toString());
				bw.newLine();
			}
			bw.close();
			fw.close();
		}
	public Libro getLibroAlta()
	{
		System.out.println(libro);
		return libro;
	}
}
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Base {
	/*Statement stmt;
	String sql;
	Connection conn;*/
	FileReader fr;
	BufferedReader br;
	Biblioteca biblio;
	//public Base() throws SQLException, ClassNotFoundException {
	public Base(Biblioteca biblio) throws IOException
	{
		FileReader fr;
		BufferedReader br;
		/*conn = null;
		stmt = null;
		//String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
		String DB_URL = "jdbc:mysql://localhost/biblio";//poner el nombre de la base de datos
		String USER = "root";
		
		 String PASS = "12345"; // insert the password to SQL server
	Class.forName(JDBC_DRIVER);
	conn = DriverManager.getConnection(DB_URL, USER, PASS);
	stmt = conn.createStatement();
	String sql = "drop table if exists libros";
	stmt.executeUpdate(sql);
	sql = "create table libros (titulo varchar(60),autor varchar(60),paginas varchar(10),isbn varchar(50),año varchar(10),editorial varchar(60), genero varchar(15) )";//Creo la tabla libros
	stmt.executeUpdate(sql);
	*/
		fr = new FileReader("src/biblio.txt");
		br = new BufferedReader(fr);
		String str = "";
	    this.biblio = biblio;
		while ((str = br.readLine())!= null)
		{
		     Libro l = new Libro(str);
		     biblio.agregarLibro(l);
		}
		fr.close();
		br.close();
	}	
	public void mostrarTabla() throws SQLException, IOException
	{
	/*sql = "select * from libros";
	ResultSet datos = stmt.executeQuery(sql);
	while (datos.next())
	{//Los datos.getint los puse asi para ver q onda pero eran strings
		System.out.println(datos.getString(1)+" "+ datos.getString(2)+" "+datos.getInt(3)+ " "+ datos.getInt(4)+" "+datos.getInt(5)+ " "+ datos.getString(6)+" "+datos.getString(7));
	}
		*/
		fr = new FileReader("src/biblio.txt");
		br = new BufferedReader(fr);
		String str = "";
		biblio = new Biblioteca();
		while ((str = br.readLine())!= null)
		{
		     System.out.println(str);
		}
		fr.close();
		br.close();
		
	}
	
	
	
	//public void cerrarConexion() throws SQLException
	
	
	}

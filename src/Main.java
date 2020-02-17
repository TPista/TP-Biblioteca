import java.awt.EventQueue;
import java.io.IOException;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
		            Biblioteca biblio = new Biblioteca();
		            Base b = new Base(biblio);
					GUI window = new GUI(biblio);
			         b.mostrarTabla();
			        
			       
			         window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		 
	}
}

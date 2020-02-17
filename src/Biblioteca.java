import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;

public class Biblioteca {
	ArrayList <Libro> biblio;

	public Biblioteca() throws FileNotFoundException
	{
		biblio = new ArrayList<Libro>();
	
	}
	public void agregarLibro(Libro l)
	{
	     biblio.add(l);
	}
	public int cantLibros()
	{
		return biblio.size();
	}
    public Libro getLibro(int i)
    {
    	return biblio.get(i);
    }
}

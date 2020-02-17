public class Libro {
	String titulo;
	String autor;
	int cantidadPaginas;
	int ISBN;
	int a�o;
	String editorial;
	String genero;
	
	public Libro(String titulo,String autor,String cantidadPaginas,String  isbn,String  a�o,String editorial,String genero) {
		this.titulo = titulo;
		this.autor = autor;
		this.cantidadPaginas = Integer.parseInt(cantidadPaginas);
		this.ISBN = Integer.parseInt(isbn);
		this.a�o = Integer.parseInt(a�o);
		this.editorial = editorial;
		this.genero = genero;
	}
	
	public Libro (String str)
	{
		String [] a = str.split(",");
		this.titulo = a[0];
		this.autor = a[1];
		this.cantidadPaginas = Integer.parseInt(a[2]);
		this.ISBN = Integer.parseInt(a[3]);
		this.a�o = Integer.parseInt(a[4]);
		this.editorial = a[5];
		this.genero = a[6];
		
	}
	public String toString()
	{
		return titulo+","+autor+","+cantidadPaginas+","+ISBN+","+a�o+","+editorial+","+genero;
	}
}
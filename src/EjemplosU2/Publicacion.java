package EjemplosU2;

public class Publicacion {

	private String tipo;
	private String red;
	private int likes;
	private int post;
	
	public Publicacion(String tipo, String red, int likes, int post) {
		super();
		this.tipo = tipo;
		this.red = red;
		this.likes = likes;
		this.post = post;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getRed() {
		return red;
	}

	public void setRed(String red) {
		this.red = red;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public int getPost() {
		return post;
	}

	public void setPost(int post) {
		this.post = post;
	}

	@Override
	public String toString() {
		return "Publicacion [tipo=" + tipo + ", red=" + red + ", likes=" + likes + ", post=" + post + "]";
	}
	
	
}

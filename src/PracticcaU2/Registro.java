package PracticcaU2;
	public class Registro {
	
		private String tipo;
		private int cuota;
		private int costo;
		private int id;
	

		public Registro(String tipo, int cuota, int costo, int id) {
			super();
			this.cuota = cuota;
			this.costo = costo;
			this.id = id;
			this.tipo = tipo;
			
		}

		

		public String getTipo() {
			return tipo;
		}



		public void setTipo(String tipo) {
			this.tipo = tipo;
		}



		public int getCuota() {
			return cuota;
		}



		public void setCuota(int cuota) {
			this.cuota = cuota;
		}



		public int getCosto() {
			return costo;
		}



		public void setCosto(int costo) {
			this.costo = costo;
		}



		public int getId() {
			return id;
		}



		public void setId(int id) {
			this.id = id;
		}



		@Override
		public String toString() {
			return "Registro [tipo=" + tipo + ", cuota=" + cuota + ", costo=" + costo + ", id=" + id + "]";
		}


		
	}
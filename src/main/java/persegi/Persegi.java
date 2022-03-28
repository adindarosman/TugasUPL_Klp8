package persegi;

public class Persegi {
		private double s;
		
		public Persegi() {
			this.s=0;
		}
		public Persegi(double s){
			this.s=s;
		}
		public void setPanjangSisi (double s){
			this.s=s;
		}
		public double Luas() {
			return s*s;
		}
		public double getPanjangSisi () {
			return this.s;
		}
	}
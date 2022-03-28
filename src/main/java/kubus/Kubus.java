package kubus;
import persegi.Persegi;

public class Kubus extends Persegi {
		private Persegi persegi;
		
		public Kubus(Persegi persegi) {
			this.persegi=persegi;
		}
		public double LuasKubus() {
			return persegi.Luas()*6;
		}
		public double VolumeKubus() {
			return persegi.Luas()*persegi.getPanjangSisi();
		}
	}
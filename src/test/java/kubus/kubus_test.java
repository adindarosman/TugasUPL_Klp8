package kubus;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import persegi.Persegi;

class KubusTest {
	private Kubus kubus;

	@BeforeEach
	public void setUp ()
		{
			Persegi persegi = new Persegi(20);
			this.kubus = new Kubus(persegi);
		}
	@Test
	void testLuasKubus() {
		double LuasKubus = kubus.LuasKubus();
		assertEquals(2400,LuasKubus);
	}
	@Test
	void testVolumeKubus() {
		double VolumeKubus = kubus.VolumeKubus();
		assertEquals(8000,VolumeKubus);
	}
}
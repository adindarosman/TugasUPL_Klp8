package persegi;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class LingkaranTest {
	@Test
	void testLuas() {
		Persegi persegi = new Persegi(15);
		double LuasPersegi = persegi.Luas();
		assertEquals(225,LuasPersegi);
	}
}
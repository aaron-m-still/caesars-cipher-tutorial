import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaesarsCipherTest {

	private CaesarsCipher caesarsCipher = new CaesarsCipher();
	
	@Test
	void testCipheredMessageWithOffsetOf12() {
		assertEquals("tai mdq kag pauzs fapmk", caesarsCipher.cipher("how are you doing today",  12));
	}
	
	@Test
	void testEmptystring() {
		assertEquals("", caesarsCipher.cipher("",  12));
	}

//	@Test
//	void testCaesarsCipherMessageWithOffsetOf11() {
//		assertEquals("tai mdq kag pauzs fapmk", caesarsCipher.cipher("how are you doing today",  11));
//	}
}

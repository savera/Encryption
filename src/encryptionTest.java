import static org.junit.Assert.*;

import org.junit.Test;

public class encryptionTest {

	String code = "qwertyuiopasdfghjklzxcvbnm";
	
	String message = "az";
	
	@Test
	public void testEncode() {
		
		assertEquals("qm", encryption.encode(message, code));
		
	}
	
	@Test
	public void testDecode(){
		
		assertEquals(message, encryption.decode("qm", code));
		
	}
	
	@Test
	public void testBoth(){
		
		String encoded = encryption.encode("hi my name is Savera", code); 
		
		assertEquals(encoded, encryption.decode(encoded, code)); 
		
	}

}

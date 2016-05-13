package kadai4;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntToEngTest {

	/*
	 * @Test public void test() { fail("Not yet implemented"); }
	 */
	@Test
	public void ゼロ() {
		String s = IntToEng.translateEng(0);
		assertEquals("zero", s);

	}
	
	 @Test public void さんじゅう() { String s =IntToEng.translateEng(30);
	 assertEquals("thirty",s); }
	 
	 @Test
	 public void じゅうに() {
		 String s = IntToEng.translateEng(12);
		 assertEquals("twelve", s);
	 }
	 
	 @Test
	 public void さんじゅうに(){
		 String s = IntToEng.translateEng(32);
		 assertEquals("thirty-two", s);
	 }
	 @Test
	 public void ごひゃくさんじゅうに(){
		 String s = IntToEng.translateEng(532);
		 assertEquals("five hundred and thirty-two", s);
	 }

}

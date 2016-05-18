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
	 @Test
	 public void きゅうひゃく(){
		 String s = IntToEng.translateEng(900);
		 assertEquals("nine hundred", s);
	 }
	 @Test
	 public void ごひゃくに(){
		 String s = IntToEng.translateEng(502);
		 assertEquals("five hundred and two", s);
	 }
	 @Test
	 public void さんびゃくじゅういち(){
		 String s = IntToEng.translateEng(311);
		 assertEquals("three hundred and eleven", s);
	 }
	 @Test
	 public void せん(){
		 String s = IntToEng.translateEng(1000);
		 assertEquals("thousand", s);
	 }
	 @Test
	 public void せんさんびゃくさんじゅうご(){
		 String s = IntToEng.translateEng(1335);
		 assertEquals("one thousand and three hundred and thirty-five", s);
	 }
	 @Test
	 public void せんご(){
		 String s = IntToEng.translateEng(1005);
		 assertEquals("one thousand and five", s);
	 }
	 /*@Test
	 public void にせんさんびゃく(){
		 String s = IntToEng.translateEng(2300);
		 assertEquals("two thousand and three hundred", s);
	 }*/

}

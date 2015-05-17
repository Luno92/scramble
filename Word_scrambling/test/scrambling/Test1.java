package scrambling;

import junit.*;

import org.junit.Assert;
import org.junit.Test;


public class Test1 {
	
	String sentences= new String("You can choose any kind of framework that suits you the best. Please provide the necessary build script that compiles your solution and runs the tests with one command.");
	
	String scrambled= new String("You can csoohe any knid of frowemark taht stius you the btse. Psaele pdivore the nrassecey bliud spirct taht celipmos yuor soitulon and rnus the ttses wtih one cdnammo.");
	
	@Test
	public void test_empty(){
	
		Assert.assertEquals(Main.scrambleText(""),"");
		
	}

	@Test
	public void test_one_letter(){
	
		Assert.assertEquals(Main.scrambleText("a"),"a");
		
	}
	@Test
	public void test_two_letter(){
	
		Assert.assertEquals(Main.scrambleText("ab"),"ab");
		
	}
	@Test
	public void test_three_letter(){
	
		Assert.assertEquals(Main.scrambleText("abc"),"abc");
		
	}
	
	
	@Test
	public void test_test_sentences(){
	
		Assert.assertEquals(Main.scrambleText(sentences),scrambled);
		
	}
	
	@Test
	public void test_reverse(){
	
		Assert.assertEquals(Main.scrambleText(Main.scrambleText(sentences)),sentences);
		
	}
	

}

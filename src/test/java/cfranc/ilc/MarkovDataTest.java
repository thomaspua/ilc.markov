package cfranc.ilc;

import static org.junit.Assert.*;

import org.junit.Test;


//--------------------------test ajoutés-----------
//THOMAS PUAUD
/*
test sur les getters et setters

testgetTheCount
testsetTheCount
testgetTheWord
*/


public class MarkovDataTest {
    
        String word = "bla";
        int count = 3;
        MarkovData m = new MarkovData(word, count);
	
        @Test
	public void testgetTheCount() {
            int expected = 3;
            int actual = m.getTheCount();
            if(expected == actual){
                System.out.println("getTheCount marche");
            }
            else{
                System.out.println("getTheCount marche pas");
            }
            
            
		fail("Not yet implemented");
	}
        
        //il faut tester getTheCount avant de tester SsetTheCount
	@Test
	public void testsetTheCount() {
            int expected = 5;
            m.setTheCount(expected); 
            int actual = m.getTheCount();
            if(expected == actual){
                System.out.println("setTheCount marche");
            }
            else{
                System.out.println("setTheCount marche pas");
            }
            
            
		fail("Not yet implemented");
	}
        @Test
	public void testgetTheWord() {
            String expected = "bla";
            String actual = m.getTheWord();
            if(expected.equals(actual)){
                System.out.println("getTheCount marche");
            }
            else{
                System.out.println("getTheCount marche pas");
            }
            
            
		fail("Not yet implemented");
	}/*
        @Test
	public void test() {
		fail("Not yet implemented");
	}*/

}

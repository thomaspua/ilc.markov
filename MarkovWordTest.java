package cfranc.ilc;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

import org.junit.Test;

//--------------------------test ajoutés-----------
//THOMAS PUAUD
/*
testunion : j'ai testé des trucs, il se trouve que je comprends ce que ça fait, tans pis


*/

public class MarkovWordTest {

	String[] when2SimpleWords = new String[] {"parapluie", "parachute"};
	
	@Test
	public void getSimilarity_2SimpleWords_26() {
		
		MarkovWord m = new MarkovWord();
		double expected = 0.33;
		double actual = m.getSimilarity(when2SimpleWords[0],when2SimpleWords[1], 2);
		assertEquals(expected, actual,0.01);		
	}

	@Test
	public void getSimilarity_SameWord_100() {
		
		MarkovWord m = new MarkovWord();
		double expected = 1.0;
		double actual = m.getSimilarity(when2SimpleWords[0],when2SimpleWords[0], 4);
		assertEquals(expected, actual,0.000000001);		
	}	

        
        
        @Test
	public void testunion() {
            MarkovWord m = new MarkovWord();
            
            MarkovData chaine1 = new MarkovData("ba",2);
            MarkovData chaine2 = new MarkovData("ta",2);
            MarkovData chaine3 = new MarkovData("pa",2);
            MarkovData chaine4 = new MarkovData("lu",2);
            MarkovData chaine5 = new MarkovData("tu",2);
            
            List<MarkovData> One = new ArrayList<MarkovData>();
            List<MarkovData> Two = new ArrayList<MarkovData>();
            
            One.add(chaine3);
            One.add(chaine3);
            One.add(chaine3);
            Two.add(chaine3);
            Two.add(chaine3);
            Two.add(chaine3);
            
            int expected = 5;
            int actual = m.union(One, Two);
            System.out.println(actual);
            
            if(expected == actual){
                System.out.println("union marche");
            }
            else{
                System.out.println("union marche pas");
            }
            
		fail("Not yet implemented");
	}
}

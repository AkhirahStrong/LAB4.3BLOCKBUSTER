import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;

//import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class DVDTest {
	
	@Test
	public void testDVDInstanceCreation() {
		
		String expectedTitle = "Fight Club";
		int expectedRuntime = 219;
		
		ArrayList<String> expectedSenceValue = new ArrayList<>
		(Arrays.asList("Edward is in his office", "Edward meets Tyler", 
		"Edward moved in with Tyler", "Edward and Tyler starts fight club", 
		"Edward is Tyler"));
		
		ArrayList<String> sampleSenceValue = new ArrayList<>
		(Arrays.asList("Edward is in his office", "Edward meets Tyler", 
		"Edward moved in with Tyler", "Edward and Tyler starts fight club", 
		"Edward is Tyler"));
		
		DVD test1 = new DVD("Fight Club", 219, sampleSenceValue);
		
		
		assertEquals(expectedTitle, test1.getTitle());
		assertEquals(expectedRuntime, test1.getRunTime());
		assertEquals(expectedSenceValue, test1.getScene());

	}

}
//movies.add(new DVD("Fight Club", 219, FightClubSences));
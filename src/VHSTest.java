import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class VHSTest {
	
	@Test
	public void testVHSInstanceCreation() {
		
		String expectedTitle = "They Live";
		int expectedRuntime = 134;
		
		ArrayList<String>expectedVHSScene = new ArrayList<>(Arrays.asList
		("Nada looking for a job", "Noada finds job", "Nata find glasses"));
		
		ArrayList<String> sampleSenceValue = new ArrayList<>
		(Arrays.asList("Nada looking for a job", "Noada finds job", "Nata find glasses"));
		
		VHS test1 = new VHS("They Live", 134, sampleSenceValue);
		
		
		assertEquals(expectedTitle, test1.getTitle());
		assertEquals(expectedRuntime, test1.getRunTime());
		assertEquals(expectedVHSScene, test1.getScene());

	}
	
	@Test 
	public void testPlayVHS() {
		
		
		VHS test2 = new VHS("They Live", 134, new ArrayList<>(Arrays.asList
		("Nada looking for a job", "Noada finds job", "Nata find glasses")));
		
		test2.play();
		
		
		Assert.assertEquals(test2.getCurrentTime(), 1);
	}
	
	@Test 
	public void testRewindVHS() {
		
		
		VHS test3 = new VHS("They Live", 134, new ArrayList<>(Arrays.asList
				("Nada looking for a job", "Noada finds job", "Nata find glasses")));
		
		test3.rewind();
		
		
		Assert.assertEquals(test3.getCurrentTime(), 0);
	}
	
	

}

package problemsolving.flatlandspacestations;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	

	@Test
	public void testFlatlandSpaceStations1() {
		assertEquals(2, Solution.flatlandSpaceStations(5, new int[] {0,4}));;
	}
	@Test
	public void testFlatlandSpaceStations2() {
		assertEquals(0, Solution.flatlandSpaceStations(6, new int[] {0,1,2,4,3,5}));;
	}
	@Test
	public void testFlatlandSpaceStations3() {
		assertEquals(4, Solution.flatlandSpaceStations(7, new int[] {4}));;
	}
	@Test
	public void testFlatlandSpaceStations4() {
		assertEquals(41296, Solution.flatlandSpaceStations(99998, new int[] {28000, 58701, 43043, 24909, 28572}));;
	}

}

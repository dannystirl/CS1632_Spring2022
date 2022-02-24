import org.mockito.*;
import io.cucumber.java.Before;
import org.junit.Test;

public class DeathStarTest {

	/*
	 * Preconditions: A new DeathStar deathStar is created
	 *                A new Planet planet is created with hit points 10
	 * Execution Steps: shoot planet with deathStar
	 * PostConditions: Return value of deathStar.shoot(planet) is "Wimpy planet was hit by the superlaser!"
	 *                 Planet receives a damage of 100 hit points
	 */

	DeathStar deathStar = new DeathStar(); 
	
	@Before
	public void setUp() {
		deathStar = new DeathStar();
	}

	@Test
	public void testShootPlanet() {
		Planet planet = Mockito.mock(Planet.class);

		Mockito.when(planet.getHitPoints()).thenReturn(10); 
		Mockito.verify(deathStar, Mockito.times(1)).shoot(planet);
	}
}

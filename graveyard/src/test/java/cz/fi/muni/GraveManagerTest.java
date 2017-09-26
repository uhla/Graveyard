package cz.fi.muni;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class GraveManagerTest {

	private Grave grave;
	private GraveManager graveManager;

	@Before
	public void setUp() {
		grave = new Grave(3, "Addams family");
		graveManager = new GraveManager(grave);
	}

	@Test
	public void testCorpseInspection_corpseFound() {

		Corpse pugsley = new Corpse("Pugsley", "Addams", 10, 2017);
		Corpse morticia = new Corpse("Morticia", "Adams", 36, 2017);

		graveManager.addCorpse(pugsley);
		graveManager.addCorpse(morticia);

		Corpse corpseInInspection = graveManager.inspectCorpse("Pugsley", "Addams");
		assertThat(corpseInInspection.getAgeDied(), is(equalTo(10)));
	}

	@Test(expected = CorpseNotFoundException.class)
	public void testCorpseInspection_corpseNotFound() {
		graveManager.inspectCorpse("Pugsley", "Addams");
	}
}

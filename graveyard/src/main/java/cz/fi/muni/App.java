package cz.fi.muni;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Grave grave = new Grave(3, "Addams family");

		Corpse pugsley = new Corpse("Pugsley", "Addams", 10, 2017);
		Corpse morticia = new Corpse("Morticia", "Adams", 36, 2017);

		GraveManager graveManager = new GraveManager(grave);
		graveManager.addCorpse(pugsley);
		graveManager.addCorpse(morticia);

		try {
			Corpse corpseInInspection = graveManager.inspectCorpse("Pugsley", "Addams");
			System.out.println(corpseInInspection);

			corpseInInspection = graveManager.inspectCorpse("Frankie", "Addams");
			System.out.println(corpseInInspection);

		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}
	}
}

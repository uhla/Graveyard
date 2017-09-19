package cz.fi.muni;

public class GraveManager {
	
	private Grave grave;
	
	public GraveManager(Grave grave){
		this.grave = grave;
	}
	
	public Grave addCorpse(Corpse corpse){
		grave.getCorpses().add(corpse);
		return grave;
	}
	
	public Grave digOutCorpse(Corpse corpse){
		grave.getCorpses().remove(corpse);
		return grave;
	}
	
	public Corpse inspectCorpse(String firstName, String lastName){
		for (Corpse corpse: grave.getCorpses()) {
			if (corpse.getLastName().equals(lastName) && corpse.getFirstName().equals(firstName)){
				return corpse;
			}
		}
		throw new IllegalArgumentException("Sorry, but the corpse you are looking for isn't present in the grave");
	}

}

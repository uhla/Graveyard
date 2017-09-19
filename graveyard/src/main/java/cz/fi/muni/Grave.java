package cz.fi.muni;

import java.util.ArrayList;
import java.util.List;

public class Grave {

	private int depth;
	private String tombStoneDescription;

	private List<Corpse> corpses = new ArrayList<>();

	public Grave(int depth, String tombStoneDescription) {
		super();
		this.depth = depth;
		this.tombStoneDescription = tombStoneDescription;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public String getTombStoneDescription() {
		return tombStoneDescription;
	}

	public void setTombStoneDescription(String tombStoneDescription) {
		this.tombStoneDescription = tombStoneDescription;
	}

	public List<Corpse> getCorpses() {
		return corpses;
	}

	public void setCorpses(List<Corpse> corpses) {
		this.corpses = corpses;
	}

}

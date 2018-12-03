package fr.wildcodeschool.thewizardproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("gandalf")
public class Gandalf implements WizardInterface {
	
	private Outfit myOutfit;
	
	@Autowired
	public Gandalf(Outfit theOutfit) {
		myOutfit = theOutfit;
	};

	@Override
	public String giveAdvice() {
		// TODO Auto-generated method stub
		return "Young Master Frodo, your quest is a heavy burden, but I have faith in you. Trust your fellow companion Samwise.";
	}

	@Override
	public String changeDress() {
		// TODO Auto-generated method stub
		return this.myOutfit.getDressColor("gray");
	}

}

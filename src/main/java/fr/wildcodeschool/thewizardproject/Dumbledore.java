package fr.wildcodeschool.thewizardproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dumbledore")
public class Dumbledore implements WizardInterface {
	
	private Outfit myOutfit;
	
	@Autowired
	public Dumbledore(Outfit theOutfit) {
		myOutfit = theOutfit;
	};

	@Override
	public String giveAdvice() {
		// TODO Auto-generated method stub
		return "Harry, never forget our world is the world of all humans.";
	}

	@Override
	public String changeDress() {
		// TODO Auto-generated method stub
		return this.myOutfit.getDressColor("blue");
	}
	
	
}

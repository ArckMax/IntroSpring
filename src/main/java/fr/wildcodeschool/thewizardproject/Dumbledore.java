package fr.wildcodeschool.thewizardproject;

public class Dumbledore implements WizardInterface {
	
	private Outfit myOutfit;

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
	
	public void setOutfit(Outfit theOutfit) {
		myOutfit = theOutfit;
	}
	
	
	
	
	

}

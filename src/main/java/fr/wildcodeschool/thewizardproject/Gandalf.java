package fr.wildcodeschool.thewizardproject;

public class Gandalf implements WizardInterface {
	
	private Outfit myOutfit;

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
	
	public void setOutfit(Outfit theOutfit) {
		myOutfit = theOutfit;
	}
	

}

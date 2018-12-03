package fr.wildcodeschool.thewizardproject;

import org.springframework.stereotype.Component;

@Component
public class Outfit {
	
	public String getDressColor(String param_color) {
		return "The wizard's dress is " + param_color;
	};

}

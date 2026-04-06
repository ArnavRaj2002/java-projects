package com.nit.sbeans;

public class OutfitSuggester 
{
 private int temperature;
 
 public OutfitSuggester(int temperature) {
	 System.out.println("1 arg constructor");
	 this.temperature=temperature;
 }
 
 public String suggestOutfit()
 {
	 if(temperature<10) return "Wear a heavy jacket";
	 else if(temperature>=10 && temperature<=20) return "Wear a sweater";
	return "Wear light clothes";
 }
}

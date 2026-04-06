package com.nit.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.sbeans.OutfitSuggester;

public class DependencyInjection {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext(
				"src\\com\\nit\\cfgs\\ApplicationContext.xml");
		OutfitSuggester outfitSuggester = ctx.getBean("os", OutfitSuggester.class);
		String suggestOutfit = outfitSuggester.suggestOutfit();
		System.out.println(suggestOutfit);
		ctx.close();
	}

}

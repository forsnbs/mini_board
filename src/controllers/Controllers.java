package controllers;

import articleController.ArticleController;

public class Controllers {
	
	private static ArticleController articleController;
	
	public Controllers() {
		
		articleController = new ArticleController();
		
	}

	public static ArticleController getArticleController() {
		return articleController;
	}
	
	

}


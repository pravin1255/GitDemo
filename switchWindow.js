describe('switch window demo', function(){
	
	it('switch window', function(){
		
		browser.get("http://posse.com/");
		
		element(by.model("userInputQuery")).sendKeys("river");
		
		element(by.model("locationQuery")).sendKeys('london');
		
		//browser.actions().mouseMove(element(by.model("locationQuery")).sendKeys('london')).perform();
		
		browser.actions().sendKeys(protractor.Key.ARROW_DOWN).perform();
		
		browser.actions().sendKeys(protractor.Key.ENTER).perform().then(function(){
			browser.sleep(3000);
		});
		
		element.all(by.css("div[ng-mouseover*='onSearchResultOver']")).get(0).click();
		
		element(by.css("a[ng-href*='London/River Island']")).click().then(function(){
			
			browser.sleep(2000);
		})
		
		browser.getAllWindowHandles().then(function(handles){
			
			browser.switchTo().window(handles[1]);
			
			browser.getTitle().then(function(text){
				
				console.log(text+" The title of child window");				
				
			})			
			
			browser.switchTo().window(handles[0]);
			
			browser.getTitle().then(function(text){
				
				console.log(text+" The title of parent window");			
				
			})
		})
	})
})
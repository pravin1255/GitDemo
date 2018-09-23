describe('All locator demo',function(){
	
	it('all locator', function(){
		
		browser.get("https://juliemr.github.io/protractor-demo/")
		
		element(by.model("first")).sendKeys("5");
		
		element(by.model('second')).sendKeys("8");
		
		element(by.id('gobutton')).click();
		
		element(by.model("first")).sendKeys("6");
		
		element(by.model('second')).sendKeys("8");
		
		element(by.id('gobutton')).click();
		
		element(by.model("first")).sendKeys("7");
		
		element(by.model('second')).sendKeys("8");
		
		element(by.id('gobutton')).click();
		
		element.all(by.repeater('result in memory')).count().then(function(text){
			console.log("the count is "+text)
		})
				
		
		element.all(by.repeater('result in memory')).each(function(item) {
			
			item.element(by.css('td:nth-child(3)')).getText().then(function(text){
				
				console.log(text);
			})
		})
	})
})
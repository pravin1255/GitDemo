describe('Chain locator demo',function(){
	
	it('chain locator', function(){
		
		browser.get("https://juliemr.github.io/protractor-demo/")
		
		element(by.model("first")).sendKeys("5");
		
		element(by.model('operator')).element(by.css('option:nth-child(1)')).click();
		
		element(by.model('second')).sendKeys("8");
		
		element(by.id('gobutton')).click();
		
		element(by.repeater('result in memory')).element(by.css('td:nth-child(3)')).getText().then(function(text)
				{
			console.log(text);
				})
		
	})
})
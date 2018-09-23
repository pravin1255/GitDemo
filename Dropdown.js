describe('All locator demo', function(){
	
	function calc(a,b,c)
	{
		element(by.model('first')).sendKeys(a);
		
		element(by.model('second')).sendKeys(b);
		
		element.all(by.tagName('option')).each(function(item) {
			
			item.getAttribute('value').then(function(values)
					{
				if(values==c)
					{
					item.click();
					}
					})
		})
		
		element(by.id('gobutton')).click()
	}
	
	it('All demo', function(){
		
		browser.get("https://juliemr.github.io/protractor-demo/");
		
		calc(5,3,'MULTIPLICATION');
		calc(10,13,'ADDITION');
		calc(50,3,'SUBTRACTION');
		calc(5,35,'MULTIPLICATION');
		
		element.all(by.repeater('result in memory')).each(function(item) {
			
			item.element(by.css('td:nth-child(3)')).getText().then(function(text){
				
				console.log("The value is "+text);
			})
		})
	})
})
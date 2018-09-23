describe('All locator demo', function(){
	
	function add(a,b)
	{
		element(by.model('first')).sendKeys(a);
		
		element(by.model('second')).sendKeys(b);
		
		element(by.id('gobutton')).click()
	}
	
	it('All demo', function(){
		
		browser.get("https://juliemr.github.io/protractor-demo/");
		
		add(2,3);
		add(3,4);
		add(4,5);
		add(5,6);
		
		element.all(by.repeater('result in memory')).each(function(item){
			
			item.element(by.css('td:nth-child(3)')).getText().then(function(text)
					{
				console.log("The value is "+text)
					})
		})
	})
})
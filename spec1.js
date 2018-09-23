describe('protractor baby step',function(){
	
	it('open a browser', function(){
		
		//protractor code to open a browser
		browser.get("https://angularjs.org").th
		
		browser.get('http://juliemr.github.io/protractor-demo/').then(function(){
			browser.sleep(5000)
			console.log("Hello world");
		})	
	})
	
	it('close a browser', function(){
		
		//protractor code to close a browser
		
	})
})
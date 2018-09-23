describe('frame demo',function(){
	
	it('frame demo example', function(){
		
		browser.driver.manage().window().maximize();
		
		browser.waitForAngularEnabled(false);
		browser.get("http://www.qaclickacademy.com/practice.php");
		browser.switchTo().frame("iframe-name");
		
		element(by.css("a[href*='sign_in']")).getText().then(function(text){
			
			console.log("text is "+text);
		})
	})
})
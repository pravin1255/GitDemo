describe('Alert demo', function(){
	
	it('alert demo case', function(){
	
		browser.waitForAngularEnabled(false);
		
		browser.get("http://www.qaclickacademy.com/practice.php");
		
		element(by.css("input[value='Confirm']")).click();
		
		//for OK
		browser.switchTo().alert().accept().then(function(){
			
			browser.sleep(2000);
			
			
		})
		
		element(by.css("input[value='Confirm']")).click();
		
		//for Cancel
		browser.switchTo().alert().dismiss().then(function(){
			
			browser.sleep(2000);
		})
	})
})
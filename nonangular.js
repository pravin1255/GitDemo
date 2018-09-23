describe('non angular site', function(){
	
	it('non angular demo', function(){
		
		browser.waitForAngularEnabled(false);
		browser.get('/non-angular-login-page.html');

		element(by.id('username')).sendKeys('Jane');
		element(by.id('password')).sendKeys('1234');
		element(by.id('clickme')).click();
		browser.waitForAngularEnabled(true);
		browser.get('/page-containing-angular.html');
	})
})
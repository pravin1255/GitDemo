describe('protractor test', function() {

	var obj = require("./Jsobjectdemo.js");
	var d=require("./data.js");
	var using=require('jasmine-data-provider');

	beforeEach(function() {
		obj.getUrl();
	})

	using(d.datadriven, function (datas, description) {
		
		it('locator test '+description, function() {

			obj.firstinput.sendKeys(datas.firstinput);

			obj.secondinput.sendKeys(datas.secondinput);

			obj.goButton.click();

			expect(obj.result.getText()).toBe(datas.result)
			obj.result2.getText().then(function(text) {
				console.log("The result is " + text)
			})
		})

		afterEach(function() {
			console.log("after test");
		})	
	});
	
	
})
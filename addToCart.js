describe('add to cart demo', function() {

	function addCart(product) {
		element.all(by.tagName("app-card")).each(function(item) {
			item.element(by.css("h4 a")).getText().then(function(text) {

				if (text == product) {
					item.element(by.css("[class*='btn-info']")).click();
				}
			})
		})
	}
	it('add to cart test case', function() {

		browser.driver.manage().window().maximize();

		browser.get("https://qaclickacademy.github.io/protocommerce/");

		element(by.linkText("Shop")).click();

		addCart("Samsung Note 8");
		addCart("Nokia Edge");

		element(by.partialLinkText("Checkout")).getText().then(function(text) {
			var count = text.split("(");
			/*var checkoutC=count[1].trim().charAt(0);
			console.log(checkoutC);*/

			expect(count[1].trim().charAt(0)).toBe("2");

		})
	})
})
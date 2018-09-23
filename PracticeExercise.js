describe("add to cart", function() {

	function addToCart(product) {
		element.all(by.tagName("app-card")).each(function(item) {

			item.element(by.css("h4 a")).getText().then(function(text) {

				if (text == product) {
					item.element(by.css("[class*='btn-info']")).click();
				}
			})
		})
	}
	it("add to cart test case", function() {

		browser.driver.manage().window().maximize();

		browser.get("https://qaclickacademy.github.io/protocommerce/");

		element(by.linkText("Shop")).click();

		addToCart("iphone X");

		addToCart("Blackberry");

		element(by.partialLinkText("Checkout")).getText().then(function(text) {

			var count = text.split("(");

			var num=Number(count[1].trim().charAt(0));
			
			var y=1+1+num+2+3;
			
			console.log(y);
			//expect(count[1].trim().charAt(0)).toBe("22");
		})

	})
})
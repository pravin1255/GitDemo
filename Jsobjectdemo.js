function car() {
	this.color = "red";
	this.engine = "turbo";
	this.brand = "BMW";
	this.firstinput=element(by.model('first'));
	this.secondinput=element(by.model('second'));
	this.goButton=element(by.id('gobutton'));
	this.result=element(by.css("h2[class='ng-binding']"));
	this.result2=element(by.css("h2[class='ng-binding']"));
	
	
	
	
	this.getUrl = function() {
		browser.get("https://juliemr.github.io/protractor-demo/");
	};
};

/*var c=new car();
c.getModel()
console.log(c.brand);*/ 

module.exports=new car();
describe("before after describe", function(){
	var foo=0;
	
	beforeEach(function(){
		
		foo=0;
		foo+=1;
	})
	
	afterEach(function(){
		
		foo=0;
	})
	it("1st spec", function(){
		expect(foo).toEqual(1);
	})
	
	it("2nd it block", function(){
		
		expect(foo).toEqual(1);
		expect(true).toEqual(true);
	})
})
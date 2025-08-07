package Day4;
	interface Operation {
	    int execute(int a, int b);
	Operation add = (a, b) -> a + b;
	Operation subtract = (a, b) -> a - b;
	Operation multiply = (a, b) -> a * b;
	Operation divide = (a, b) ->  a / b ; 
	}



class Test_Database {

	public static void main(String [] args) {
		Database testdb = new Database("jfc216", "abc123");
		System.out.println(testdb.authenticateUser("jfc216", "abc123"));
		//System.out.println(testdb.checkConnectionOpen());
		//3rd party tax calc test code
		//Tax_Calc_Interface test = new Tax_Calc_Interface();
		//System.out.println(test.calculateTax());

	}
};

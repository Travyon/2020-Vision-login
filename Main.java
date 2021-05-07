package login;

public class Main {

	public static void main(String[] args) {
			IDandPasswords idAndPasswords = new IDandPasswords();
			
			/*This instance sends the login info as an argument to the login
			page, so placing it in a cons
			*/
			LoginPage loginPage = new LoginPage(idAndPasswords.getLoginInfo());
	}
}

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class newAccount
{
	private String accountName, email, password, confirmPassword, description;
	private boolean accountNameTest, emailTest, passwordTest, confirmPasswordTest,atSign, dot, b;

	
	public newAccount(String n, String e, String p, String cp, String de)
	{
	
		SignUp su = new SignUp();
		
		accountName = n;
		email = e;
		password = p;
		confirmPassword = cp;
		description= de;
		
		if(description.length() < 1)
			description = " ";
		
		//Default booleans
		accountNameTest= false;
		emailTest= false;
		passwordTest= false;
		confirmPasswordTest= false;
		atSign= false;
		dot= false;
		
		//Logic
		if(accountName.length()>=1)
			accountNameTest = true;
		emailTest= su.emailTesting(email);
		if(password.length() >=1)
			passwordTest = true;
		if(password == confirmPassword)
			confirmPasswordTest = true;
	}
	
	// Creating account
	public void AccountCreate(String c,String n, String e, String p, String de){
			String array[] = new String[5];
			array[0] = c;
			array[1] = n;
			array[2] = e;
			array[3] = p;
			array[4]= de;
			for(int i = 0; i < array.length; i++)
			{
				System.out.println(array[i]);
			}
	}

	

	public boolean AccountNameTest() {
		return accountNameTest;
	}

	public boolean EmailTest() {
		return emailTest;
	}


	public boolean PasswordTest() {
		return passwordTest;
	}

	public boolean ConfirmPasswordTest() {
		return confirmPasswordTest;
	}

	
}

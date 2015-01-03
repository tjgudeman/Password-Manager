import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class newAccount
{
	private String accountName, email, password, confirmPassword, description;
	private boolean accountNameTest, emailTest, passwordTest, confirmPasswordTest,atSign, dot;

	
	public newAccount(String n, String e, String p, String cp, String de)
	{
	
		accountName = n;
		email = e;
		password = p;
		confirmPassword = cp;
		description= de;
		
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
		emailTest= emailTesting(email, emailTest);
		if(password.length() >=1)
			passwordTest = true;
		if(password == confirmPassword)
			confirmPasswordTest = true;
	}
	public void AccountCreate(String c,String n, String e, String p, String de){
//		try {
			String array[] = new String[5];
			array[0] = c;
			array[1] = n;
			array[2] = e;
			array[3] = p;
			array[4]= de;
//			String filename = fn + ".txt";
//		    File file = new File (filename);
//		    PrintWriter pw = new PrintWriter (file);
//		    for(int i = 0; i < array.length; i ++){
//		    	if (i == 0){
//		    		pw.print(array[i]);
//		    	}
//		    	else{
//		    		pw.print(", " + array[i]);
//		    	}
//		    }
//		    pw.close (); 
//		    System.out.print("done");
//} catch (FileNotFoundException) {
			// TODO Auto-generated catch block
//			p3.printStackTrace();
			for(int i = 0; i < array.length; i++)
			{
				System.out.println(array[i]);
			}
	}
//	}
	

	
	
	public boolean emailTesting(String a, boolean b)
	{
		if(a.length()>=1)
		{
			for(int i = 0; i < a.length(); i++)
			{
				if(a.charAt(i) == '@')
					atSign= true;
					if(a.charAt(i)== '.')
					dot= true;
			}
			if( atSign ==true && dot == true)
				b= true;
			else{
				b = false;
			}
		}
		return b;
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

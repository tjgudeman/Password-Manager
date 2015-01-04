import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class SignUp
{
	private File file;
	private String firstName;
	private String lastName;
	private String email;
	private String emailRecovery;
	private String username;
	private String password;
	private String passwordConfirm;
	private boolean firstNameTest;
	private boolean lastNameTest;
	private boolean emailTest;
	private boolean emailRecoveryTest;
	private boolean usernameTest;
	private boolean passwordTest;
	private boolean passwordConfirmTest;
	private boolean atSign;
	private boolean dot;

	
	public SignUp(String fn, String ln, String e, String re, String p, String cp, String un)
	{	
		//Assigning strings from JTextFields
		firstName = fn;
		lastName= ln;
		email= e;
		emailRecovery=re;
		password=p;
		passwordConfirm=cp;
		username = un;
		
		
		//Default booleans
		firstNameTest= false;
		lastNameTest=false;
		emailTest= false;
		emailRecoveryTest= false;
		passwordTest= false;
		passwordConfirmTest= false;
		atSign= false;
		dot= false;
		
		//Logic 
		if(firstName.length()>=1)
			firstNameTest = true;
		if(lastName.length()>=1)
			lastNameTest=true;
		emailTest= emailTesting(email, false);
		emailRecoveryTest = RecEmailTesting(emailRecovery, false);
		if(username.length()>=1)
			usernameTest=true;
		if(password.length() >=1)
			passwordTest = true;
		else
			passwordTest = false;
		if(password.equals(passwordConfirm))
			passwordConfirmTest= true;
		
	
	}
	
	//Email Test Class (so it can be duplicated for the recovery email)
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
	
	public boolean RecEmailTesting(String a, boolean b)
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
		else{
			b = true;
		}
		return b;
	}
	
	public boolean UserCheck(){
		String s = rotate(username);
		String filename = "C:\\PasswordManager\\" + s + ".pwm";
		if (new File(filename).isFile()){
			return false;
		}
		else{
			return true;
		}
		
	}
	
	public void AccountCreate(String fn, String ln, String e, String re, String p, String un){
		try {
			String array[] = new String[6];
			array[0] = fn;
			array[1] = ln;
			array[2] = e;
			array[3] = re;
			array[4] = un;
			array[5] = p;
			
			
			
			String s = rotate(un);
			String dir = "C:\\PasswordManager";
			String filename = dir + "\\" + s + ".pwm";
			String masterFile = dir + "\\master.pwm";
			Path Mpath = Paths.get(masterFile);
			Path Fpath = Paths.get(filename);
			
			File fileDir = new File(dir);
			if (!fileDir.exists()) {
				if (fileDir.mkdir()) {
				} else {
					System.out.println("Failed to create directory!");
				}
			}
			
			File mFile = null;
			if(!Files.exists(Mpath)){
				mFile = new File(masterFile);
				PrintWriter PWtmp = new PrintWriter(mFile);
				PWtmp.close();
			}
			
			File uFile = null;
			if(!Files.exists(Fpath)){
				uFile = new File(filename);
				PrintWriter PWtmp = new PrintWriter(uFile);
				PWtmp.close();
			}

			try {
			FileWriter fw = new FileWriter(masterFile, true);
			BufferedWriter bw = new BufferedWriter(fw);
			for(int i = 0; i < array.length; i ++) {
		    		bw.write(array[i] + " ");
		    }
		    bw.newLine();
		    bw.close();
		    
			} catch(Exception ex) {
				System.out.println(ex);
			}
		    
		} catch (FileNotFoundException p3) {
			System.out.print("Sean, your dumb");
			p3.printStackTrace();
		}
	}
	
	public String rotate(String un){
		String str = "";
        for (int i = 0; i < un.length(); i++) 
        {
            char c = un.charAt(i);
            if       (c >= 'a' && c <= 'm') c += 13;
            else if  (c >= 'A' && c <= 'M') c += 13;
            else if  (c >= 'n' && c <= 'z') c -= 13;
            else if  (c >= 'N' && c <= 'Z') c -= 13;
            str += c;
        }
        return str;
	}
	public boolean isFirstNameTest() {
		return firstNameTest;
	}


	public boolean isLastNameTest() {
		return lastNameTest;
	}

	public boolean isUsernameTest() {
		return usernameTest;
	}


	public boolean isEmailTest() {
		return emailTest;
	}

	public boolean isEmailRecoveryTest() {
		return emailRecoveryTest;
	}

	public boolean isPasswordTest() {
		return passwordTest;
	}

	public boolean isPasswordConfirmTest() {
		return passwordConfirmTest;
	}
}


<<<<<<< HEAD
=======
<<<<<<< HEAD

public class Login {
	
	public Login(/* username and password */){
		
=======
>>>>>>> 0feb6e793c2980dccd3f720995334ce2f37cefb6
import java.io.File;


<<<<<<< HEAD

public class Login {
	private String username;
	private String password;
	private File mf;
	public Login(String un, String pass){
		username = un;
		password = pass;
		
		checkCred(username, password);
	}
	
	public boolean checkCred(String un, String pass){
		mf = new File("C:\\PasswordManager\\master.pmw");
		
		return null;
=======
>>>>>>> origin/master

public class Login {
	private String username;
	private String password;
	private File mf;
	public Login(String un, String pass){
		username = un;
		password = pass;
		
		checkCred(username, password);
	}
	
	public boolean checkCred(String un, String pass){
		mf = new File("C:\\PasswordManager\\master.pmw");
		
		return null;
<<<<<<< HEAD
=======
>>>>>>> fa41949a09fa10d0f3cf3cd4cd68d5de505acf16
>>>>>>> 0feb6e793c2980dccd3f720995334ce2f37cefb6
	}

}

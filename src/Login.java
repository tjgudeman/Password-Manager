import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;




public class Login {
	private boolean check;
	public Login(String u, String p){
		String userFile = rotate(u);
		String path = new String("C:\\PasswordManager\\master.pwm");
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
	
	public boolean readFile(String file, String u, String p) throws IOException{
		BufferedReader s = new BufferedReader(new FileReader(file));
		String line;
		line = s.readLine();
		while(line != null) {
			try {
			    String[] splitArray = line.split("\\s");
				if(checkCred(splitArray, u, p)){
			    	check = true;
			    	break;
			    }
			    else{
			    	check = false;
			    }
			} catch (PatternSyntaxException ex) {
			    System.out.print(ex);
			}
			line = s.readLine();
		}
		s.close();
		return check;
	}
	
	public boolean checkCred(String[] arr, String u, String p){
		if (arr[4].equals(u)){
			if (arr[5].equals(p)){
				return true;
			}
			else{
				return false;
			}
		}
		else{
			return false;
		}
	}

}

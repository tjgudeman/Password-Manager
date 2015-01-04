import java.io.*;
import java.util.ArrayList;
import java.util.regex.PatternSyntaxException;

public class DataDriver {
	private int lineCount;
	
	public DataDriver()
	{
	}
	
	
	public void SaveData(String filename, String an, String e, String p, String d, String c)
	{
	    String accountName = an;
	    String email = e;
	    String password = p;
	    String description = d;
	    String category = c;

    	String myArray[] = new String[5];
    	
    	myArray[0] = accountName;
    	myArray[1] = email;
    	myArray[2] = password;
    	myArray[3] = description;
    	myArray[4] = category;
    	
		try{
			FileWriter fw = new FileWriter(filename, true);
			BufferedWriter bw = new BufferedWriter(fw);
			for(int j = 0; j < myArray.length; j++){
				bw.append(myArray[j] + ",");
				if(j == myArray.length - 1){
					
					bw.append(Math.random() * 1000000 + ",");
					
				}
				
	    }
	    bw.newLine();
	    
	    bw.close();
	    fw.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}	
	}
		public void editData(String filename, String an, String e, String p, String d, String c, String k) throws IOException{
			BufferedReader s = new BufferedReader(new FileReader(filename));
		    ArrayList<String> lines = new ArrayList<String>();
			String line;
			line = s.readLine();
			while(line != null) {
				try {
				    String[] splitArray = line.split(",");
					if(splitArray[5].equals(k)){
				    	lines.add(an + "," + e + "," + p + "," + d + "," + c + "," + k + ",");
				    }
				    else{
				    	lines.add(splitArray[0] + "," + splitArray[1] + "," + splitArray[2] + "," + splitArray[3] + "," + splitArray[4] + "," + splitArray[5] + ",");
				    }
				} catch (PatternSyntaxException ex) {
				    System.out.print(ex);
				}
				line = s.readLine();
			}
			s.close();
			FileWriter fw = new FileWriter(filename);
			BufferedWriter bw = new BufferedWriter(fw);
			for(String l: lines)
			{
				bw.append(l);
				bw.newLine();
			}
			bw.close();
			fw.close();
		}
}

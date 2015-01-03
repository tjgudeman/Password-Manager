import org.json.*;
import java.io.*;
import java.util.ArrayList;

public class DataDriver {
	public ArrayList<Account> AccountList;
	
	public DataDriver()
	{
		AccountList = new ArrayList<Account>();
	}
//	public boolean GetMasterAccount(String filename, String password)
//	{
//		try{
//			JSONTokener reader = new JSONTokener(new FileReader(filename));
//			Object o = reader.nextValue();
//			
//		}
//		catch(Exception e)
//		{
//			
//		}
//	}
	
	public void CreateMasterAccount(String filename, JSONObject masterAccount)
	{
		
	}
	
	public void LoadData(String filename)
	{
		try{
			JSONTokener reader = new JSONTokener(new FileReader(filename));
			do
			{
				AccountList = new ArrayList<Account>();
				Object o = reader.nextValue();
				String s = o.toString();
				String [] results = s.substring(1, s.length() - 1).split(",");
				String AccountName = results[0].substring(results[0].indexOf(':') + 2, results[0].length() - 1);
				String Email = results[1].substring(results[1].indexOf(':') + 2, results[1].length() - 1);
				String Description = results[2].substring(results[2].indexOf(':') + 2, results[2].length() - 1);
				String Category = results[3].substring(results[3].indexOf(':') + 2, results[3].length() - 1);
				String Password = results[4].substring(results[4].indexOf(':') + 2, results[4].length() - 1);
				Account a = new Account(AccountName, Email, Description, Category, Password);
				AccountList.add(a);
			} while(!reader.end());
		}
		catch(Exception e)
		{
			//Error reading from the file.
		}
	}
	
	public void SaveData(String filename)
	{
		JSONObject obj;
		
	    String accountName = "";
	    String email = "";
	    String password = "";
	    String description = "";
	    String category = "";

	    
	    for(int i = 0; i < AccountList.size(); i++)
	    {
	    	obj = new JSONObject();
		    try{
			    obj.put("Account Name", AccountList.get(i).getAccountName());
			    obj.put("Email", AccountList.get(i).getEmail());
			    obj.put("Password", AccountList.get(i).getPassword());
			    obj.put("Description", AccountList.get(i).getDescription());
			    obj.put("Category", AccountList.get(i).getCategory());
		    }
		    catch (Exception e) {
		    	//Error setting up the JSONObject
		    }
		    try{
		    	FileWriter file = new FileWriter("c:\\test.json");
		    	file.write(obj.toString());
		    	file.flush();
		    	file.close();
		    }
		    catch (Exception e)
		    {
		    	//Error writing to the file
		    }
	    }

	}
}

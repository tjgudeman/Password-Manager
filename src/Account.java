public class Account {
	private String accountName;
	private String email;
	private String password;
	private String description;
	private String category;
	
	public Account()
	{
		this.accountName = "";
		this.email = "";
		this.password = "";
		this.description = "";
		this.category = "";
	}
	
	public Account(String accountName, String email, String password, String description, String category)
	{
		this.accountName = accountName;
		this.email = email;
		this.password = password;
		this.description = description;
		this.category = category;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}


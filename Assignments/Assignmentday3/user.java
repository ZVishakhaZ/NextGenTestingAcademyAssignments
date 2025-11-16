package Assignmentday3;

public class user {
	
	private String username;
	private String password;
	
	public user(String username, String password) {
		this.username=username;
		
		if(password!=null && password.length()>=8) {
			this.password=password;
			}
		else {
			System.out.println("Password is too short");
			this.password=null;
			
		}
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	 public void setPassword(String newPassword) {
	        if (newPassword != null && newPassword.length() >= 8) {
	            this.password = newPassword;
	            System.out.println("Password updated successfully.");
	        } else {
	            System.out.println("Error: Password change failed. New password must be at least 8 characters long.");
	        }

}
	 public static void main(String[] args) {
	        user user1 = new user("john_doe", "short"); // Initial password too short
	        System.out.println("User1 username: " + user1.getUsername());
	        System.out.println("User1 password: " + user1.getPassword()); // Will be null or default

	        user user2 = new user("jane_smith", "strongpassword123");
	        System.out.println("User2 username: " + user2.getUsername());
	        System.out.println("User2 password: " + user2.getPassword());

	        user2.setPassword("newpass"); // Attempt to set a short password
	        user2.setPassword("verysecurenewpassword"); // Set a valid password
	        System.out.println("User2 updated password: " + user2.getPassword());
	    }
}


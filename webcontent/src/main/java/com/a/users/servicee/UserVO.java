package com.a.users.servicee;

public class UserVO {
	private String Id;
	private String Password;
	private String Name;
	private String Email;

	public UserVO() {
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String toString() {
		return "UserVO [Id=" + Id + ", Password=" + Password + ", Name=" + Name + ", Email=" + Email + "]";
	}


	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	
}

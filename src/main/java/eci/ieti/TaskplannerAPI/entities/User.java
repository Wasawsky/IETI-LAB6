package eci.ieti.taskplannerapi.entities;


public class User {
    public String idUser;
    public String name;
    public String password;
    public String email;

    public User(String idUser, String name, String password, String email) {
		this.idUser = idUser;
		this.name = name;
		this.password = password;
		this.email = email;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
    public String getIdUser() {
		return idUser;
	}
	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", idUser=" + idUser + ", name=" + name + ", password=" + password + "]";
	}
}
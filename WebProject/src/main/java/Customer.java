
import java.io.Serializable;

public class Customer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String email;
	private String passW;
	
	public Customer() {
		this.email = "";
		this.passW = "";
	}
	
	public Customer(String email, String passW) {
		this.email = email;
		this.passW = passW;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassW() {
		return passW;
	}
	public void setPassW(String passW) {
		this.passW = passW;
	}
}

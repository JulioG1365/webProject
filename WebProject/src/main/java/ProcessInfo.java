

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProcessInfo
 */
import java.sql.*;

@WebServlet("/ProcessInfo")
public class ProcessInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ProcessInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "/DisplayInfo.jsp";
		String email = request.getParameter("email");
		String passW = request.getParameter("passW");
		
		updateDB(email, passW);
		
		Customer cust = new Customer(email, passW); 
		
		
		request.setAttribute("cust", cust);
		getServletContext()
		.getRequestDispatcher(url)
		.forward(request,response);
		
	}
	
	protected void updateDB(String email, String passW) {
		Connection con;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/test1";
			String user = "jadmin";
			String pw = "mediaplayer";
			con = DriverManager.getConnection(url, user, pw);
			Statement s = con.createStatement();
			String query = "INSERT INTO CUSTOMER " + "(email, password, cus_id)" + "VALUES('" + email + "','" + passW + "', NULL)";
			
			s.executeUpdate(query);
		}
		catch (ClassNotFoundException e ) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

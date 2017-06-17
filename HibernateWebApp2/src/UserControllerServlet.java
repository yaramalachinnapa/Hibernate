

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class UserControllerServlet
 */
public class UserControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int sno=Integer.parseInt(request.getParameter("sno"));
		String sname = request.getParameter("sname");
		int marks = Integer.parseInt(request.getParameter("marks"));		
 
        HttpSession session = request.getSession(true);
        try {
            UserDAO userDAO = new UserDAO();
            userDAO.addUserDetails(sno, sname, marks);
            response.sendRedirect("Success");
        } catch (Exception e) {
 
            e.printStackTrace();
        }
		
		
	}

}

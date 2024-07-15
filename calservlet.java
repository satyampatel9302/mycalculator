

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class calservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public calservlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String a = request.getParameter("num1");
		String b = request.getParameter("num2");
		String action = request.getParameter("bt");
		
		//type casting
		 int num1 = Integer.parseInt(a);
		 int num2 = Integer.parseInt(b);
		 int ans = Integer.parseInt(action);
		 
		 //perform operation using switch case
		 switch(action) {
		 case "1":
		  ans = num1+num2;
		  break;
		  
		 case "2":
			 ans = num1-num2;
			 break;
			 
		 case "3":
			 ans = num1*num2;
			 break;
			 
		 case "4":
			 ans = num1/num2;
			 break;
			 
		 default:
			 response.getWriter().println("Invalid Choies"+action);
			 break;
		 }
		//result
		 response.getWriter().println("Ans  = " +ans);
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

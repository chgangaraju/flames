package flames;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class FlamesServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException
	{
		resp.setContentType("text/html");
		String name1=req.getParameter("name1");
		String name2=req.getParameter("name2");
		sample s=new sample();
		String res=s.compute(name1, name2);
		
		resp.getWriter().println("<html>"+"<head>");
		resp.getWriter().println("");
		//RequestDispatcher rd = req.getRequestDispatcher("output.jsp");
	    //req.setAttribute("res",res);
	    //try {
		//	rd.forward(req,resp);
		//} catch (ServletException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}
		//resp.getWriter().println("<LINK REL=StyleSheet HREF="flames\style.css" TYPE="/text/css/" MEDIA=screen>");
		resp.getWriter().println("<link rel='stylesheet' type='text/css' href='/style.css' media='all'/>");
		resp.getWriter().println("</head>");
		resp.getWriter().println("<body>");
		resp.getWriter().println("<h1><center>Thank You for using flames!</center></h1>");
		resp.getWriter().println("<br><br><br><br><br><br>");
		resp.getWriter().println("<h1><b><center>The Relation between "+name1+" and "+name2+" was "+res+"</center></b></h1><br><br><br>");
		resp.getWriter().println("<center><a href='/index.html'>Check Again with different names...</a></center>");
		resp.getWriter().println("<br><br><br><br><br><br><br><br><br><br>");
		resp.getWriter().println("<center>This is a sample application.The results may not be accurate..</center>");
		resp.getWriter().println("<center>&copy;Gangaraju Chaganti</center>");
		resp.getWriter().println("</body>"+"</html>");
	}
}

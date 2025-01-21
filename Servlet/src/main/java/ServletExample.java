// Java program to show servlet example 
// Importing required Java libraries 
import java.io.*; 
import javax.servlet.*; 
import javax.servlet.http.*; 

// Extend HttpServlet class 
public class ServletExample  extends HttpServlet 
{ 
private String output; 
	
// Initializing servlet 
public void init() throws ServletException 
{ 
	output = "Initializing Servlet"; 
} 

// Requesting and printing the output 
public void service(ServletRequest req, ServletResponse res)
		throws ServletException, IOException
	{ String name=req.getParameter("name");
	int n=Integer.parseInt(req.getParameter("age"));
	res.setContentType("text/html");
	PrintWriter pw = res.getWriter();
	if(n>=18){
		
		pw.println(name+" you are elegible to vote");
		System.out.println("in service");}
	
  else {
	pw.println(name+" you are not elegible to vote");
	System.out.println("in service");}
}

	public void destroy() 
	{ 
		System.out.println("Over"); 
	} 
} 



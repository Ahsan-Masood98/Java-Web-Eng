package com.ahsan;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ahsan.entity.user_details;
///**
// * Servlet implementation class LoginFormController
// */
@WebServlet("/LoginFormController")
public class LoginFormController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<user_details> list = new ArrayList<user_details>();
//    /**
//     * Default constructor. 
//     */
    public LoginFormController() {
    }

//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		out.println();
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String action = request.getParameter("action");
		String id = request.getParameter("id");
		String column_name = request.getParameter("column_name");
		String updatedData = request.getParameter("updatedData");
		
		out.println("<h1> Userame " + username +"</h1>");
		out.println("<h1> Email " + email +"</h1>>");
		out.println("<h1> Password " + password +"</h1>");
		out.println("<h1> Action " + action +"</h1>");
		out.println("<h1> ID " + id +"</h1>");
		out.println("<h1> Column Name " + column_name +"</h1>");
		out.println("<h1> Updated Data " + updatedData +"</h1>");
		
		//TO CONNCET TO MYSQL
		//1st Step CREATE CLASS PATH
		//2nd connection stable kerain gay
		//3rd query declare kerain gay
		//4th statement execute kerain gay
		
		try {
			//Creating Class Path
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Establishing a Stable Connection 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bootcamp_lab3","root","root");
			switch(action) {
			case "get":{
				//Query Declaration
				String query ="select * from user_detail";
				Statement st = con.createStatement();
				//Query Execution
				ResultSet rs = st.executeQuery(query);
				while(rs.next()) {
					list.add(new user_details(Integer.parseInt(rs.getString("id")), rs.getString("username"),  
							rs.getString("email_id"), rs.getString("password")));
					}
				request.setAttribute("list_of_users", list);
				request.getRequestDispatcher("showDetails.jsp").forward(request, response);
				break;
				}
			case "add":{
				//Query Declaration
				String query = "INSERT INTO user_detail (username, email_id, password) VALUES (?,?,?)";
				PreparedStatement ps= con.prepareStatement(query);
				ps.setString(1, username);
				ps.setString(2, email);
				ps.setString(3, password);
				//Query Execution
				ps.executeUpdate();
				out.println("Added Successfully");
				break;
			}
			case "update":{
				//Query Declaration
				String query ="update user_detail set "+ column_name +" = ? where id= ?";
				PreparedStatement ps = con.prepareStatement(query);
				ps.setString(1, updatedData);
		        ps.setString(2, Integer.parseInt(id)+"");
		        //Query Execution
		        ps.executeUpdate();
				out.println("Updated Successfully");
				break;
			}
			case "delete":{
				//Query Declaration
				String query ="delete from  user_detail " + "where id="+Integer.parseInt(id);
				PreparedStatement ps = con.prepareStatement(query);
				//Query Execution
			    ps.executeUpdate();	
				out.println("Deleted Successfully");
				break;
			}
			default:
				out.println("wrong input in action");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
 	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}

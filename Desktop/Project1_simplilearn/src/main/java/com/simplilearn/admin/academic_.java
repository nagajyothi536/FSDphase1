package com.simplilearn.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.sql.DataSource;

//import com.simplilearn.models.Class;
import com.simplilearn.models.Class1;
import com.simplilearn.models.Student;
import com.simplilearn.models.Subject;
import com.simplilearn.models.Teacher;

/**
 * Servlet implementation class AdminControllerServlet
 */




@WebServlet("/academic1")
public class academic_ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

			doGet(req, resp);
			
		}

		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			// TODO Auto-generated method stub
			try {

				// read the "command" parameter
				String command = request.getParameter("command");

				if (command == null) {
					command = "CLASSES";
				}
				
				// if no cookeies
				if (!getCookies(request, response) && (!command.equals("LOGIN"))) {

					response.sendRedirect("/Project1_simplilearn/login.jsp");
				}

				else {

					// if there is no command, how to handle

					// route the data to the appropriate method
					switch (command) {

					case "STUDENTS":
						studentsList(request, response);
						break;

					case "TEACHERS":
						teachersList(request, response);
						break;

					case "SUBJECTS":
						subjectList(request, response);
						break;

					case "CLASSES":
						classestList(request, response);
						break;

					case "ST_LIST":
						classStudentsList(request, response);
						break;

					case "LOGIN":
						login(request, response);
						break;

					default:
						classestList(request, response);

					}
				}
			} catch (Exception e) {
				throw new ServletException(e);
			}
			// response.getWriter().append("Served at: ").append(request.getContextPath());
		}

		private void studentsList(HttpServletRequest request, HttpServletResponse response) throws Exception {
			// get students from db util
			List<Student> students = new ArrayList<>();
		

				Connection myConn = null;
				Statement myStmt = null;
				ResultSet myRs = null;
		
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					//Create Connection object
					String url = "jdbc:mysql://localhost:3306/learners_academy";
					String username = "root";
					String password = "root";
					// get a connection
				myConn = DriverManager.getConnection(url,username,password);
					// create sql stmt
					String sql = "SELECT * FROM students";
					myStmt = myConn.createStatement();
		
					// execute query
					myRs = myStmt.executeQuery(sql);
		
					// process result
					while (myRs.next()) {
		
						// retrieve data from result set row
						int id = myRs.getInt("id");
						String firstName = myRs.getString("fname");
						String lastName = myRs.getString("lname");
						int age = myRs.getInt("age");
						int aclass = myRs.getInt("aclass");
		
						// create new student object
						Student tempStudent = new Student(id, firstName, lastName, age, aclass);
		
						// add it to the list of students
						students.add(tempStudent);
		
					}
		
				} catch (Exception e) {
					// TODO: handle exception
				} finally {
					// close JDBC objects
					close(myConn, myStmt, myRs);
				}
				//return students;
		
			
				// add students to the request
			request.setAttribute("STUDENT_LIST", students);

			// send it to the jsp view page
			RequestDispatcher dispatcher = request.getRequestDispatcher("/list_students.jsp");
			dispatcher.forward(request, response);

		}

		private void teachersList(HttpServletRequest request, HttpServletResponse response) throws Exception {
			// get students from db util
			List<Teacher> teachers = new ArrayList<>();
			

				Connection myConn = null;
				Statement myStmt = null;
				ResultSet myRs = null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Create Connection object
		String url = "jdbc:mysql://localhost:3306/learners_academy";
		String username = "root";
		String password = "root";

		
					// get a connection
				myConn = DriverManager.getConnection(url,username,password);
		
					// create sql stmt
					String sql = "SELECT * FROM teachers";
					myStmt = myConn.createStatement();
		
					// execute query
					myRs = myStmt.executeQuery(sql);
		
					// process result
					while (myRs.next()) {
		
						// retrieve data from result set row
						int id = myRs.getInt("id");
						String firstName = myRs.getString("fname");
						String lastName = myRs.getString("lname");
						int age = myRs.getInt("age");
		
						// create new student object
						Teacher temp = new Teacher(id, firstName, lastName, age);
		
						// add it to the list of students
						teachers.add(temp);
		
					}
		
				} catch (Exception e) {
					// TODO: handle exception
				} finally {
					// close JDBC objects
					close(myConn, myStmt, myRs);
				}
		
		
			// add students to the request
			request.setAttribute("TEACHERS_LIST", teachers);

			// send it to the jSP view page
			RequestDispatcher dispatcher = request.getRequestDispatcher("/teacher-list.jsp");
			dispatcher.forward(request, response);

		}

		private void subjectList(HttpServletRequest request, HttpServletResponse response) throws Exception {
			// get subjects from db util
			List<Subject> subjects = new ArrayList<>();
			
				Connection myConn = null;
				Statement myStmt = null;
				ResultSet myRs = null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Create Connection object
		String url = "jdbc:mysql://localhost:3306/learners_academy";
		String username = "root";
		String password = "root";


		
					// get a connection
				myConn = DriverManager.getConnection(url,username,password);
			String sql = "SELECT * FROM subjects";
					myStmt = myConn.createStatement();
		
					// execute query
					myRs = myStmt.executeQuery(sql);
		
					// process result
					while (myRs.next()) {
		
						// retrieve data from result set row
						int id = myRs.getInt("id");
						String name = myRs.getString("name");
						//String shortcut = myRs.getString("shortcut");
		
						// create new student object
						Subject temp = new Subject(id, name);
		
						// add it to the list of students
						subjects.add(temp);
		
					}
		
				} catch (Exception e) {
					// TODO: handle exception
				} finally {
					// close JDBC objects
					close(myConn, myStmt, myRs);
				}
		

			// add subjects to the request
			request.setAttribute("SUBJECTS_LIST", subjects);

			// send it to the jSP view page
			RequestDispatcher dispatcher = request.getRequestDispatcher("/subjects-list.jsp");
			dispatcher.forward(request, response);

		}

		private void classestList(HttpServletRequest request, HttpServletResponse response) throws Exception {
			// get subjects from db util
			List<Class1> classes = new ArrayList<>();
			PrintWriter out = response.getWriter();
				Connection myConn = null;
				Statement myStmt = null;
				ResultSet myRs = null;
	try {

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Create Connection object
		String url = "jdbc:mysql://localhost:3306/learners_academy";
		String username = "root";
		String password = "root";

		
					// get a connection
				myConn = DriverManager.getConnection(url,username,password);
				String sql = "SELECT * FROM classes";
					myStmt = myConn.createStatement();
		
					// execute query
					myRs = myStmt.executeQuery(sql);
		
					// process result
					while (myRs.next()) {
		
						// retrieve data from result set row
						int id = myRs.getInt("id");
						out.println(id);
						int section = myRs.getInt("section");
						out.println(section);
						int subject = myRs.getInt("subject");
						out.println(subject);
						int teacher = myRs.getInt("teacher");
						out.println(teacher);
						String time = myRs.getString("time");
						out.println(time);
						Teacher tempTeacher = loadTeacher(teacher);
						Subject tempSubject = loadSubject(subject);
		
						String teacher_name = tempTeacher.getFname() + " " + tempTeacher.getLname();
		
						// create new student object
						Class1 temp = new Class1(id, section, teacher_name, tempSubject.getName(), time);
		
						// add it to the list of students
						classes.add(temp);
		
					}
		
				} catch (Exception e) {
					// TODO: handle exception
				} finally {
					// close JDBC objects
					close(myConn, myStmt, myRs);
				}
		
			// add subjects to the request
			request.setAttribute("CLASSES-LIST", classes);

			// send it to the jSP view page
			RequestDispatcher dispatcher = request.getRequestDispatcher("/classes-list.jsp");
			dispatcher.forward(request, response);

		}
		public Teacher loadTeacher(int teacherId) throws ClassNotFoundException {
			Teacher theTeacher = null;
			

			Connection myConn = null;
			Statement myStmt = null;
			ResultSet myRs = null;
	
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//Create Connection object
				String url = "jdbc:mysql://localhost:3306/learners_academy";
				String username = "root";
				String password = "root";
	
				// get a connection
				myConn = DriverManager.getConnection(url,username,password);
	
				// create sql stmt
				String sql = "SELECT * FROM teachers WHERE id = " + teacherId;
				myStmt = myConn.createStatement();
	
				// execute query
				myRs = myStmt.executeQuery(sql);
	
				// process result
				while (myRs.next()) {
	
					// retrieve data from result set row
					int id = myRs.getInt("id");
					String fname = myRs.getString("fname");
					String lname = myRs.getString("lname");
					int age = myRs.getInt("age");
					theTeacher = new Teacher(id, fname, lname, age);
	
				}
	
			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				// close JDBC objects
				close(myConn, myStmt, myRs);
			}
			return theTeacher;
		}
		public Subject loadSubject(int subjectId) throws ClassNotFoundException {
			
			Subject theSubject = null;
			

			Connection myConn = null;
			Statement myStmt = null;
			ResultSet myRs = null;
	
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//Create Connection object
				String url = "jdbc:mysql://localhost:3306/learners_academy";
				String username = "root";
				String password = "root";
	
				// get a connection
				myConn = DriverManager.getConnection(url,username,password);
	
				// create sql stmt
				String sql = "SELECT * FROM subjects WHERE id = " + subjectId;
				myStmt = myConn.createStatement();
	
				// execute query
				myRs = myStmt.executeQuery(sql);
	
				// process result
				while (myRs.next()) {
	
					// retrieve data from result set row
					int id = myRs.getInt("id");
					String name = myRs.getString("name");
					//String shortcut = myRs.getString("shortcut");
	
					theSubject = new Subject(id, name);
	
				}
	
			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				// close JDBC objects
				close(myConn, myStmt, myRs);
			}
			return theSubject;
	
		}
	

		private void login(HttpServletRequest request, HttpServletResponse response) throws Exception {
			String username = request.getParameter("username");
			String password = request.getParameter("password");

			if (username.toLowerCase().equals("admin") && password.toLowerCase().equals("admin")) {

				Cookie cookie = new Cookie(username, password);

				// Setting the maximum age to 1 day
				cookie.setMaxAge(86400); // 86400 seconds in a day

				// Send the cookie to the client
				response.addCookie(cookie);
				classestList(request, response);
			} else {
				RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
				dispatcher.forward(request, response);
			}

		}

		private void classStudentsList(HttpServletRequest request, HttpServletResponse response) throws Exception {

			int classId = Integer.parseInt(request.getParameter("classId"));
			String section = request.getParameter("section");
			String subject = request.getParameter("subject");

			// get subjects from db util
			List<Student> students = new ArrayList<>();
			

				Connection myConn = null;
				Statement myStmt = null;
				ResultSet myRs = null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Create Connection object
		String url = "jdbc:mysql://localhost:3306/learners_academy";
		String username = "root";
		String password = "root";

		
					// get a connection
				myConn = DriverManager.getConnection(url,username,password);
				String sql = "SELECT * FROM students WHERE class = " + classId;
					myStmt = myConn.createStatement();
		
					// execute query
					myRs = myStmt.executeQuery(sql);
		
					// process result
					while (myRs.next()) {
		
						// retrieve data from result set row
						int id = myRs.getInt("id");
						String firstName = myRs.getString("fname");
						String lastName = myRs.getString("lname");
						int age = myRs.getInt("age");
						int aclass = myRs.getInt("class");
		
						// create new student object
						Student tempStudent = new Student(id, firstName, lastName, age, aclass);
						students.add(tempStudent);
		
					}
		
				} catch (Exception e) {
					// TODO: handle exception
				} finally {
					// close JDBC objects
					close(myConn, myStmt, myRs);
				}
		
			// add subjects to the request
			request.setAttribute("STUDENTS_LIST", students);
			request.setAttribute("SECTION", section);
			request.setAttribute("SUBJECT", subject);

			// send it to the jSP view page
		RequestDispatcher dispatcher = request.getRequestDispatcher("/Class_Student.jsp");
			dispatcher.forward(request, response);

		}
		private void close(Connection myConn, Statement myStmt, ResultSet myRs) {
			
			try {
				if (myRs != null) {
					myRs.close();
				}
				if (myStmt != null) {
					myStmt.close();
				}
				if (myConn != null) {
					myConn.close();
				}
	
			} catch (Exception e) {
				e.printStackTrace();
			}
	
		}
	


		private boolean getCookies(HttpServletRequest request, HttpServletResponse response) throws Exception {

			boolean check = false;
			Cookie[] cookies = request.getCookies();
			// Find the cookie of interest in arrays of cookies
			for (Cookie cookie : cookies) {
				 
				if (cookie.getName().equals("admin") && cookie.getValue().equals("admin")) {
					check = true;
					break;
				} 

			}
			
			
			return check;

		}

	}

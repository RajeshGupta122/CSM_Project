package com.csmtech.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.csmtech.entity.Schlorship;
import com.csmtech.entity.Student;
import com.csmtech.util.DbUtil;

public class FrontController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		//pw.println("working..");
		Session session=DbUtil.getSessionFactory().openSession();
		//pw.println(session.createQuery("From Branch").list());
		//pw.println(session.createQuery("From Schlorship").list());
		//pw.println(session.createQuery("From Student").list());
		//List<Student> studentList=session.createQuery("From Student").list();
//		for(Student x:studentList) {
//			pw.println(x);
//			System.out.println(x);
//		}
		//Student x=session.get(Student.class, 101l);
		Schlorship x1=session.get(Schlorship.class, 3l);
		pw.println(x1+" "+x1.getStudent());
	}

}

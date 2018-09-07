package com.servlet;

import com.service.UserService;
import com.service.impl.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="LoginServlet", urlPatterns={"/LoginServlet","/login"},loadOnStartup=1)
public class LoginServlet extends HttpServlet {
    @Autowired
    UserService us=new IUserService();
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
        doPost(request, response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");
        UserService us=new IUserService();
        System.out.println(us.toString());
        if(us.login(name, pwd)){
            request.setAttribute("message", "欢迎用户"+name);
            request.getRequestDispatcher("./success.jsp").forward(request, response);
        }else {
            response.sendRedirect("index.jsp");
        }
    }
}

package quanly.quanlynhansu.controller;

import quanly.quanlynhansu.StaffService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "staffServlet", value = {"", "/staff"})
public class StaffController extends HttpServlet {
    @Override
    public void init() throws ServletException {
        StaffService staffService = new StaffService();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getServletPath();
        switch (action) {
            case "":
                request.setAttribute("staffs", StaffService.findAll());
                request.getRequestDispatcher("/WEB-INF/view/manager.jsp").forward(request,response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

package az.eminbadalzade.controller;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "ControllerServlet", value = "/cs")
public class ControllerServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello emilya";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");

        // Test
    }
}
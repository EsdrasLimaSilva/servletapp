
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/first")
public class First extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        // Set the content type and character encoding for the response
        res.setContentType("text/plain");
        res.setCharacterEncoding("UTF-8");

        // Write the "Hello, World!" message to the response
        res.getWriter().write("Hello, World!");
    }
}
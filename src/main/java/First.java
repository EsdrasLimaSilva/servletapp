
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.google.gson.Gson;

import dto.Book;

@WebServlet("/first")
public class First extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("application/json");

        // creating the book dto
        Book book = new Book("First Book", "Jhon Doe");
        Gson gson = new Gson();

        String bookConverted = gson.toJson(book);

        res.getWriter().write(bookConverted);
    }
}
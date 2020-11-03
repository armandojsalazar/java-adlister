import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="CounterServlet", urlPatterns = "/count")

public class CounterServlet extends HttpServlet {

    private int number = 0;
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        number++;
        PrintWriter out = res.getWriter();

            out.println("number: " + number);

    }
}

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Qijia
 * @className ${NAME}
 * @description TODO
 * @date 2021/4/9
 */
public class Welcome extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        String username = request.getParameter("username");
        writer.print("Hello " + username + "!");
        response.setContentType("text/html;charset=utf-8");
    }
}

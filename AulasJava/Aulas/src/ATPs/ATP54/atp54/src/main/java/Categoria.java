import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria")
public class Categoria extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // strings que irão para a URL
        String nome = req.getParameter("nome");
        String descricao = req.getParameter("descricao");

        PrintWriter out = resp.getWriter();
        out.printf("categoria -- cat = %s - %s", nome, descricao);

    }
}

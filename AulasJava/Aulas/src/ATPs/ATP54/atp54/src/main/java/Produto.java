import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/produto")
public class Produto extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        // strings que irão para a URL
        String nome = req.getParameter("nome");
        String parametroValor = req.getParameter("valor");
        String parametroCategoria_id = req.getParameter("id_categoria");

        if (parametroValor != null) {

            float valor = Float.parseFloat(parametroValor);
            out.printf("produto - produto = %s - %f - %d", nome, valor);
        } else {
            out.printf("produto - produto = %s", nome);
        }

        if (parametroCategoria_id != null) {
            int id_categoria = Integer.parseInt(parametroCategoria_id);
            out.printf("produto - produto = %s - %f - %d", nome, id_categoria);
        } else {
            out.printf("produto - produto = %s - %f - %d", nome);
        }

    }
}

package aula41.src.main.java;

import java.io.IOException;
import java.io.PrintWriter;


public class Categoria extends Https {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nome");

        PrintWriter out = resp.getWriter();
        out.printf("Modulo Categoria -- cat = %s", nome );
    }
    
}
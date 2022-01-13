package com.cintiabelem.atp58.servlets;
import java.io.IOException;
import java.io.PrintWriter;

import com.cintiabelem.atp58.models.ProdutoModel;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/produto")
public class ProdutoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProdutoModel prod1 = new ProdutoModel();
        PrintWriter out = resp.getWriter();

        // strings que irão para a URL
        prod1.setNome(req.getParameter("nome"));
        
        String parametroValor = req.getParameter("valor");
        String parametroCategoria_id = req.getParameter("id_categoria");

        if (parametroValor != null && parametroCategoria_id != null) {
            prod1.setValor(Float.parseFloat(parametroValor));
            prod1.setId(Integer.parseInt(parametroCategoria_id));
            
            out.printf("produto - produto = %s - valor: %.2f - id categoria: %d", prod1.getNome(), prod1.getValor(), prod1.getId());
        } else {
            out.printf("produto - produto = %s", prod1.getNome());
        }

    }
}

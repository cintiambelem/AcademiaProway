package com.cintiabelem.atp55.servlets;
import java.io.IOException;
import java.io.PrintWriter;

import com.cintiabelem.atp55.models.CategoriaModel;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria")
public class CategoriaServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CategoriaModel cat1 = new CategoriaModel();

        // strings que irão para a URL
        cat1.setNome(req.getParameter("nome"));
        cat1.setDescricao(req.getParameter("descricao"));

        PrintWriter out = resp.getWriter();
        out.printf("categoria -- cat = %s - %s", cat1.getNome(), cat1.getDescricao());

    }
}

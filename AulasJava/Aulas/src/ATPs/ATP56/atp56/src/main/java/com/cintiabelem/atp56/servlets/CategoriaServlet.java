package com.cintiabelem.atp56.servlets;
import java.io.IOException;
import java.io.PrintWriter;

import com.cintiabelem.atp56.dao.CategoriaDao;
import com.cintiabelem.atp56.models.CategoriaModel;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria")
public class CategoriaServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CategoriaModel model = new CategoriaModel();
        CategoriaDao dao = new CategoriaDao();

        // strings que irão para a URL
        model.setNome(req.getParameter("nome"));
        model.setDescricao(req.getParameter("descricao"));
        int id = dao.insert(model);

        model.setId_categoria(id);

        PrintWriter out = resp.getWriter();
        out.printf("categoria salva -- categoria id %d", model.getId_categoria());

    }
}

package com.cintiabelem.atp56.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import com.cintiabelem.atp56.dao.CategoriaDao;
import com.cintiabelem.atp56.models.CategoriaModel;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria/listar")
public class CategoriaReadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        CategoriaDao dao = new CategoriaDao();

        for (CategoriaModel model : dao.read()) {
            out.printf("%d - %s \n", model.getId_categoria(), model.getNome());
        }

    }

}

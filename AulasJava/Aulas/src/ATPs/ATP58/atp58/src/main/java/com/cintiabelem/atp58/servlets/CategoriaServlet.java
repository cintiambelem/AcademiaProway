package com.cintiabelem.atp58.servlets;
import java.io.IOException;
import com.cintiabelem.atp58.dao.CategoriaDao;
import com.cintiabelem.atp58.models.CategoriaModel;
import jakarta.servlet.RequestDispatcher;
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

       
        model.setNome(req.getParameter("nome"));
        model.setDescricao(req.getParameter("descricao"));
        int id = dao.insert(model);

        model.setId_categoria(id);

        //PrintWriter out = resp.getWriter();
        req.setAttribute("id", model.getId_categoria());
        RequestDispatcher rd = req.getRequestDispatcher("categoria-sucesso.jsp");
        rd.forward(req, resp);

        //out.printf("categoria salva -- categoria id %d", model.getId_categoria());

    }
}

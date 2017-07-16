/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.ads.view.servlet;

import ifpb.ads.cliente.ClienteService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ricardo Job
 */
@WebServlet(name = "ListarClientes", urlPatterns = {"/clientes"})
public class ListarClientes extends HttpServlet {

    @Inject
    private ClienteService service;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ListarClientes</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Todos os Clientes</h1>");
            listarClientes(out);
            out.println("</body>");
            out.println("</html>");
        }
    }

    private void listarClientes(PrintWriter out) {
        service.todosOsClientes().forEach((cliente) -> {
            out.println(String.format("id: %d nome: %s", cliente.getId(), cliente.getNome()));
        });
    }

}

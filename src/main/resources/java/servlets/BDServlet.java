package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import Hibernate.HibernateUtil;
import model.Usuario;

public class BDServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Usuario u = new Usuario();
		u.setNombre("Joaquin");
		u.setApellido("Pega");
		u.setDni(33653285);
		session.save(u);
		session.getTransaction().commit();
		resp.getWriter().write("Se creo un objeto en la bd");
	}

}

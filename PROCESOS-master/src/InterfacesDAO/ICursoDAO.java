/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesDAO;

import Dominio.Curso;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author mario
 */
public interface ICursoDAO {
    
    public ArrayList<Curso> leerTodosLosCursos() throws SQLException, ClassNotFoundException;
    
}

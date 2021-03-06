 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import Dominio.Docente;
import InterfacesDAO.IDocenteDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author gabrielflores
 */
public class DocenteDAO implements IDocenteDAO {
    private ConnectDB connectDB;
    private Connection connection;
    private Statement statement;
    private ResultSet results;
    
    public DocenteDAO () {
        connectDB = new ConnectDB();
    }

    @Override
    public void guardarDocente(String numPersonal, String nombre, String apellidoMaterno, String apellidoPaterno, String curp, String rfc, String fechaNacimiento, String sexo, String contraseña, String correo) throws SQLException, ClassNotFoundException {
        connection = connectDB.getConnection();
        String query = "INSERT INTO docente (numeroDePersonal, nombre, apellidoMaterno, apellidoPaterno, curp, rfc, fechaNacimiento, genero, contraseña, correo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, numPersonal);
        statement.setString(2, nombre);
        statement.setString(3, apellidoMaterno);
        statement.setString(4, apellidoPaterno);
        statement.setString(5, curp);
        statement.setString(6, rfc);
        statement.setString(7, fechaNacimiento);
        statement.setString(8, sexo);
        statement.setString(9, contraseña);
        statement.setString(10, correo);
        statement.executeUpdate();
    }
    
    @Override
    public ArrayList<String> leerTodosLosDocentes() throws SQLException, ClassNotFoundException {
        Connection connection = connectDB.getConnection();
        Docente docente = null;
        ArrayList<String> todosLosDocentes = new ArrayList<>();
        String query = "SELECT * FROM docente";
        PreparedStatement sentence = connection.prepareStatement(query);
        results = sentence.executeQuery();
        while (results.next()) {
            docente = new Docente();
            docente.setCurp(results.getString("curp"));
            todosLosDocentes.add(docente.getCurp());
        }
        connectDB.closeConnection();
        return todosLosDocentes;
    }
    
    
    
    
}


package DataAccess;

import Dominio.PlanDeCurso;
import InterfacesDAO.IPlanDeCursoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PlanDeCursoDAO implements IPlanDeCursoDAO {
    private final ConnectDB connectDB;
    private Connection connection;
    private Statement consultation;
    private ResultSet results;
    
    public PlanDeCursoDAO() {
        connectDB = new ConnectDB();
    }

    @Override
    public void guardarPlanDeCurso(PlanDeCurso planDeCurso) throws SQLException, ClassNotFoundException {
        connection = connectDB.getConnection();
        String query = "INSERT INTO planDeCurso (curso, fechaInicio, fechaFin, temas, fechaTemas, nombreActividades) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1,planDeCurso.getCurso());
        statement.setString(2,planDeCurso.getFechaInicio());
        statement.setString(3,planDeCurso.getFechaFin());
        statement.setString(4,planDeCurso.getTemas());
        statement.setString(5,planDeCurso.getFechaTemas());
        statement.setString(6,planDeCurso.getNombreActividades());
        statement.executeUpdate();
    }
      
        
}

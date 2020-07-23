
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
        String query = "INSERT INTO planDeCurso (curso, nombrePlan, fechaInicio, fechaFin, temas, fechaTemas, nombreActividades) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1,planDeCurso.getCurso());
        statement.setString(2,planDeCurso.getNombrePlan());
        statement.setString(3,planDeCurso.getFechaInicio());
        statement.setString(4,planDeCurso.getFechaFin());
        statement.setString(5,planDeCurso.getTemas());
        statement.setString(6,planDeCurso.getFechaTemas());
        statement.setString(7,planDeCurso.getNombreActividades());
        statement.executeUpdate();
    }
    
    public ArrayList<PlanDeCurso> leerTodosLosPlanes() throws SQLException, ClassNotFoundException{
        connection = connectDB.getConnection();
        PlanDeCurso planDeCurso = null;
        ArrayList<PlanDeCurso> todosLosPlanes = new ArrayList<PlanDeCurso>();
        String query = "SELECT * FROM planDeCurso";
        PreparedStatement statement = connection.prepareStatement(query);
        results = statement.executeQuery();
        while (results.next()) {
            planDeCurso = new PlanDeCurso();
            planDeCurso.setCurso(results.getString("curso"));
            planDeCurso.setNombrePlan(results.getString("nombrePlan"));
            planDeCurso.setFechaInicio(results.getString("fechaInicio"));
            planDeCurso.setFechaFin(results.getString("fechaFin"));
            planDeCurso.setTemas(results.getString("temas"));
            planDeCurso.setFechaTemas(results.getString("fechaTemas"));
            planDeCurso.setNombreActividades(results.getString("nombreActividades"));
            todosLosPlanes.add(planDeCurso);
        }
        return todosLosPlanes;
    }
    
        
}

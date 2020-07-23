package DataAccess;

import Dominio.AvanceDeCurso;
import InterfacesDAO.IAvanceDeCursoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;


public class AvanceDeCursoDAO implements IAvanceDeCursoDAO {
    private final ConnectDB connectDB;
    private Connection connection;
    private Statement consultation;
    private ResultSet results;
    
    public AvanceDeCursoDAO() {
        connectDB = new ConnectDB();
    }
    
    @Override
    public void guardarAvanceDeCurso(AvanceDeCurso avance) throws SQLException, ClassNotFoundException {
        connection = connectDB.getConnection();
        String query = "INSERT INTO avanceDeCurso "
                + "(nombrePlan, fechaAvance, temasAbordados, temasPorVer, actividadesRealizadas, actividadesPorRealizar, porcentajeAvance) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, avance.getNombrePlan());
        statement.setString(2, avance.getFechaAvance());
        statement.setString(3, avance.getTemasAbordados());
        statement.setString(4, avance.getTemasPorVer());
        statement.setString(5, avance.getActividadesRealizadas());
        statement.setString(6, avance.getActividadesPorRealizar());
        statement.setString(7, avance.getPorcentajeAvance());
        statement.executeUpdate();
    }
    
}

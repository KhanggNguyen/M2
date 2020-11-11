package persistence;

import converter.Monnaie;


import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DAOMonnaie {

    private DAOFactory daoFactory;

    public DAOMonnaie(DAOFactory daoFactory){
        this.daoFactory = daoFactory;

        Statement statement = null;
        try{
            Connection connection = this.daoFactory.getConnection();

            String sql = "CREATE TABLE IF NOT EXISTS monnaies " +
                    "(code VARCHAR(5) NOT NULL PRIMARY KEY," +
                    "nom_complet VARCHAR(100)," +
                    "taux float," +
                    "date date," +
                    "heure time)";
            statement = connection.createStatement();
            statement.execute(sql);

            sql = "CREATE TABLE IF NOT EXISTS pays " +
                    "(nom_pays varchar(100) NOT NULL," +
                    "codeRef varchar(5)," +
                    "PRIMARY KEY (nom_pays)," +
                    "CONSTRAINT fk_monnaiespays FOREIGN KEY (codeRef) REFERENCES monnaies(code))";
            statement.execute(sql);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public void addMonnaie(Monnaie m){
        if(!(m.code == null) && !(m.code.length() == 0)) {
            PreparedStatement statement = null;
            try{
                Connection connection = this.daoFactory.getConnection();
                String sql = "INSERT INTO monnaies (code, nom_complet, taux, date, heure) VALUES (?,?,?,?,?) " +
                        "ON DUPLICATE KEY UPDATE taux=?, date=?,heure=?;";
                statement = connection.prepareStatement(sql);
                statement.setString(1, m.code);
                statement.setString(2, m.nomComplet);
                statement.setFloat(3, m.taux);
                statement.setDate(4, new java.sql.Date(new Date().getTime()));
                statement.setTime(5, new java.sql.Time(new Date().getTime()));

                //on update
                statement.setFloat(6, m.taux);
                statement.setDate(7, new java.sql.Date(new Date().getTime()));
                statement.setTime(8, new java.sql.Time(new Date().getTime()));
                statement.executeUpdate();

                for(String pays : m.nom){
                    sql = "INSERT INTO pays (nom_pays, codeRef) VALUES (?,?)" +
                            "ON DUPLICATE KEY UPDATE codeRef=?;";
                    statement = connection.prepareStatement(sql,
                            Statement.RETURN_GENERATED_KEYS);
                    statement.setString(1, pays);
                    statement.setString(2, m.code);
                    statement.setString(3, m.code);
                    statement.executeUpdate();
                }

                connection.close();
            }catch(SQLException e){
                e.printStackTrace();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public Monnaie getMonnaieByCode (String code) {
        Monnaie m = null;

        if (code == null || code.length() == 0)
            return m;
        PreparedStatement statement = null;
        try{
            Connection connection = this.daoFactory.getConnection();
            String sql = "SELECT ∗ FROM monnaies WHERE code=?" +
                    "and date in (SELECT MAX( date ) from monnaies GROUP BY code ) ;";
            statement = connection.prepareStatement(sql);
            statement.setString(1,code);
            ResultSet results = statement.executeQuery(sql);
            results.next();
            if(results != null){
                String name = results.getString("nom_complet");
                //String pays = results.getString("pays");
                List<String> listePays = new ArrayList<>();
                sql = "SELECT * FROM pays WHERE codeRef=?";
                statement = connection.prepareStatement(sql);
                statement.setString(1, code);
                ResultSet results2 = statement.executeQuery(sql);
                while(results2.next()){
                    String pays = results2.getString("nom_pays");
                    listePays.add(pays);
                }
                float taux = results.getFloat("taux");
                m = new Monnaie(listePays, name, code, taux);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally {
            try{
                statement.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
        return m;
    }

    public void removeMonnaieByCode(String code){
        PreparedStatement statement = null;
        try{
            Connection connection = this.daoFactory.getConnection();

            String sql = "DELETE FROM pays WHERE codeRef=?";
            statement = connection.prepareStatement(sql);
            statement.setString(1, code);
            statement.executeUpdate();

            sql = "DELETE FROM monnaies WHERE code=?";
            statement = connection.prepareStatement(sql);
            statement.setString(1, code);
            statement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void updateMonnaie(Monnaie m){
        PreparedStatement statement = null;
        try{
            Connection connection = this.daoFactory.getConnection();
            String sql = "UPDATE monnaies SET nom_complet=?, taux=?, date=?, time=? WHERE code=?";
            statement = connection.prepareStatement(sql);
            statement.setString(1, m.nomComplet);
            statement.setFloat(2, m.taux);
            statement.setDate(3, new java.sql.Date(new Date().getTime()));
            statement.setTime(4, new java.sql.Time(new Date().getTime()));
            statement.setString(5, m.code);
            statement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public List<Monnaie> getAllMonnaies(){
        List<Monnaie> m_list = new ArrayList<>();

        PreparedStatement statement = null;
        try{
            Connection connection = this.daoFactory.getConnection();
            String sql = "SELECT * FROM monnaies";
            statement = connection.prepareStatement(sql);
            ResultSet results = statement.executeQuery(sql);
            while(results.next()){
                String name = results.getString("nom_complet");
                float taux = results.getFloat("taux");
                String code = results.getString("code");

                List<String> listePays = new ArrayList<>();

                String sql2 = "SELECT * FROM pays WHERE codeRef=?;";
                statement = connection.prepareStatement(sql2);
                statement.setString(1, code);
                ResultSet results2 = statement.executeQuery(sql2);
                while(results2.next()){
                    String pays = results2.getString("nom_pays");
                    listePays.add(pays);
                }

                Monnaie m = new Monnaie(listePays, code, name, taux);
                m_list.add(m);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }

        return m_list;
    }
}

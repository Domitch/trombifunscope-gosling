package data;

import model.Student;

import java.sql.*;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Une seule méthode vous est donnée, count(). Inspirez-vous de cet exemple pour écrire
 * les quatre opérations que le PO vous demande (ajouter, consulter, corriger,
 * retirer).
 *
 * Le fonctionnement d'un PreparedStatement est expliqué dans le README de ce dossier.
 */
public class StudentDao {

    /***
     * C'est la requête la plus simple du projet, elle sert de
     * premier test : si elle répond, c'est que la base tourne et est accessible depuis ce projet.
     */
    public int count() throws SQLException {
        String sql = "SELECT count(*) as nbr_student FROM student";

        try (Connection connection = Database.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            resultSet.next();
            return resultSet.getInt("nbr_student");
        }
    }

    public int addStudent(Student newstudent) throws SQLException {
        String addNew = "INSERT INTO student (date_of_birth, real_name, fantastic_name, photo, theme_song, power, weakness, element) VALUES (?, ?,?,?,?,?,?,?)";
        try (Connection connection = Database.getConnection();
             PreparedStatement addData = connection.prepareStatement(addNew)) {
            addData.setDate(1, Date.valueOf(newstudent.getDate_of_birth()));
            addData.setString(2, newstudent.getReal_name());
            addData.setString(3, newstudent.getFantastic_name());
            addData.setString(4, newstudent.getPhoto());
            addData.setString(5, newstudent.getTheme_song());
            addData.setString(6, newstudent.getPower());
            addData.setString(7, newstudent.getWeakness());
            addData.setString(8, newstudent.getElement());
            return addData.executeUpdate();
        }
    }

    /**
     * US6 : affiche une fiche en filtrant par le nom réel.
     */
    public Student findByRealName(String realName) throws SQLException {
        String sql = "SELECT id, date_of_birth, real_name, fantastic_name, photo, theme_song, power, weakness, element " +
                "FROM student WHERE real_name = ?";

        try (Connection connection = Database.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, realName);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return new Student(
                            resultSet.getInt("id"),
                            resultSet.getDate("date_of_birth").toLocalDate(),
                            resultSet.getString("real_name"),
                            resultSet.getString("fantastic_name"),
                            resultSet.getString("photo"),
                            resultSet.getString("theme_song"),
                            resultSet.getString("power"),
                            resultSet.getString("weakness"),
                            resultSet.getString("element")
                    );
                }
                return null; // aucune fiche trouvée avec ce nom
            }
        }
    }


}

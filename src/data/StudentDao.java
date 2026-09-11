package data;

import model.Student;

import java.sql.*;

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


}

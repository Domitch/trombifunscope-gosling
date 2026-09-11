import data.StudentDao;
import model.Student;

import java.sql.SQLException;
import java.time.LocalDate;

/**
 * Point d'entrée du Trombifunscope.
 *
 * Une règle : aucune requête SQL ici. Le sql est porté par StudentDao.
 * Le main appelle juste les méthode du DAO et affiche le résultat.
 */
public class Main {

    private static final StudentDao dao = new StudentDao();

    public static void main() {
        System.out.println("=== Trombifunscope ===");
        Student firstStudent = new Student(LocalDate.of(1990,4,12),"Andrea","girl","url","url","Vitesse","Feu","Air");
        try {
            System.out.println("Liaison établie. Test : " + dao.count()
                    + " ligne(s) dans la table student.");
            System.out.println("Nombres des lignes inseré: " + dao.addStudent(firstStudent));
        } catch (SQLException e) {
            System.out.println("La base n'a pas répondu : " + e.getMessage());
        }
    }

}

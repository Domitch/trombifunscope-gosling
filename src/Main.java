import data.StudentDao;
import model.Student;

import java.sql.SQLException;

/**
 * Point d'entrée du Trombifunscope.
 *
 * Une règle : aucune requête SQL ici. Le sql est porté par StudentDao.
 * Le main appelle juste les méthodes du DAO et affiche le résultat.
 */
public class Main {

    private static final StudentDao dao = new StudentDao();

    public static void main() {
        System.out.println("=== Trombifunscope ===");

        try {
            System.out.println("Liaison établie. Test : " + dao.count()
                    + " ligne(s) dans la table student.");
            Student student = dao.findByRealName("Dominga");

            if (student != null) {
                System.out.println(student);
            } else {
                System.out.println("Aucune fiche trouvée pour ce nom.");
            }
        } catch (SQLException e) {
            System.out.println("La base n'a pas répondu : " + e.getMessage());
        }
    }
}

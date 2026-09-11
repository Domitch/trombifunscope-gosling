package model;
import java.time.LocalDate;

/**
 * Une fiche du Trombifunscope : une personne de la promo.
 * Elle porte un prénom et un nom, et c'est tout : c'est à vous
 * d'y mettre les colonnes que votre groupe a décidées.
 */
public class Student {
    private int id;
    private LocalDate date_of_birth;
    private String real_name;
    private String fantastic_name;
    private String photo;
    private String theme_song;
    private String power;
    private String weakness;
    private String element;

    public Student(LocalDate date_of_birth, String real_name, String fantastic_name,
                   String photo, String theme_song, String power, String weakness,
                   String element) {
        this.id = 0;
        this.date_of_birth = date_of_birth;
        this.real_name = real_name;
        this.fantastic_name = fantastic_name;
        this.photo = photo;
        this.theme_song = theme_song;
        this.power = weakness;
        this.element = element;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDate_of_birth() {
        return date_of_birth;
    }

    public String getReal_name() {
        return real_name;
    }
    public String getFantastic_name() {
        return fantastic_name;
    }

    public String getPhoto() {
        return photo;
    }

    public String getTheme_song() {
        return theme_song;
    }

    public String getPower() {
        return power;
    }

    public String getWeakness() {
        return weakness;
    }

    public String getElement() {
        return element;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate_of_birth(LocalDate date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public void setReal_name(String real_name) {
        this.real_name = real_name;
    }

    public void setFantastic_name(String fantastic_name) {
        this.fantastic_name = fantastic_name;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setTheme_song(String theme_song) {
        this.theme_song = theme_song;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    public void setElement(String element) {
        this.element = element;
    }
}

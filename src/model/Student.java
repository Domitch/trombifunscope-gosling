package model;

<<<<<<< HEAD
import java.time.LocalDate;;
=======
import java.time.LocalDate;
>>>>>>> feat_us6

/**
 * Une fiche du Trombifunscope : une personne de la promo.
 */
public class Student {
    private int id;
<<<<<<< HEAD
    private LocalDate date_of_birth;
    private String real_name;
    private String fantastic_name;
    private String photo;
    private String theme_song;
=======
    private LocalDate dateOfBirth;
    private String realName;
    private String fantasticName;
    private String photo;
    private String themeSong;
>>>>>>> feat_us6
    private String power;
    private String weakness;
    private String element;

<<<<<<< HEAD
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
=======
    // Constructeur complet, avec id explicite (pour une fiche relue depuis la base)
    public Student(int id, LocalDate dateOfBirth, String realName, String fantasticName,
                   String photo, String themeSong, String power, String weakness, String element) {
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.realName = realName;
        this.fantasticName = fantasticName;
        this.photo = photo;
        this.themeSong = themeSong;
        this.power = power;
        this.weakness = weakness;
>>>>>>> feat_us6
        this.element = element;
    }

    // Constructeur pratique, sans id (pour une fiche pas encore en base) : délègue au premier avec id=0
    public Student(LocalDate dateOfBirth, String realName, String fantasticName,
                   String photo, String themeSong, String power, String weakness, String element) {
        this(0, dateOfBirth, realName, fantasticName, photo, themeSong, power, weakness, element);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getFantasticName() {
        return fantasticName;
    }

    public void setFantasticName(String fantasticName) {
        this.fantasticName = fantasticName;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getThemeSong() {
        return themeSong;
    }

    public void setThemeSong(String themeSong) {
        this.themeSong = themeSong;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getWeakness() {
        return weakness;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", realName='" + realName + '\'' +
                ", fantasticName='" + fantasticName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", power='" + power + '\'' +
                ", weakness='" + weakness + '\'' +
                ", element='" + element + '\'' +
                '}';
    }
}
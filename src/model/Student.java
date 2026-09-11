package model;

import java.time.LocalDate;

/**
 * Une fiche du Trombifunscope : une personne de la promo.
 */
public class Student {

    private int id;
    private LocalDate dateOfBirth;
    private String realName;
    private String fantasticName;
    private String photo;
    private String themeSong;
    private String power;
    private String weakness;
    private String element;

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
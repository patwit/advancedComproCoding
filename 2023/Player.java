import java.io.Serializable;

public class Player implements Serializable{
    private String name, nationality, sport, programming, gender, note;


    public Player() {
    }

    public Player(String name, String nationality, String sport, String programming, String gender, String note) {
        this.name = name;
        this.nationality = nationality;
        this.sport = sport;
        this.programming = programming;
        this.gender = gender;
        this.note = note;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return this.nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getSport() {
        return this.sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getProgramming() {
        return this.programming;
    }

    public void setProgramming(String programming) {
        this.programming = programming;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}

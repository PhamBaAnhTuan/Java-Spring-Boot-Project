package group2.baitap1;

public class Student {
    private String fullName;
    private String dateOfBirth;
    private String gender;
    private int number;
    private String placeOfOrigin;

    public Student() {}

    public Student(String fullName, String dateOfBirth, String gender, int number, String placeOfOrigin) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.number = number;
        this.placeOfOrigin = placeOfOrigin;
    }

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public String getPlaceOfOrigin() {
        return placeOfOrigin;
    }
    public void setPlaceOfOrigin(String placeOfOrigin) {
        this.placeOfOrigin = placeOfOrigin;
    }

}

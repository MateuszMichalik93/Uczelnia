package people;

public class Student extends Person{

    private String studyDirecton;
    private String specialty;
    private String yearOfStudy;
    private int group;
    private int indexNumber;

    public Student(String name, String lastName, String birthDate, String studyDirecton, String specialty,
                   String yearOfStudy, int group, int indexNumber) {
        super(name, lastName, birthDate);
        this.studyDirecton = studyDirecton;
        this.specialty = specialty;
        this.yearOfStudy = yearOfStudy;
        this.group = group;
        this.indexNumber = indexNumber;
    }

    public String getStudyDirecton() {
        return studyDirecton;
    }

    public void setStudyDirecton(String studyDirecton) {
        this.studyDirecton = studyDirecton;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(String yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studyDirecton='" + studyDirecton + '\'' +
                ", specialty='" + specialty + '\'' +
                ", yearOfStudy='" + yearOfStudy + '\'' +
                ", group=" + group +
                ", indexNumber=" + indexNumber +
                "} " + super.toString();
    }
}

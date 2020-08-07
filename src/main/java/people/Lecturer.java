package people;

public class Lecturer extends Person  {


    private String academicTittle;
    private String workPlace;


    public Lecturer(String name, String lastName, String birthDate, String academicTittle, String workPlace) {
        super(name, lastName, birthDate);
        this.academicTittle = academicTittle;
        this.workPlace = workPlace;

    }



    public String getAcademicTittle() {
        return academicTittle;
    }

    public void setAcademicTittle(String academicTittle) {
        this.academicTittle = academicTittle;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "academicTittle='" + academicTittle + '\'' +
                ", workPlace='" + workPlace + '\'' +
                "} " + super.toString();
    }


}

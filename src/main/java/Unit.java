import people.Lecturer;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Unit extends Lecturer{


    Set<Lecturer> lecturers = new HashSet<>();
    private Scanner sc = new Scanner(System.in);
    private String unitName;
    private String unitAddress;

    public Unit(String name, String lastName, String birthDate, String academicTittle, String workPlace) {
        super(name, lastName, birthDate, academicTittle, workPlace);
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getUnitAddress() {
        return unitAddress;
    }

    public void setUnitAddress(String unitAddress) {
        this.unitAddress = unitAddress;
    }

    public boolean addLecturer() {
        return lecturers.add(new Lecturer(sc.next(), sc.next(),sc.next(), sc.next(), sc.next()));
    }

    public void deleteLectuer(Lecturer lecturer) {

    }

    public static void main(String[] args) {
       
    }
}

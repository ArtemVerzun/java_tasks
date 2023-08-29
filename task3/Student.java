import java.util.Scanner;

public class Student {
    int id;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCurse() {
        return curse;
    }

    public void setCurse(int curse) {
        this.curse = curse;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    String surname;
    String name;
    String secondName;
    String dateBirth;
    String address;
    String phoneNumber;
    String faculty;
    int curse;
    int group;
    public Student(){ }

    //region  Constructor
    public Student(int id, String surname, String name, String secondName, String dateBirth, String address,
                   String phoneNumber, String faculty, int curse, int group){
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.dateBirth = dateBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.curse = curse;
        this.group = group;
    }


    public void show(){
        //System.out.println("_______________________________");
        System.out.println(getId() + " " + getSecondName() + " " + getName() + " " + getSurname() + " " + getDateBirth() + " " + getAddress() + " " + getPhoneNumber() + " " + getFaculty()
                + " " + getCurse() + " " + getGroup());
    }

    public void fakultet(String fakultet){
        if(this.getFaculty().equals(fakultet)){
            System.out.println(getId() + " " + getSecondName() + " " + getName() + " " + getSurname() + " " + getDateBirth() + " " + getAddress() + " " + getPhoneNumber() + " " + getFaculty()
                    + " " + getCurse() + " " + getGroup());
        }

    }
    public void listFakultet(String fakultet, int kurs){
        if(getFaculty().equals(fakultet) && getCurse() ==kurs){
            System.out.println(getId() + " " + getSecondName() + " " + getName() + " " + getSurname() + " " + getDateBirth() + " " + getAddress() + " " + getPhoneNumber() + " " + getFaculty()
                    + " " + getCurse() + " " + getGroup());
        }

    }

    public void listGroup(int group){
        if(getGroup() == group){
            System.out.println(getId() + " " + getSecondName() + " " + getName() + " " + getSurname() + " " + getDateBirth() + " " + getAddress() + " " + getPhoneNumber() + " " + getFaculty()
                    + " " + getCurse() + " " + getGroup());
        }
    }

    public void vozrast(int years){
        String[] strBirthday = getDateBirth().split(",");

        int year = (int)Integer.parseInt(strBirthday[2]);
        if(year >= years){
            System.out.print(strBirthday[0] + " " + strBirthday[1] + " " + strBirthday[2]);
            System.out.println(" | " +getId() + " " + getSecondName() + " " + getName() + " " + getSurname() + " " + getDateBirth() + " " + getAddress() + " " + getPhoneNumber() + " " + getFaculty()
                    + " " + getCurse() + " " + getGroup());
        }
    }
}

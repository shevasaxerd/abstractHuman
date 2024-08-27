package models;

import java.util.Objects;

public abstract class Human {
    private int age;
    private String name;
    private String surname;
    private String nation;

    public abstract void call();

    public int getAge(){return age;}
    public void setAge(int age){this.age = age;}
    public String getName(){return name;}
    public void setName(String name) {this.name = name;}
    public String getSurname() {return surname;}
    public void setSurname(String surname) {this.surname = surname;}
    public String getNation() {return nation;}
    public void setNation(String nation) {this.nation = nation;}
    public String toString(){
        return "Name: " + name + ", Surname: "+ surname + ", Age: " + age + ", Nation: " + nation + ";";
                    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(nation, human.nation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, surname, nation);
    }
}

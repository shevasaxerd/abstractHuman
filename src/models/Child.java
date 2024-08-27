package models;

import java.util.Objects;

public class Child extends Human{

    private String sex;

    @Override
    public void call() {
    System.out.println("AAAAAA");}
    public String getSex() {return sex;}
    public void setSex(String sex) {this.sex = sex;}
    @Override
    public String toString() {
        return "Child{" +
                "sex='" + sex + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Child child = (Child) o;
        return Objects.equals(sex, child.sex);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sex);
    }
}

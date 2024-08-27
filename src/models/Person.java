package models;

import java.util.Objects;

public class Person extends Child {

    private String job;
    private int money;

     public void call(){
         super.call();
         System.out.println("Oh my god");
     }

    public String getJob() {
        return job;
     }

    public void setJob(String job) {
        this.job = job;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Person{" +
                "job='" + job + '\'' +
                ", money=" + money +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Person person = (Person) o;
        return money == person.money && Objects.equals(job, person.job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), job, money);
    }
}

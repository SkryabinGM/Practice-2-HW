package org.example.HW1;

public class WorkerProfile {
    protected String name;
    protected int age;
    protected int salary;

    public WorkerProfile(String name, Integer age, Integer salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String profileInfo(){
        return "Имя: " + name + ", возраст:" + age + ", зарплата: " + salary;
    }
}

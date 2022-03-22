package student;

import java.util.ArrayList;

public class Student {
    private long id;
    private String name;
    private ArrayList<Integer> grades;


    public Student(long id, String name, ArrayList<Integer> grades) {
        this.id = id;
        this.name = name;
        this.grades = grades;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public static double getGradeAverage(ArrayList<Integer> grades) {
        int sum = 0;
        double avr = 0.0;
        for (Integer grade : grades) sum += grade;
        avr = (double)sum / grades.size();
        return avr;
        }

    public static int updateGrade(ArrayList<Integer> grades, int newGrade, int index) {
        try {
            grades.set(index, newGrade);
        } catch (Exception e) {
            System.out.println(e);
        }
        return grades.get(index);
    }
    public static int deleteGrade(ArrayList<Integer> grades, int index) {
        try {
            grades.remove(index);
        } catch (Exception e) {
            System.out.println(e);
        }
        return grades.get(index);
    }




}

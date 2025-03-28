/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.pagos.tallerpatronesdiseno;

/**
 *
 * @author Lenovo pc
 */
import java.util.List;

public class Project {
    private String name;
    private String company;
    private List<String> requirements;
    private List<String> technologies;
    private int numStudents;
    private String difficulty;

    public Project(String name, String company, List<String> requirements, List<String> technologies, int numStudents, String difficulty) {
        this.name = name;
        this.company = company;
        this.requirements = requirements;
        this.technologies = technologies;
        this.numStudents = numStudents;
        this.difficulty = difficulty;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", requirements=" + requirements +
                ", technologies=" + technologies +
                ", numStudents=" + numStudents +
                ", difficulty='" + difficulty + '\'' +
                '}';
    }
}
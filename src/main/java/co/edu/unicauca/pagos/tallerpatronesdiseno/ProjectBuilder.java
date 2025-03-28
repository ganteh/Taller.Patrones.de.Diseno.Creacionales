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

abstract class ProjectBuilder {
    protected String name;
    protected String company;
    protected List<String> requirements;
    protected List<String> technologies;
    protected int numStudents;
    protected String difficulty;

    public abstract void buildName(String name);
    public abstract void buildCompany(String company);
    public abstract void buildRequirements(List<String> requirements);
    public abstract void buildTechnologies(List<String> technologies);
    public abstract void buildNumStudents(int numStudents);
    public abstract void buildDifficulty(String difficulty);

    public Project getProject() {
        return new Project(name, company, requirements, technologies, numStudents, difficulty);
    }
}

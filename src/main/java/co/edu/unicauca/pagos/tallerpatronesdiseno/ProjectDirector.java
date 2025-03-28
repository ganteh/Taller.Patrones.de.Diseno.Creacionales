/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.pagos.tallerpatronesdiseno;

import java.util.List;

/**
 *
 * @author Lenovo pc
 */
class ProjectDirector {
    private ProjectBuilder builder;

    public void setBuilder(ProjectBuilder builder) {
        this.builder = builder;
    }

    public Project buildProject(String name, String company, List<String> requirements, List<String> technologies, int numStudents, String difficulty) {
        builder.buildName(name);
        builder.buildCompany(company);
        builder.buildRequirements(requirements);
        builder.buildTechnologies(technologies);
        builder.buildNumStudents(numStudents);
        builder.buildDifficulty(difficulty);
        return builder.getProject();
    }
}

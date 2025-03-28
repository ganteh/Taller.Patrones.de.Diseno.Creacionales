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

class EmbeddedSystemsProjectBuilder extends ProjectBuilder {
    @Override
    public void buildName(String name) { this.name = name; }
    @Override
    public void buildCompany(String company) { this.company = company; }
    @Override
    public void buildRequirements(List<String> requirements) { this.requirements = requirements; }
    @Override
    public void buildTechnologies(List<String> technologies) { this.technologies = technologies; }
    @Override
    public void buildNumStudents(int numStudents) { this.numStudents = numStudents; }
    @Override
    public void buildDifficulty(String difficulty) { this.difficulty = difficulty; }
}

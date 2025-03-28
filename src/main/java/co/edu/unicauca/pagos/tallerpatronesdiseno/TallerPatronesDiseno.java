/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package co.edu.unicauca.pagos.tallerpatronesdiseno;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Lenovo pc
 */
public class TallerPatronesDiseno {

    public static void main(String[] args) {
   ProjectDirector director = new ProjectDirector();

        // Crear un proyecto de Software
        SoftwareProjectBuilder softwareBuilder = new SoftwareProjectBuilder();
        director.setBuilder(softwareBuilder);
        Project softwareProject = director.buildProject(
                "Software Management System",
                "SoftwareCorp",
                Arrays.asList("User Authentication", "Database Management"),
                Arrays.asList("Java", "Spring Boot", "MySQL"),
                4,
                "High"
        );
        System.out.println(softwareProject);

        // Crear un proyecto de Ciencia de Datos
        DataScienceProjectBuilder dataScienceBuilder = new DataScienceProjectBuilder();
        director.setBuilder(dataScienceBuilder);
        Project dataScienceProject = director.buildProject(
                "AI Data Analysis",
                "DataCorp",
                Arrays.asList("Machine Learning", "Big Data Processing"),
                Arrays.asList("Python", "TensorFlow", "Spark"),
                3,
                "Medium"
        );
        System.out.println(dataScienceProject);

        // Crear un proyecto de Sistemas Embebidos
        EmbeddedSystemsProjectBuilder embeddedBuilder = new EmbeddedSystemsProjectBuilder();
        director.setBuilder(embeddedBuilder);
        Project embeddedProject = director.buildProject(
                "IoT Smart Home",
                "IoTCorp",
                Arrays.asList("Microcontrollers", "Wireless Communication"),
                Arrays.asList("C", "Arduino", "ESP32"),
                2,
                "Low"
        );
        System.out.println(embeddedProject);
    }
}

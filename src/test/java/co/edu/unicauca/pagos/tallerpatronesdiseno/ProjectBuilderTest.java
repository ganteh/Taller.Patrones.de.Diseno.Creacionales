package co.edu.unicauca.pagos.tallerpatronesdiseno;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

/**
 * @author Jhonatan
 */
public class ProjectBuilderTest {
    private ProjectDirector director;
    
    @BeforeEach
    public void setUp() {
        director = new ProjectDirector();
    }
    
    @Test
    public void testSoftwareProjectBuilder() {
        ProjectBuilder softwareBuilder = new SoftwareProjectBuilder();
        director.setBuilder(softwareBuilder);
        
        Project softwareProject = director.buildProject(
            "Software Management System", 
            "SoftwareCorp", 
            Arrays.asList("User Authentication", "Database Management"),
            Arrays.asList("Java", "Spring Boot", "MySQL"), 
            4,
            "High"
        );
        
        // Assert
        assertNotNull(softwareProject);
        assertTrue(softwareProject.toString().contains("Software Management System"));
        assertTrue(softwareProject.toString().contains("SoftwareCorp"));
        assertTrue(softwareProject.toString().contains("Java"));
        assertTrue(softwareProject.toString().contains("Spring Boot"));
        assertTrue(softwareProject.toString().contains("MySQL"));
    }
    
    @Test
    public void testDataScienceProjectBuilder() {
        ProjectBuilder dataScienceBuilder = new DataScienceProjectBuilder();
        director.setBuilder(dataScienceBuilder);
        
        Project dataScienceProject = director.buildProject(
            "AI Data Analysis", 
            "DataCorp", 
            Arrays.asList("Machine Learning", "Big Data Processing"),
            Arrays.asList("Python", "TensorFlow", "Spark"), 
            3,
            "Medium"
        );
        
        // Assert
        assertNotNull(dataScienceProject);
        assertTrue(dataScienceProject.toString().contains("AI Data Analysis"));
        assertTrue(dataScienceProject.toString().contains("DataCorp"));
        assertTrue(dataScienceProject.toString().contains("Python"));
        assertTrue(dataScienceProject.toString().contains("TensorFlow"));
        assertTrue(dataScienceProject.toString().contains("Spark"));
    }
    
    @Test
    public void testEmbeddedSystemsProjectBuilder() {
        ProjectBuilder embeddedBuilder = new EmbeddedSystemsProjectBuilder();
        director.setBuilder(embeddedBuilder);
        
        Project embeddedProject = director.buildProject(
            "IoT Smart Home", 
            "IoTCorp", 
            Arrays.asList("Microcontrollers", "Wireless Communication"),
            Arrays.asList("C", "Arduino", "ESP32"), 
            2,
            "Low"
        );
        
        // Assert
        assertNotNull(embeddedProject);
        assertTrue(embeddedProject.toString().contains("IoT Smart Home"));
        assertTrue(embeddedProject.toString().contains("IoTCorp"));
        assertTrue(embeddedProject.toString().contains("C"));
        assertTrue(embeddedProject.toString().contains("Arduino"));
        assertTrue(embeddedProject.toString().contains("ESP32"));
    }
    
    @Test
    public void testProjectDirectorWithNullBuilder() {
        ProjectDirector directorWithNullBuilder = new ProjectDirector();
        
        assertThrows(NullPointerException.class, () -> {
            directorWithNullBuilder.buildProject(
                "Test Project", 
                "Test Company", 
                Arrays.asList("Test Requirement"), 
                Arrays.asList("Test Technology"), 
                1,
                "Test Difficulty"
            );
        });
    }
    
    @Test
    public void testProjectBuilderWithEmptyLists() {
        ProjectBuilder softwareBuilder = new SoftwareProjectBuilder();
        director.setBuilder(softwareBuilder);
        
        Project emptyProject = director.buildProject(
            "Empty Project", 
            "Empty Company", 
            Arrays.asList(), 
            Arrays.asList(), 
            0,
            "N/A"
        );
        
        // Assert
        assertNotNull(emptyProject);
        assertTrue(emptyProject.toString().contains("Empty Project"));
        assertTrue(emptyProject.toString().contains("Empty Company"));
        assertTrue(emptyProject.toString().contains("numStudents=0"));
    }
    
    @Test
    public void testProjectBuilderWithMaximumValues() {
        ProjectBuilder embeddedBuilder = new EmbeddedSystemsProjectBuilder();
        director.setBuilder(embeddedBuilder);

        Project maxProject = director.buildProject(
            "Maximum Complexity Project", 
            "MaxCorp", 
            Arrays.asList("Complex Requirement 1", "Complex Requirement 2", "Complex Requirement 3"),
            Arrays.asList("Advanced Tech 1", "Advanced Tech 2", "Advanced Tech 3"), 
            10,
            "Extreme"
        );
        
        // Assert
        assertNotNull(maxProject);
        assertTrue(maxProject.toString().contains("Maximum Complexity Project"));
        assertTrue(maxProject.toString().contains("3 requirements"));
        assertTrue(maxProject.toString().contains("3 technologies"));
        assertTrue(maxProject.toString().contains("numStudents=10"));
    }
}
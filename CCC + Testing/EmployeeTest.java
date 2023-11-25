package CCC2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class EmployeeTest {

    Employee emp, steve;

    @BeforeEach
    void setUp() {
        emp = new Employee("Bob",20,0.10);
        steve = new Employee("Steve", 70, 0.10);

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getCakesCovered() {
        int result = emp.getCakesCovered();
        assertEquals(20, result);
        assertNotEquals(40, result);

        result = steve.getCakesCovered();
        assertEquals(70, result);
        assertNotEquals(40, result);
    }

    @Test
    void getAmount() {
        double result = emp.getAmount();
        assertEquals(2.0, result);
        assertNotEquals(3.0, result);

        result = steve.getAmount();
        assertEquals(8.0, result);
        assertNotEquals(2.0, result);

    }

    @Test
    void getName() {
        String result = emp.getName();
        assertEquals("Bob", result);
        assertNotEquals("Bobby", result);

        result = steve.getName();
        assertEquals("Steve", result);
        assertNotEquals("Rabia", result);
    }

    @Test
    void compareTo() {
        int result = emp.compareTo(emp);
        assertEquals(1,1);
        assertNotEquals(3, result);
    }

    @Test
    void addCakes() {
        int result = emp.addCakes(emp.addCakes(1));
        assertEquals(1, result);
        assertNotEquals(4, result);

    }

    @Test
    void removeCakes() {
        int result = emp.removeCakes();
        assertEquals(0, result);
        assertNotEquals(1, result);
    }
}
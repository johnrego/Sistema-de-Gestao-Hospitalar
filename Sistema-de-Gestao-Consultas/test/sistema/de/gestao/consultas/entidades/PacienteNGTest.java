/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.gestao.consultas.entidades;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author juan
 */
public class PacienteNGTest {
    
    public PacienteNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of create method, of class Paciente.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Paciente instance = null;
        instance.create();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class Paciente.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        Paciente instance = null;
        instance.read();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class Paciente.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Paciente instance = null;
        instance.update();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class Paciente.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Paciente instance = null;
        instance.delete();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNum_sus method, of class Paciente.
     */
    @Test
    public void testGetNum_sus() {
        System.out.println("getNum_sus");
        Paciente instance = null;
        String expResult = "";
        String result = instance.getNum_sus();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNum_sus method, of class Paciente.
     */
    @Test
    public void testSetNum_sus() {
        System.out.println("setNum_sus");
        String num_sus = "";
        Paciente instance = null;
        instance.setNum_sus(num_sus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

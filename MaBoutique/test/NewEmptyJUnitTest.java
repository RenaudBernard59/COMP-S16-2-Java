/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.Test;

/**
 *
 * @author renob
 */
public class NewEmptyJUnitTest {
    @Test
    public void demarrerTest() {
        
        EntityManagerFactory f = Persistence.createEntityManagerFactory("MaBoutiquePU");
    
    }
}

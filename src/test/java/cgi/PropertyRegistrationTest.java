/**
 * 
 */
package cgi;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author IMSKS
 *
 */
public class PropertyRegistrationTest {

	@Test
    public void testValidData() {
        PropertyRegistration property1 = new PropertyRegistration("house", 1500, "Varanasi", 200000, "Satyam");
        assertTrue(property1.validateData());
    }

    @Test
    public void testInvalidTypeOfProperty() {
        PropertyRegistration property2 = new PropertyRegistration("shop", 800, "Noida", 50000, "Shivam");
        assertFalse(property2.validateData());
    }

    @Test
    public void testInvalidAreaNegative() {
        PropertyRegistration property3 = new PropertyRegistration("flatroom", -150, "Ajamgarh", 1000000, "Shyam");
        assertFalse(property3.validateData());
    }

    @Test
    public void testInvalidAreaTooLarge() {
        PropertyRegistration property4 = new PropertyRegistration("estate", 4999999, "Agra", 500000, "Suresh");
        assertFalse(property4.validateData());
    }

    @Test
    public void testInvalidExpectedPrice() {
        PropertyRegistration property5 = new PropertyRegistration("workoffice", 1000, "Prayagraj", -500000, "Ramesh");
        assertFalse(property5.validateData());
    }

    @Test
    public void testInvalidSellerName() {
        PropertyRegistration property6 = new PropertyRegistration("flat", 1200, "Sample Area", 300000, "");
        assertFalse(property6.validateData());
    }

}

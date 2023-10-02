/**
 * 
 */
package cgi;

/**
 * @author IMSKS
 *
 */
public class PropertyRegistration {
	
	private String typeOfProperty;
    private double area;
    private String location;
    private double expectedPrice;
    private String sellerName;

    public PropertyRegistration(String typeOfProperty, double area, String location, double expectedPrice, String sellerName) {
        this.typeOfProperty = typeOfProperty;
        this.area = area;
        this.location = location;
        this.expectedPrice = expectedPrice;
        this.sellerName = sellerName;
    }

    public boolean validateData() {
    	 if (typeOfProperty == null || !typeOfProperty.matches("estate|house|flat|office")) {
             System.out.println("Error: Invalid TypeOfProperty. Allowed values are 'estate', 'house', 'flat', 'office'.");
             return false;
         }
         if (area <= 0 || area >= 1000000) {
             System.out.println("Error: Invalid Area. Please provide a non-negative value up to 6 digits.");
             return false;
         }
         if (location == null || location.isEmpty()) {
             System.out.println("Error: Location cannot be empty and must be a string value.");
             return false;
         }
         if (expectedPrice < 0) {
             System.out.println("Error: Invalid ExpectedPrice. Please provide a non-negative double value.");
             return false;
         }
         if (sellerName == null || sellerName.isEmpty()) {
             System.out.println("Error: SellerName cannot be empty and must be a string value.");
             return false;
         }

         return true;
    }
}


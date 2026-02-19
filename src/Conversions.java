// Saul Agustin Güemes Enriquez - 3175794
public class Conversions {

    public double euroToDollar(double euro) {
        // random conversion rate
        return euro * 1.1;
    }

    public double dollarToEuro(double dollar) {
        // divide euro conversion date
        return dollar / 1.1;
    }

    public int stringToInteger(String val) {
        // check for null or empty string
        if (val == null || val.isEmpty()) {
            throw new NumberFormatException();
        } else {
            // convert string to integer
            return Integer.parseInt(val);
        }
    }

    public String integerToString(int val) {
        // convert integer to string
        return String.valueOf(val);
    }

    public String switchCase(String val) {
        return "";
    }
}

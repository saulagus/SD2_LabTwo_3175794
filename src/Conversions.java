import java.util.Arrays;

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
        // check for null
        if (val == null ) return null;
        // check for empty string
        if (val.isEmpty()) return "";
        // convert string to char array
        char[] valArr = val.toCharArray();
        // loop through char array
        for (int i = 0; i < valArr.length; i++) {
            // check if char is uppercase
            if (Character.isUpperCase(valArr[i]))
                valArr[i] = Character.toLowerCase(valArr[i]);
            else
                valArr[i] = Character.toUpperCase(valArr[i]);
        }
        // convert char array to string
        return new String(valArr);
    }
}

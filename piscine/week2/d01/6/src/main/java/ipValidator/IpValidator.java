package ipValidator;

import java.util.StringTokenizer;

public class IpValidator {
    public static boolean ValidateIpv4Address(String ip) {
        try {
            StringTokenizer bytes = new StringTokenizer(ip, ".");
            if (bytes.countTokens() != 4) {
                throw (new Exception());
            }
            int tokens = 0;
            while (bytes.hasMoreTokens()) {
                int value = Integer.parseInt(bytes.nextToken());
                if ((tokens == 3 && value == 0) ||
                        (tokens == 3 && value == 255) ||
                        value < 0 ||
                        value > 255) {
                    throw (new Exception());
                }
                tokens++;
            }
        } catch (Exception exception) {
            return false;
        }
        return true;
    }
}
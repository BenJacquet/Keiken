package ipValidator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;

class IpValidatorTest {
    private IpValidator validator = new IpValidator();

//    CORRECT VALUE TESTS - THEY SHOULD PASS
    @Test
    void CorrectAddressOne(){
        Assertions.assertTrue(validator.ValidateIpv4Address("0.0.0.1"));
    }

    @Test
    void CorrectAddressTwo(){
        Assertions.assertTrue(validator.ValidateIpv4Address("192.168.1.1"));
    }

    @Test
    void CorrectAddressThree(){
        Assertions.assertTrue(validator.ValidateIpv4Address("255.255.255.254"));
    }

    @Test
    void CorrectAddressFour(){
        Assertions.assertTrue(validator.ValidateIpv4Address("10.0.0.1"));
    }

    @Test
    void CorrectAddressFive(){
        Assertions.assertTrue(validator.ValidateIpv4Address("127.0.0.1"));
    }

//    INCORRECT VALUE TESTS - THEY SHOULD FAIL
    @Test
    void IncorrectAddressEndsWithZero(){
        Assertions.assertFalse(validator.ValidateIpv4Address("0.0.0.0"));
    }

    @Test
    void IncorrectAddressEndsWithTwoFiftyFive(){
        Assertions.assertFalse(validator.ValidateIpv4Address("255.255.255.255"));
    }

    @Test
    void IncorrectAddressLessThanFourBytes(){
        Assertions.assertFalse(validator.ValidateIpv4Address("255.255.255"));
    }

    @Test
    void IncorrectAddressMoreThanFourBytes(){
        Assertions.assertFalse(validator.ValidateIpv4Address("255.255.255.255.255"));
    }

    @Test
    void IncorrectAddressTooHigh(){
        Assertions.assertFalse(validator.ValidateIpv4Address("255.255.255.256"));
    }

    @Test
    void IncorrectAddressTooLow(){
        Assertions.assertFalse(validator.ValidateIpv4Address("255.255.255.-1"));
    }
}

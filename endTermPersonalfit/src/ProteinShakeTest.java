import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class ProteinShakeTest {
    @org.junit.jupiter.api.Test
    void testconstructer(){
        ProteinShake p=new ProteinShake("cos","20 euro","milk","200 grams");
        Assertions.assertNotNull(p);
    }

    @org.junit.jupiter.api.Test
    void testEquals() {
       ProteinShake p=new ProteinShake("cos","20 euro","milk","200 grams");
        ProteinShake d=new ProteinShake("cos","20 euro","milk","200 grams");
        Assertions.assertTrue(p.equals(d));
        Assertions.assertTrue(p.equals(p));
    }


    @org.junit.jupiter.api.Test
    void testToString() {
        ProteinShake p=new ProteinShake("cos","20 euro","milk","200 grams");
        Assertions.assertEquals("ProteinShake{" +
                "brand='" + "cos" + '\'' +
                ", price='" + "20 euro" + '\'' +
                ", flavor='" + "milk" + '\'' +
                ", size='" + "200 grams" + '\''+"}",p.toString());
    }
}
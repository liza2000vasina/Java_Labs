import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

class RationalStatementTest {

    @org.junit.jupiter.api.Test
    void testForGetName() {

        RationalStatement obj = new RationalStatement();
        Class clazz = obj.getClass();

        assertEquals("com.company.RationalStatement", clazz.getCanonicalName());
    }

    @org.junit.jupiter.api.Test
    void testForGetFieldType() {

        RationalStatement obj = new RationalStatement();
        Class clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            Class fieldType = field.getType();
            assertEquals("[I", fieldType.getName());
        }

    }

}
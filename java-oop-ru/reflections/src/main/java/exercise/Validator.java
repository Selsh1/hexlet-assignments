package exercise;

import java.lang.reflect.Field;
import java.util.*;

// BEGIN
class Validator {
    public static List<String> validate(Object obj) {
        Field[] fields = obj.getClass().getDeclaredFields();
        List<String> notNullFields = new ArrayList<String>();

        for (Field field : fields) {
            if (field.getAnnotation(NotNull.class) == null) {
                continue;
            }

            Object value;

            try {
                field.setAccessible(true);
                value = field.get(obj);
            } catch (IllegalAccessException e) {
                continue;
            }

            if (value != null) {
                continue;
            }

            notNullFields.add(field.getName());
        }

        return notNullFields;
    }

    public static Map<String, List<String>> advancedValidate(Object obj) {
        Field[] fields = obj.getClass().getDeclaredFields();
        HashMap<String, List<String>> validated = new HashMap<String, List<String>>();

        for (Field field : fields) {
            Object value;

            try {
                field.setAccessible(true);
                value = field.get(obj);
            } catch (IllegalAccessException e) {
                continue;
            }

            if (value == null) {
                validated.put(field.getName(), List.of("can not be null"));
            }

            var min = field.getAnnotation(MinLength.class);

            if (min == null) {
                continue;
            }

            System.out.println(min.minLength());
            System.out.println(Objects.requireNonNull(value).toString().length());

            if (min.minLength() > Objects.requireNonNull(value).toString().length()) {
                validated.put(field.getName(), List.of("length less than " + min.minLength()));
            }
        }

        return validated;
    }
}
// END

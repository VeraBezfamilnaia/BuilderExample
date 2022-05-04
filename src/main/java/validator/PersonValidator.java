package validator;

public class PersonValidator {
    public static void validate(String name, String surname) {
        if (name == null && surname == null) {
            throw new IllegalArgumentException("Указаны не все обязательные данные для человека");
        }
    }

    public static void validate(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст человека указан не корректно");
        }
    }
}

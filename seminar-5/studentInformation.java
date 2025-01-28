import java.lang.reflect.Field;
/**
 * @author Skrynnik Valeria
 * created: 2023-11-23 23:02
 */

public class StudentInformation {
    private String name;
    private int age;
    private String major;
    public StudentInformation(String name, int age, String major) {

        this.name = name;
        this.age = age;
        this.major = major;
    }
    public void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age + " лет");
        System.out.println("Специальность: " + major);
    }

    public void displayInfoWithReflection() {

        Class<?> clazz = this.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            try {
                field.setAccessible(true);
                System.out.println(field.getName() + ": " + field.get(this));            
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        StudentInformation myStudent = new StudentInformation("Нина", 22, "Филолог");
        myStudent.displayInfo();
        System.out.println("\nИнформация о  студенте:");
        myStudent.displayInfoWithReflection();
    }
}
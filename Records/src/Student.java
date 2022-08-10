public record Student(int id, String name, int age, String address) implements Runnable{

    public static final String DEFAULT_NAME = "Tutu";

//    public Student(int id, String name, int age, String address) {
//        if(id <= 0) throw new IllegalAccessException("id can not be negative or zero value");
//        if(age <= 12) throw new IllegalAccessException("age should be greater than 12");
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.address = address;
//    }

    public Student {
        if(id <= 0) try {
            throw new IllegalAccessException("id can not be negative or zero value");
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        if(age <= 12) try {
            throw new IllegalAccessException("age should be greater than 12");
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
    public String nameToUppercase() {
        return name.toUpperCase();
    }
    public static void printWhatever() {
        System.out.println("Whatever!");
    }
    @Override
    public void run() {
        System.out.println("Run!");
    }
}

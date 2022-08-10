import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<Cat> tutu = findCatByName("Tutu");

        Integer age = tutu.map(Cat::getAge).orElse(0);
        System.out.println(age);

//        Cat defCat = tutu.orElse(new Cat("UNKNOWN", 0));
//        System.out.println(defCat.getAge());

//        if(tutu.isPresent()) {
//            System.out.println(tutu.get().getAge());
//        } else {
//            System.out.println(0);
//        }

//        if(tutu != null) {
//            System.out.println(tutu.getAge());
//        }else {
//            System.out.println(0);
//        }
    }

    public static Optional<Cat> findCatByName(String name) {
        //var cat = new Cat(name, 3);
        Cat cat = null;
        return Optional.ofNullable(cat);
    }
}


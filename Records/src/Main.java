public class Main {
    public static void main(String[] args) {

        var stud1 = new Student(1, "Cisco", 30, "Colombo");
        System.out.println(stud1.name());
        var stud2 = new Student(2, stud1.name(), 31, stud1.address());
        System.out.println(stud2);
        System.out.println(stud2.nameToUppercase());
        Student.printWhatever();
        var stud3 = new Student(1, "Tutu", 10, "Colombo");
        System.out.println(stud3.name());

        var dum1 = new Dummy(2,3);
        System.out.println(dum1.x());
        System.out.println(dum1.y());

        var dum2 = new Dummy(6,5);
        System.out.println(dum2.x());
        System.out.println(dum2.y());
    }
}

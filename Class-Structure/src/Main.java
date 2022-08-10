public class Main {
    public static void main(String[] args) {
        var subOb = new Sub();
        System.out.println(subOb.getSubName());
    }
}

/** If class Sub is public, it should be declared in a file named Sub.java */
//public class Sub {
//}

class Sub {
    private String subName = "Sub class";
    public String getSubName() {
        return subName;
    }
}

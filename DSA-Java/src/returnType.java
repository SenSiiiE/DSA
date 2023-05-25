public class returnType {

    public static void main(String[] args) {
        String name="Vikash";
        System.out.println(name);
        System.out.println(changeName(name));

        changeName(name);
        System.out.println(changeName(name));

    }

    static String changeName(String naam) {
        naam="vicks";
        return naam;
//        System.out.println(name);

    }
}

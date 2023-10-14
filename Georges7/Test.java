public class Test {
    public static void main(String[] args) {
//        Human h = new Human();
//        Human h2 = new Human();
        new Human();
        System.out.println(Human.count);
        System.out.println(Human.a);
        Student s1 = new Student( "Hayk");
        s1.sum(4, 5);
        Student s2 = new Student( "Anna");
        s2.sum(4, 5);

        String s = "7";
        int a = Integer.parseInt(s);
        System.out.println(a + 1);
        char c = '2';
        System.out.println(Character.isLetter(c));
        String pass = "asd FG456jh";
        int count = 0;
        for (int i = 0; i < pass.length(); i++){
            if (Character.isUpperCase(pass.charAt(i))){
                count++;
            }
        }
        System.out.println(count);
    }
}
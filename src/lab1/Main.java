package lab1;

public class Main {

    public static void main(String[] args) {
        Course introJ = new IntroJavaCourse("Intro to Java", "J100");
        Course intoToPro = new IntroToProgrammingCourse("Intro to Programming", "P101");
        Course advJava = new AdvancedJavaCourse("Advanced Java", "J103");
        System.out.println(introJ.getCourseNumber());
        System.out.println(intoToPro.getCourseNumber());
        System.out.println(advJava.getCourseNumber());
    }

}

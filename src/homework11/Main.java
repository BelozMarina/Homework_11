package homework11;

public class Main {
    public static void main(String[] args) {
        Human students = new Students("Manya", "Odona", 18, 45, 175, "male", "Programming");
        System.out.println("The University " + students.UNIVERSITY);
        students.whoAmI();
        System.out.println(students.toString());
        students.study();
        students.toDo();
        students.move();
        students.eat();
        System.out.println("------------------ \n");

        Human teachers = new Teachers("Anna", "Ivanivna", 26, 60, 168, "female", "Programming");

        teachers.whoAmI();
        System.out.println(teachers.toString());
        teachers.toDo();
        teachers.study();
        teachers.move();
        teachers.eat();

    }
}

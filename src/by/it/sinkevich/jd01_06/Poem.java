package by.it.sinkevich.jd01_06;

/**
 * Runner для задания jd01_06
 *
 * @author Sinkevich Denis
 */
public class Poem {

    public static void main(String[] args) {
        TaskA taskA = new TaskA();

        System.out.println("Задание №1: ");
        System.out.println(taskA.task1());
        System.out.println();

        System.out.println("Задание №2: ");
        taskA.task2();
        System.out.println();

        System.out.println("Задание №3: ");
        System.out.println(taskA.task3());
        System.out.println();

        TaskB taskB = new TaskB();
        System.out.println("Задание №4: ");
        System.out.println(taskB.task1());
        System.out.println();

        System.out.println("Задание №5: ");
        taskB.task2();
        System.out.println();
    }
}

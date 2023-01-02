/*
Создать информационную систему позволяющую работать с
сотрудниками некой компании \ студентами вуза \ учениками школы
(прямая отсылка к первому семинару “введение в базы данных”)
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Task000 {

    public static void main(String[] args) {
        WorkerDB workerDB = new WorkerDB();
//        Worker w1 = new Worker("Dima", "IT", "321321321");
//        Worker w2 = new Worker("Sanya", "IT", "321");
//        workerDB.addWorker(w1);
//        workerDB.addWorker(w2);
        Manager m1 = new Manager("Maks", "manager", "4531321");
        System.out.println(m1);

        m1.addSalary(50000);
        System.out.println(m1);

        String str = extracted();
        switch (str) {
            case "1":
                System.out.println("odin");
                break;
            case "2":
                System.out.println("dva");
                break;
        }
    }

    private static String extracted() {
        Map<Integer, String> map = new TreeMap<>(Map.of(1,"1234",2, "sdfasdf"));
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите пункт: \n");
        for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {
            System.out.printf("%d: %s%n", integerStringEntry.getKey(), integerStringEntry.getValue());
        }
        return scn.nextLine();
    }
}
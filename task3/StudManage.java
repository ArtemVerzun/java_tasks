import java.util.Scanner;

public class StudManage {
    public static void main(String[] args) {
        int choose = 0;
        Scanner in = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        Student st = new Student();
        Student[] stud = new Student[8];
        Student stud1 = new Student(1, "Верзун", "Артем", "Сергеевич", "22,10,2002", "Спб", "8(966)245-51-00", "Информатика", 3, 3133);
        Student stud2 = new Student(2, "Верзун2", "Евгений", "Алексеевич", "2,12,2002", "Спб", "14(312)982-65-70", "Информатика", 3, 3133);
        Student stud3 = new Student(3, "Берзун", "Даниил", "Олегович", "30,02,2000", "Спб", "09(604)260-00-76", "Психология", 5, 5322);
        Student stud4 = new Student(4, "Берзун2", "Сергей", "Дмитриевич", "29,04,2000", "Спб", "03(54)920-43-60", "Психология", 5, 5322);
        Student stud5 = new Student(5, "Арзун", "Артем", "Артемович", "21,08,2001", "Спб", "555(999)111-77-88", "Психология", 4, 1100);
        Student stud6 = new Student(6, "Арзун2", "Роман", "Григорьевич", "7,02,2001", "Спб", "65(099)191-01-86", "Психология", 4, 1100);
        Student stud7 = new Student(7, "Ерзун", "Андрей", "Васильевич", "21,06,2002", "Спб", "809(15)748-79-24", "Программирование", 3, 3144);
        Student stud8 = new Student(8, "Ерзун2", "Кирилл", "Сергеевич", "16,10,2003", "Спб", "605(14)360-46-23", "Юриспруденция", 1, 1909);

        stud[0] = stud1;
        stud[1] = stud2;
        stud[2] = stud3;
        stud[3] = stud4;
        stud[4] = stud5;
        stud[5] = stud6;
        stud[6] = stud7;
        stud[7] = stud8;

        do {
            showMenu();
            System.out.print("Ввод: ");
            choose = in.nextInt();

            switch (choose) {
                case 1:
                    for (Student s : stud) {
                        s.show();
                    }
                    break;
                case 2:
                    System.out.print("Введите факультет: ");
                    String fac1 = sc.nextLine();
                    for (Student s : stud) {
                        s.fakultet(fac1);
                    }
                    break;
                case 3:
                    System.out.println("Введите факультет: ");
                    String fac = sc.nextLine();
                    System.out.println("Введите курс: ");
                    int ku = in.nextInt();
                    System.out.println("Список факультетов и курсов: ");
                    for (Student s : stud) {
                        s.listFakultet(fac, ku);
                    }
                    break;
                case 4: // Список студентов, родившихся после заданного года
                    System.out.print("Введите год рождения:  ");
                    int god = in.nextInt();
                    for (Student s : stud) {
                        s.vozrast(god);
                    }
                    break;
                case 5: // Список учебной группы
                    System.out.print("Введите номер группы: ");
                    int gr = in.nextInt();
                    System.out.println("Список группы: ");
                    for (Student s : stud) {
                        s.listGroup(gr);
                    }
                    break;
            }
        } while (choose != 6);
    }
    private static void showMenu() {
        System.out.printf("%10s \n", "----------Меню----------");
        System.out.println("1. Список студентов");
        System.out.println("2. Список студентов заданного факультета");
        System.out.println("3. Списки студентов для каждого факультета и курса");
        System.out.println("4. Список студентов, родившихся после заданного года ");
        System.out.println("5. Список учебной группы");
        System.out.println("6. Exit");
        System.out.println("------------------------");
    }
}

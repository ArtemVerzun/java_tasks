import java.util.*;

public class MobileCompany {
    public static void main(String[] args) {

        MobileCompany tariff = new MobileCompany("Verzun");
        MobileCompany clients = new MobileCompany("Verzun");

        tariff.addTariffsToTariffList(new MobileTariffs("Standart",1500,500,1000,1500,15));
        tariff.addTariffsToTariffList(new MobileTariffs("ALL-IN-L",5900,120,2500,5000,59));
        tariff.addTariffsToTariffList(new MobileTariffs("Economia",2000,750,1500,2500,20));
        tariff.addTariffsToTariffList(new MobileTariffs("ALL-IN-S",4000,100,2100,3000,40));

        clients.addClientsToClientsList(new Clients("Artem","Verzun",20,"Standart"));
        clients.addClientsToClientsList(new Clients("Artem2","Verzun2",21,"Standart"));
        clients.addClientsToClientsList(new Clients("Artem3","Verzun3",22,"Standart"));
        clients.addClientsToClientsList(new Clients("Artem4","Verzun4",23,"Standart"));
        clients.addClientsToClientsList(new Clients("Artem5","Verzun5",24,"Standart"));
        clients.addClientsToClientsList(new Clients("Artem6","Verzun6",25,"Standart"));
        clients.addClientsToClientsList(new Clients("Artem7","Verzun7",25,"Standart"));

        int choose = 0;
        Scanner in = new Scanner(System.in);

        do {
            showMenu();
            System.out.print(">> ");
            choose = in.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("\nТарифы: ");
                    for (MobileTariffs c : tariff.tariffsList) {
                        System.out.println(c);
                    };
                    break;
                case 2:
                    System.out.println("\nСортировка по размеру абонентской платы: ");
                    List<MobileTariffs> SubFee = tariff.sortTarriffsByFee();
                    for (MobileTariffs c : SubFee) {
                        System.out.println(c);
                    }
                    break;
                case 3:
                    System.out.println("\nДиапазон тарифов: ");
                    int a = in.nextInt();
                    int b = in.nextInt();
                    List<MobileTariffs> diapasonTariffs = tariff.sortTariffsByPrice(a, b);
                    for (MobileTariffs c : diapasonTariffs) {
                        System.out.println(c);
                    }
                    break;
                case 4:
                    System.out.println("\nСписок клиентов: ");
                    int count = 0;
                    for (Clients c : clients.clientsList) {
                        System.out.println(c);
                        count++;
                    };
                    System.out.println("\nКол-во клиентов: " + count);
                    break;
            }
        } while (choose != 5);
    }


    public MobileCompany(String companyName) {
    }


    //Инициализация списка тарифных планов
    private final ArrayList<MobileTariffs> tariffsList = new ArrayList<>();

    //Инициализация списка клиентов
    private final ArrayList<Clients> clientsList = new ArrayList<>();


    //Метод для создания списка тарифных планов
    void addTariffsToTariffList(MobileTariffs tariff){
        tariffsList.add(tariff);
    }

    //Метод для создания списка клиентов
    void addClientsToClientsList(Clients client){
        clientsList.add(client);
    }


    //Список сортировки по диапазону
    List<MobileTariffs> sortTariffsByPrice(int diapasonStart, int diapasonEnd) {
        List<MobileTariffs> list = new ArrayList<>();
        for (MobileTariffs c : tariffsList) {
            if (c.getPrice() >= diapasonStart && c.getPrice() <= diapasonEnd) {
                list.add(c);
            }
        }
        return list;
    }

    // Список сортировки по возрастанию цены
    public List<MobileTariffs> sortTarriffsByFee() {
        Collections.sort(tariffsList, new Comparator() {
            public int compare(Object o1, Object o2) {
                MobileTariffs a1 = (MobileTariffs) o1;
                MobileTariffs a2 = (MobileTariffs) o2;
                if (a1.getPrice() > a2.getPrice()) {
                    return 1;
                }
                if (a2.getPrice() > a1.getPrice()) {
                    return -1;
                }
                return 0;
            }
        });
        return tariffsList;
    }

    //Консольное меню
    private static void showMenu() {
        System.out.println("\n");
        System.out.printf("%10s \n", "----------Меню----------");
        System.out.println("1. Список тарифов");
        System.out.println("2. Сортировка по размеру абонентской платы");
        System.out.println("3. Диапазон тарифов");
        System.out.println("4. Список клиентов");
        System.out.println("5. Exit");
        System.out.println("------------------------");
    }
}

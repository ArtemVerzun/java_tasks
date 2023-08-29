public class MobileTariffs {
    private final String name;
    private int price;
    private final int callsInNetwork;
    private final int callsToOtherNetwork;
    private final int internetMB;
    private final int freeSMS;


    public MobileTariffs(String name, int price, int callsInNetwork, int callsToOtherNetwork, int internetMB, int freeSMS) {
        this.name = name;
        this.price = price;
        this.callsInNetwork = callsInNetwork;
        this.callsToOtherNetwork = callsToOtherNetwork;
        this.internetMB = internetMB;
        this.freeSMS = freeSMS;

    }


    public int getPrice() {
        return price;
    }

    //Не используется
    public void setPrice(int price) {
        this.price = price;
    }


    public String toString() {
        return String.format("Тариф: %s\t стоимость: %d\t звонки внутри сети: %d\t звонки на другие номера: %d \t интернет Мб: %d\t Бесплатные SMS: %d\t " ,
                name, price, callsInNetwork, callsToOtherNetwork, internetMB, freeSMS);
    }
}

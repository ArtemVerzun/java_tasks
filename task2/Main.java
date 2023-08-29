public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Борька", "корова",500, 7);
        System.out.println("имя: " + animal.getName() + " вид: " + animal.getType() + " вес(кг): " + animal.getWeight() + ", возраст: " + animal.getAge());
        System.out.println("-------------------------------");
        animal.setName("Фенди");
        animal.setType("кошка");
        animal.setWeight(3);
        animal.setAge(5);
        System.out.println("имя: " + animal.getName() + " вид: " + animal.getType() + " вес(кг): " + animal.getWeight() + ", возраст: " + animal.getAge());
        System.out.println("-------------------------------");
    }
}

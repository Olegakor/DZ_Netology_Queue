import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ManicureSalon {
    public static void main(String[] args) {
        List<String> firstClients = List.of("Anya", "Sveta", "Olya", "Alexandra", "Ruslana", "Olesya", "Vika");
        Queue<String> clientsQueue = new LinkedList<>(firstClients);

        while (!clientsQueue.isEmpty()) {
            String currentClient = clientsQueue.poll();
            // Обработка текущего клиента
            System.out.println(currentClient + " сделала новый маникюр.");

            // Проверка, приведёт ли клиент друга
            if (Math.random() < 0.5) {
                String friendName = "a friend of " + currentClient;
                clientsQueue.offer(friendName); // Добавляем друга в конец очереди
                System.out.println(friendName + " записался на маникюр.");
            } else {
                System.out.println(currentClient + " не привёл друга.");
            }
        }

        System.out.println("Все клиенты обслужены.");
    }
}
public class NetworkUtils {
    public static void getConnection(){
        // Получаем соединение с сервером и хотим чтоб он выполнялся не больше секунды
        try {
            Thread.sleep(999);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return;
    }
}

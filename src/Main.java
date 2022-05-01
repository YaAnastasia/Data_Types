public class Main {
    public static void main(String[] args) {
        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной милли
        int ticketPrice = 65;
        int bonusMilePrice = 20;

        // Рассчитываете количество бонусных милль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран
        int bonusMileAmount = ticketPrice / bonusMilePrice;
        System.out.println("Количество бонусных милль:" + bonusMileAmount);
    }
}

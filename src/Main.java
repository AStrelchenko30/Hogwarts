import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Griffendor potter = new Griffendor("Гарри", "Поттер", 6, 8, 6, 8, 7);
        Griffendor granger = new Griffendor("Гермиона", "Грейнджер", 5, 5, 6, 9, 6);
        Griffendor withly = new Griffendor("Рон", "Уизли", 3, 6, 5, 3, 4);

        Pufenduy smith = new Pufenduy("Захария", "Смитт", 6, 1, 7, 5, 7);
        Pufenduy diggory = new Pufenduy("Седрик", "Диггори", 5, 5, 8, 5, 5);
        Pufenduy finch = new Pufenduy("Джастин", "Финч-Флетчи", 4, 6, 2, 4, 6);

        Slizaren malfoy = new Slizaren("Драко", "Малфой", 7, 4, 6, 6, 7, 7, 4);
        Slizaren montegry = new Slizaren("Грехэм", "Монтегю", 1, 3, 3, 5, 1, 4, 5);
        Slizaren goil = new Slizaren("Грегори", "Гойл", 5, 1, 1, 2, 1, 5, 6);

        Kogtevran chang = new Kogtevran("Чжоу", "Чанг", 7, 2, 2, 1, 2, 3);
        Kogtevran patil = new Kogtevran("Падма", "Патил", 2, 1, 5, 5, 4, 5);
        Kogtevran baldy = new Kogtevran("Маркус", "Бэлби", 6, 5, 2, 5, 6, 1);

        smith.printAll(smith);
        potter.whoIsBetter(granger);
        diggory.whoIsBetter(finch);
        chang.whoIsBetter(baldy);
        malfoy.whoIsBetter(goil);
        potter.whoIsBetterInHogwarts(malfoy);
    }

}
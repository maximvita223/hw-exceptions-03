import java.util.Scanner;

public class Scan {
    public String[] lst;

    public String[] scannParser() {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("Введите данные в порядке через пробел " +
                        "ФИО дата рождения через точку номер телефона пол f или m");
                this.lst = sc.nextLine().split(" ");
                if (this.lst.length < 6 || this.lst.length > 6) {
                     System.out.println("Введено не корректное колличество данных");
                }
                else{
                     break;
                }
            }
        }
        return this.lst;
    }
}
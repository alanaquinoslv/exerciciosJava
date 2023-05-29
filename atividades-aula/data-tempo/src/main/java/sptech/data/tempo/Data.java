package sptech.data.tempo;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author alan
 */
public class Data {

    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        LocalDate data2 = LocalDate.of(2023, 5, 24);
        LocalDate data3 = LocalDate.parse("2022-03-22");
        LocalDate data4 = LocalDate.parse("2000-05-22");
        Boolean isBi = data3.isLeapYear();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");

        System.out.println(data.format(formatador));
        System.out.println(data2);
        System.out.println(isBi);
        System.out.println(data3.isBefore(data2));
        System.out.println(data3.isAfter(data2));
        System.out.println(data.getDayOfYear());
    }
}

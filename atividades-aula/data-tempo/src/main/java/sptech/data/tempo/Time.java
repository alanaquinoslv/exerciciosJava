package sptech.data.tempo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author alan
 */
public class Time {

    public static void main(String[] args) {
        LocalDateTime dataTime1 = LocalDateTime.now();
        LocalDateTime dataTime2 = LocalDateTime.of(2000, 3, 2, 22, 23);
        LocalDateTime dataTime3 = LocalDateTime.parse("2000-01-01T00:00:00");

        LocalDateTime maisUmDia = dataTime1.plusDays(1);
        LocalDateTime menosUmDia = dataTime3.minusDays(1);
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println(menosUmDia.format(formatador));
        System.out.println(menosUmDia);
        System.out.println(dataTime3.plusDays(1));
    }
}

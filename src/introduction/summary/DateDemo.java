package introduction.summary;

import java.time.LocalDate;

public class DateDemo {
    static void main() {
        Date dt1 = new Date(1904,2,29);
        dt1.setDay(33);
        System.out.println(dt1.toString());

        System.out.println(LocalDate.now().plusDays(300));
    }
}

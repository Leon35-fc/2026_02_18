package fabiocarlino.u5l13;

import fabiocarlino.u5l13.es1.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class U5l13Application {

    public static void main(String[] args) {

        SpringApplication.run(U5l13Application.class, args);

        Info info = new Info("Carlo", "Lanfranchi", "1980-02-02");
        System.out.println(info);
    }


}

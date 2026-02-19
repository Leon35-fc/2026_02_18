package fabiocarlino.u5l13;

import fabiocarlino.u5l13.es1.Info;
import fabiocarlino.u5l13.es1.InfoAdapter;
import fabiocarlino.u5l13.es1.UserData;
import fabiocarlino.u5l13.es3.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Calendar;
import java.util.Date;

@SpringBootApplication
public class U5l13Application {

    public static void main(String[] args) {

        SpringApplication.run(U5l13Application.class, args);

        //ESERCIZIO 1
        // ADAPTER CLASSE INFO
        Info info = new Info();
        info.setNome("Carlo");
        info.setCognome("Lanfranchi");
        // Il -1900 serve a compensare il formata della data dell'oggetto Date
        info.DataDiNascita(new Date(1980 - 1900, Calendar.FEBRUARY, 2));

        InfoAdapter iAdapt = new InfoAdapter(info);

        System.out.println("Nome Completo: " + iAdapt.getNomeCompleto());
        System.out.println("Età: " + iAdapt.getEta());

        UserData userData = new UserData();
        userData.setData(iAdapt);

        System.out.println(userData);


        //ESERCIZIO 2

        //ESERCIZIO 3
        Tenente tenente = new Tenente();
        Capitano capitano = new Capitano();
        Maggiore maggiore = new Maggiore();
        Colonnello colonnello = new Colonnello();
        Generale generale = new Generale();

        tenente.setNextUfficiale(capitano);
        capitano.setNextUfficiale(maggiore);
        maggiore.setNextUfficiale(colonnello);
        colonnello.setNextUfficiale(generale);

        tenente.doCheck(2000);


    }
}


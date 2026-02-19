package fabiocarlino.u5l13.es1;

import java.time.LocalDate;
import java.time.ZoneId;

public class InfoAdapter implements DataSource {
    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return this.info.getNome() + " " + this.info.getCognome();
    }

    @Override
    public int getEta() {
        LocalDate birthday = this.info
                .getDataDiNascita()
                .toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        int age = LocalDate.now().getYear() - birthday.getYear();
        return (int) age;
    }

//    @Override
//    public int getEta() {
//        Date dataDiNascita = info.getDataDiNascita(); //prendo data di nascita da info
//        Calendar nascita = Calendar.getInstance(); //creo calendario
//        nascita.setTime(dataDiNascita); // assegno a nascita la data di nascita
//        Calendar oggi = Calendar.getInstance(); //creo un calendar con valore oggi LocalDate.now()
//
//        int eta = oggi.get(Calendar.YEAR) - nascita.get(Calendar.YEAR);
//        return eta;
//    }

    @Override
    public String toString() {
        return "InfoAdapter{" +
                "Nome Completo = " + getNomeCompleto() +
                ", Età = " + getEta() +
                '}';
    }
}

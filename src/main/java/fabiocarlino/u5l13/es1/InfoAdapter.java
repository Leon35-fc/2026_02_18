package fabiocarlino.u5l13.es1;

import java.time.LocalDate;
import java.time.ZoneId;

public class InfoAdapter implements DataSource {
    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    public String getNomeCompleto() {
        return info.getNome() + info.getCognome();
    }

    public int getEta() {
        LocalDate birthday = info.getDataDiNascita().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//        Period age = Period.between(info.getDataDiNascita().toInstant(), LocalDate.now());
        LocalDate age = birthday - LocalDate.now();
        return age.getYear();
    }
}

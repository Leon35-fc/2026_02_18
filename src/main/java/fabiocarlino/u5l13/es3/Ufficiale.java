package fabiocarlino.u5l13.es3;

abstract public class Ufficiale {

    private Ufficiale nextUfficiale;
    private int stipendio;

    public Ufficiale getNextUfficiale() {
        return nextUfficiale;
    }

    public void setNextUfficiale(Ufficiale nextUfficiale) {
        this.nextUfficiale = nextUfficiale;
    }

    public int getStipendio() {
        return stipendio;
    }

    public void setStipendio(int stipendio) {
        this.stipendio = stipendio;
    }

    public void doCheck(int cifra) {
        if (cifra < this.getStipendio())
            System.out.println("Lo stipendio di un " + this.getClass().getSimpleName() + " è superiore di " + cifra + '.');
        if (nextUfficiale != null) {
            this.nextUfficiale.doCheck(cifra);
        } else {
            System.out.println("Non ci sono ulteriori ufficiali.");
        }
    }
}

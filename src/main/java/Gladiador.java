public class Gladiador {
    private int digitoUnico;
    private boolean preparado;

    public Gladiador(int digitoUnico, boolean preparado) {
        this.digitoUnico = digitoUnico;
        this.preparado = preparado;
    }

    public int getDigitoUnico() {
        return digitoUnico;
    }

    public void setDigitoUnico(int digitoUnico) {
        this.digitoUnico = digitoUnico;
    }

    public boolean isPreparado() {
        return preparado;
    }

    public void setPreparado(boolean preparado) {
        this.preparado = preparado;
    }
}

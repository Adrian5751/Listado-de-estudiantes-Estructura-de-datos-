public class Estudiante {
    private String ci;
    private String nombre;
    private String apellido;
    private String sexo;
    private int ano;
    private boolean militanteUJC;
    private boolean becado;
    private int mesCumpleanos;

    public Estudiante(String ci, String nombre, String apellido, String sexo, int ano,
                      boolean militanteUJC, boolean becado, int mesCumpleanos) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.ano = ano;
        this.militanteUJC = militanteUJC;
        this.becado = becado;
        this.mesCumpleanos = mesCumpleanos;
    }

    public String getCi() { return ci; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getSexo() { return sexo; }
    public int getAno() { return ano; }
    public boolean isMilitanteUJC() { return militanteUJC; }
    public boolean isBecado() { return becado; }
    public int getMesCumpleanos() { return mesCumpleanos; }

    @Override
    public String toString() {
        return ci + " - " + nombre + " " + apellido + " - " + sexo + " - " + ano;
    }
}

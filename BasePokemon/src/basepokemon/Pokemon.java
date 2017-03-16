
package basepokemon;

/**
 * @author Zelph
 */

public class Pokemon {
    
    String nombre;
    String tipo;
    double peso;
    double altura;
    int vida;
    int puntosCombate;
    String alias;
    String ruta;

    public Pokemon(String nombre, String tipo, double peso, double altura, int vida, int puntosCombate, String alias, String ruta) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.peso = peso;
        this.altura = altura;
        this.vida = vida;
        this.puntosCombate = puntosCombate;
        this.alias = alias;
        this.ruta = ruta;
    }
    
    public Pokemon(){
  
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getPuntosCombate() {
        return puntosCombate;
    }

    public void setPuntosCombate(int puntosCombate) {
        this.puntosCombate = puntosCombate;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
    
    
    
    
}

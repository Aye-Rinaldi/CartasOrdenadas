package ar.com.xeven;

import java.util.Objects;

public class Carta implements Comparable<Carta>{
    //atributos de clase
    private static String[] numeros = {"as","dos","tres","cuatro","cinco","seis","siete","sota","caballo","rey"};
    private static String[] palos = {"bastos","copas","espadas","oros"};

    //atributos de instancia
    private Integer numero;
    private String palo;

    //constructor
    public Carta(){
        this.numero = (int)(Math.random()*10);
        this.palo = palos[(int)(Math.random()*4)];
    }

    //getters
    public Integer getNumero() {
        return numero;
    }

    public String getPalo() {
        return palo;
    }

    //tostring
    @Override
    public String toString() {
        return numeros[numero]+" de "+palo;
    }

    //equals
    @Override
    public boolean equals(Object obj) {
        boolean salida = false;
        if (obj==null)
            salida = false;
        if(getClass() != obj.getClass())
            salida = false;
        final Carta other = (Carta) obj;
        if (!Objects.equals(this.numero,other.numero))
            salida = false;
        if (!Objects.equals(this.palo,other.palo))
            salida = false;

        return salida;
    }

    //comparar para poder ordenar
    @Override
    public int compareTo(Carta carta){
        if (palo.equals(carta.getPalo()))
            return numero.compareTo(carta.getNumero());
        else
            return palo.compareTo(carta.getPalo());

    }
}

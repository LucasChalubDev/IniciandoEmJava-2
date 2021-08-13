
package aula04;


public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.carga = 100;
        c1.cor = "azul";
        c1.fechada = true;
        //c1.imprimeEstado();
        
        Caneta c2 = new Caneta();
        c2.carga = 55;
        c2.cor = "vermalho";
        c2.fechada = false;
        //c2.imprimeEstado();
        
        c1 = c2;
        
        c1.cor = "preto";
        
        c1.imprimeEstado();
        c2.imprimeEstado();
    }
    
}

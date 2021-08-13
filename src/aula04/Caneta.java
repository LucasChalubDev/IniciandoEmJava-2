
package aula04;

public class Caneta {
    int carga;
    boolean fechada;
    String cor;
    
    void imprimeEstado(){
        System.out.println(cor+", "+fechada+", "+carga);
    }
    
    void escrever(){
        if(fechada){
            System.out.println("Impossivel escrever");
        }
        else{
            System.out.println("Escrevendo");
            carga = carga - 5;
        }
    }
    
    void fechar(){
        fechada = true;
    }
    
    void abrir(){
        fechada = false;
    }
}

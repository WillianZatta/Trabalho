
/**
 *
 * @author willi
 */
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    boolean tampada;
    
    void status(){
        System.out.print("Uma caneta: "+ this.cor);
        System.out.println("Esta tampada ? "+ this.tampada);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("modelo: "+ this.modelo);
                
    }
    void rabiscar(){
        if (this.tampada == true){
            System.err.println("ERRO nao posso rabiscar");
        }else{
            System.err.println("Estou Rabiscando");
        }
    }
    void tampar(){
        this.tampada = true;
        
    }
    void destampar(){
       this.tampada = false;
        
    }
    
}

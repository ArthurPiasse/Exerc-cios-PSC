
public class Usuario {
    public static void main(String[] args) {
        CondicionadorDeAr ar = new CondicionadorDeAr();
        
        ar.ligar();
        
        for (int i = 0; i < 10; i++) {
            ar.aumentarTemperatura();
        }
        
        for (int i = 0; i < 15; i++) {
            ar.reduzirTemperatura();
        }
        
        for (int i = 0; i < 5; i++) {
            ar.aumentarTemperatura();
        }
        
        ar.imprimirTemperatura();
    }
}

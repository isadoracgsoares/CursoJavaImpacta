
public interface Eletrodomestico {

    void ligar();
    void desligar();
        
    default void acionarTimer(int segundos) {

        /* Aguarda a quantidade de segundos informada. */
        try { Thread.sleep(segundos*1000); } catch (Exception e) {}

        /* Executa o método desligar conforme implementado na classe. */
        desligar();
    }
    
    static void ligarTudo(Eletrodomestico... eletroArray) {
        for (Eletrodomestico eletro : eletroArray) {
            eletro.ligar();
        }
    }
    
    //metodos privados permitidos a partir do java 9

}

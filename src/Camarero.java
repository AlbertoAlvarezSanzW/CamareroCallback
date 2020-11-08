public class Camarero extends Thread{

    public Camarero() throws InterruptedException{
        Cliente cli = new Cliente(this);
        cli.start();
    }



    @Override
    public void run() {
        try{
            while (true){
                prepararComanda();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }




    public void prepararComanda() throws InterruptedException {
        System.out.println("Camarero: Si he llegado aqui es porque tengo un cliente");
        Main.instrucciones.add("Refrescos");
        sleep(1000);
        Main.instrucciones.add("Entrantes");
        sleep(2000);
        Main.instrucciones.add("Primeros platos");
        sleep(2000);
        Main.instrucciones.add("Segundos platos");
        sleep(2000);
        Main.instrucciones.add("Postres");
        System.out.println("Aqui tienen la carta");
        sleep(5000);
    }
}

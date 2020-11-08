public class Cliente extends Thread{

    Camarero cam1;

    public Cliente(Camarero cam1) throws InterruptedException{
        this.cam1=cam1;
    }

    @Override
    public void run() {
        try{
            while (true){
                if (Main.instrucciones.isEmpty()){
                    System.out.println("Cliente: Voy a esperar a que me atiendan");
                    cam1.prepararComanda();
                }else{
                    System.out.println("Voy a pedir: "+Main.instrucciones.get(0));
                    Main.instrucciones.remove(0);
                    sleep(3000);
                }
            }

        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}

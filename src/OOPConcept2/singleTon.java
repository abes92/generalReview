package OOPConcept2;

public class singleTon {
    public static void main(String[] args) {
        ABC obj=ABC.getInstance();

    }
    static  class  ABC{
        static ABC obj=new ABC();
        private ABC(){
            System.out.println("still waiting for the GOD plan");
        }
        public static ABC getInstance(){
            return obj;
        }
    }
}

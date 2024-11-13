public class App {
    public static void main(String[] args) throws Exception {
        Mensalista m1 = new Mensalista("José", "Rua abc n345", "Junior");
        Horista h1 = new Horista("Maria", "Rua 23 de maio", 10);
        m1.calcularSalario();
        System.out.println("INSS: "+m1.calcularINSS());
        System.out.println("IR: "+m1.calcularIR());
        
        h1.calcularSalario();
        System.out.println("INSS: "+h1.calcularINSS());
        System.out.println("IR: "+h1.calcularIR());
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float am = 1.87F;
        float bkg = 98;
        int index = service.calculate(am, bkg);
        System.out.println(index);
    }
}

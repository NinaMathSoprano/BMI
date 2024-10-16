public class BmiService {
    public int calculate(float height, float weight) {

        System.out.println("масса = " + weight);
        System.out.println("рост = " + height);

        float i = weight/(height*height);

        return (int) i;
    }
}

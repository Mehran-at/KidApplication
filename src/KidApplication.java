import java.util.Arrays;
import java.util.List;

public class KidApplication {
    public static void main(String[] args) {
        Lisa lisa = new Lisa("Pizza");
        Tommy tommy = new Tommy("ice-cream");

        List<Kid> kids = Arrays.asList(tommy, lisa);
        for (Kid kid : kids) {
            kid.annoy();
        }
    }
}

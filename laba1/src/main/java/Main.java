import java.security.NoSuchAlgorithmException;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Questions questions = new Questions();
        questions.init();
        Logger.getAnonymousLogger().log(Level.FINE, (Supplier<int>) questions.arrayLists);


    }
}

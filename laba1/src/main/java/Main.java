import java.security.NoSuchAlgorithmException;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Questions questions = new Questions();
        questions.init();
<<<<<<< HEAD
        Logger.getAnonymousLogger().log(Level.FINE, (Supplier<double>) questions.arrayLists);
=======
        Logger.getAnonymousLogger().log(Level.FINE, (Supplier<int>) questions.arrayLists);
>>>>>>> task1


    }
}

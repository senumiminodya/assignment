import lk.ijse.gdse.aad67.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class AppInit {
    public static void main(String[] args) {
       var ctx = new AnnotationConfigApplicationContext();
       ctx.register(Config.class);
       ctx.refresh();
    }
}
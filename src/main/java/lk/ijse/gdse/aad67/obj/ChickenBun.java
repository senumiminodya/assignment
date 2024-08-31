package lk.ijse.gdse.aad67.obj;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ChickenBun {
    public ChickenBun() {
        System.out.println("Chicken Bun");
    }
}

package lk.ijse.gdse.aad67.obj;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier
public class ChickenRoll {
    public ChickenRoll() {
        System.out.println("Chicken Roll");
    }
}

package lk.ijse.gdse.aad67.obj;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FishPastry {
    public FishPastry() {
        System.out.println("Fish Pastry");
    }
}

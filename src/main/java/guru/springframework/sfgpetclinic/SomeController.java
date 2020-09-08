package guru.springframework.sfgpetclinic;

public class SomeController {

    private final MyServiceJpaImpl myService;

    public SomeController(MyServiceJpaImpl myService) {
        this.myService = myService;
    }
}

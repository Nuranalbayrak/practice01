package overridding;

public class C extends  B{
    @Override
    public A display() {
        return new C();
    }
}


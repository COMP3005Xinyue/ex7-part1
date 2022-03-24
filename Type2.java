public class Type2 implements Visitable{
    private String name;

    public Type2(String n){
        this.name = n;
    }

    @Override
    public void taxes(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getName() {
        return name;
    }
}

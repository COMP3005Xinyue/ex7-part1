public class Type3 implements Visitable{
    private String name;

    public Type3(String n){
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
public class Visitor implements CityVisitor{
    @Override
    public void visit(Type1 t1) {
        System.out.println("Computing municipal taxes for Type1 building named: " + t1.getName());
        System.out.println("Computing school taxes for Type1 building named: " + t1.getName());
    }

    @Override
    public void visit(Type2 t2) {
        System.out.println("Computing municipal taxes for Type2 building named: " + t2.getName());
        System.out.println("Computing school taxes for Type2 building named: " + t2.getName());
    }

    @Override
    public void visit(Type3 t3) {
        System.out.println("Computing municipal taxes for Type3 building named: " + t3.getName());
        System.out.println("Computing school taxes for Type3 building named: " + t3.getName());
    }
}

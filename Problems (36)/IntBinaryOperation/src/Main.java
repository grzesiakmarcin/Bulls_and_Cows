abstract class IntBinaryOperation {

    protected int firstArg;
    protected int secondArg;

    public IntBinaryOperation(int firstArg, int secondArg) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }

    public abstract int perform(int firstArg,int secondArg);
}
class Addition extends IntBinaryOperation{
    int jeden;
    int dwa;
    
    public Addition (int jeden, int dwa){
        super(jeden,dwa);
    }
    
    
    @Override
    public int perform(int jeden, int dwa){
        return jeden+dwa;
    }
}
class Multiplication extends IntBinaryOperation{
    int jeden;
    int dwa;
    
    public Multiplication (int jeden, int dwa){
        super(jeden,dwa);
    }
    
    
    @Override
    public int perform(int jeden, int dwa){
        return jeden*dwa;
    }
}
// declare and implement your classes here

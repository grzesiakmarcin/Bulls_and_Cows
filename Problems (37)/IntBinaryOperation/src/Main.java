abstract class IntBinaryOperation {

    protected int firstArg;
    protected int secondArg;

    public IntBinaryOperation(int firstArg, int secondArg) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }

    public abstract int perform(int firstArg, int secondArg);
}

// declare and implement your classes here

class Addition extends  IntBinaryOperation{
    int firstArg;
    int secondArg;

    public Addition(int firstArg, int secondArg) {
        super(firstArg,secondArg);

    }

    @Override
    public int perform(int firstArg, int secondArg){
        return firstArg+secondArg;
    }
}
class Multiplication extends IntBinaryOperation {
   int firstArg;
   int secondArg;

    public Multiplication (int firstArg, int secondArg){
        super(firstArg,secondArg);
    }

    @Override
    public int perform(int firstArg, int secondArg) {
        return firstArg*secondArg;
    }
}

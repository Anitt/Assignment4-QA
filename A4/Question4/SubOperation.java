public class SubOperation implements IOperator{
    private int leftOperand;
    private int rightOperand;

    public SubOperation(int left, int right)
    {
        this.leftOperand = left;
        this.rightOperand = right;
    }

    @Override
    public int GetResult() {
        return leftOperand-rightOperand;
    }
}

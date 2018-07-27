public class MulOperation implements IOperator {
    private int leftOperand;
    private int rightOperand;

    public MulOperation(int left, int right)
    {
        this.leftOperand = left;
        this.rightOperand = right;
    }

    @Override
    public int GetResult() {
        return leftOperand*rightOperand;
    }
}

public class DivOperation implements IOperator {

    private int leftOperand;
    private int rightOperand;

    public DivOperation(int left, int right)
    {
        this.leftOperand = left;
        this.rightOperand = right;
    }

    @Override
    public int GetResult() {
        return leftOperand/rightOperand;
    }
}

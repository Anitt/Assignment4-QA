public class MathOperation
{

	private IOperator operationType;

	public MathOperation(IOperator operationType)
	{
		this.operationType = operationType;
	}

	public int GetResult()
	{
			return operationType.GetResult();
	}
}
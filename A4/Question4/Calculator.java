public class Calculator
{
	public static int Divide(int left, int right)
	{
		MathOperation op = new MathOperation(new DivOperation(left, right));
		return op.GetResult();
	}

	public static int Multiply(int left, int right)
	{
		MathOperation op = new MathOperation(new MulOperation( left, right));
		return op.GetResult();
	}

	public static int Add(int left, int right)
	{
		MathOperation op = new MathOperation(new AddOperation(left, right));
		return op.GetResult();
	}

	public static int Subtract(int left, int right)
	{
		MathOperation op = new MathOperation(new SubOperation(left, right));
		return op.GetResult();
	}
}
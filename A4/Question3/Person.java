
public class Person
{
	public String name;
	Address address = new Address();

	public Person()
	{
		name = "Rob";
		this.address.setStreet("Rob street");
		this.address.setCity("Rob city");
		this.address.setProvince("Rob province");
		this.address.setPostalcode("Rob postalcode");



	}

	public boolean IsPersonRob()
	{
		return name.equals("Rob") && IsRobsAddress(address);
	}

	private boolean IsRobsAddress(Address address)
	{
		return address.getStreet().equals("Rob street") &&
			address.getCity().equals("Rob city") &&
			address.getProvince().equals("Rob province") &&
				address.getPostalcode().equals("Rob postalcode");
	}
}
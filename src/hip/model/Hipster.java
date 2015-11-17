package hip.model;

public class Hipster 
{
	private String name;
	private String [] hipsterPhrases;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getHipsterPhrases() {
		return hipsterPhrases;
	}

	public void setHipsterPhrases(String[] hipsterPhrases) {
		this.hipsterPhrases = hipsterPhrases;
	}

	public Hipster()
	{
		this.name = "";
		this.hipsterPhrases = new String[4];
		setupArray();
	}
	
	private void setupArray()
	{
		hipsterPhrases[0] = "this.jpeg";
		hipsterPhrases[1] = "Insert saracastic comment here.";
		hipsterPhrases[2] = "Hello";
		hipsterPhrases[3] = "Need my starbucks";
	}

	

}

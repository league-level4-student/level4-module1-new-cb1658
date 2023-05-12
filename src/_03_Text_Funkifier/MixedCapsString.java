package _03_Text_Funkifier;

public class MixedCapsString implements TextFunkifier{

    private String unfunkifiedText;

    public MixedCapsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

	@Override
	public String funkifyText() {
		
		StringBuilder bob = new StringBuilder();
		
		for(int i = 0; i < unfunkifiedText.length(); i++) {
			
			
			if(i % 2 == 1) {
				bob.append(Character.toUpperCase(unfunkifiedText.charAt(i)));
			}
			else {
				bob.append(Character.toLowerCase(unfunkifiedText.charAt(i)));
			}
		}
		
		System.out.println(bob.toString());
		
		return bob.toString();
	}

}

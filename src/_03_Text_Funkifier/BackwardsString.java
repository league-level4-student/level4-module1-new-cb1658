package _03_Text_Funkifier;

public class BackwardsString implements TextFunkifier {

    private String unfunkifiedText;

    public BackwardsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

    @Override
    public String funkifyText() {

    	StringBuilder bob = new StringBuilder(); 
    	
    	
    	for(int i = unfunkifiedText.length()-1; i >= 0; i--) {
    		bob.append(unfunkifiedText.charAt(i));
    	}
    	
    	
    //	bob.append(unfunkifiedText.charAt(unfunkifiedText.length()-1)  );
    	
    	//System.out.print(bob.toString());
    	
        return bob.toString();

    }
}

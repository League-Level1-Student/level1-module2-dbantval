package _06_tea_party;

public class TeaParty {
    public String welcome(String name, boolean isWoman, boolean isKnighted) {
        
    





if(isWoman) {
	
	if (isKnighted) {
		return "Hello Lady " + name;
	}
}
if(isWoman) {
	
	if(isKnighted == false) {
		return "Hello Ms. " + name;
	}
}
if(isWoman == false) {
	
	if(isKnighted) {
		return "Hello Sir " + name;
	}
}
if(isWoman == false) {

	if(isKnighted == false) {
		return "Hello Mr. " + name;
	}
}
return "";



}
}
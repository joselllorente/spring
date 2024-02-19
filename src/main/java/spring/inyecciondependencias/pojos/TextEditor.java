package spring.inyecciondependencias.pojos;

public class TextEditor {

	private SpellChecker spellChecker;
	
	public TextEditor(){
		System.out.println("Inside TextEditor empty constructor.");
	}
	
	public TextEditor(SpellChecker spellChecker){
		System.out.println("Inside TextEditor constructor.");
		this.spellChecker=spellChecker;
	}
	
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside TextEditor setSpellChecker.");
		this.spellChecker = spellChecker;
	}

	public void spellCheck(){
		spellChecker.checkSpelling();
	}
}

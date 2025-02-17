package lightOpgaver.fire;

import java.util.ArrayList;
import java.util.List;

public class Keyword {
    private String word;
    private String definition;
    private List<Keyword> seeAlso;

    public Keyword(String word, String definition) {
        this.word = word;
        this.definition = definition;
        this.seeAlso = new ArrayList<>();
    }

    public String getWord() {
        return word;
    }
    public String getDefinition() {
        return definition;
    }

    public List<Keyword> getSeeAlso() {
        return new ArrayList<>(seeAlso);
    }

    public boolean matches(String seachWord) {
        return this.word.equalsIgnoreCase(seachWord);
    }

    public void addSeeAlso(Keyword relatedKeyword) {
        this.seeAlso.add(relatedKeyword);
    }
}

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Radiostation {
    private Set<State> coveredStates;
    private String name;

    public Radiostation(String name, Set<State> coveredStates) {
        this.coveredStates = coveredStates;
        this.name = name;
    }

    public Radiostation(String name, String... stateNames){
        this.name = name;
        coveredStates = State.getSetOfStates(stateNames);
    }

    public Set<State> getCovers() {
        return coveredStates;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

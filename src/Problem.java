import java.util.List;
import java.util.Set;

public class Problem {
    private List<Radiostation> radiostations;
    private Set<State> states;

    public Problem(List<Radiostation> radiostations, Set<State> states) {
        this.radiostations = radiostations;
        this.states = states;
    }

    public Set<State> getStates() {
        return states;
    }

    public List<Radiostation> getRadiostations() {
        return radiostations;
    }

}
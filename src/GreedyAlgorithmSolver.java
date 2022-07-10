import java.util.*;

public class GreedyAlgorithmSolver {
    private Set<State> uncoveredStates;
    private Problem problem;
    private Set<Radiostation> resultingRadiostations;
    private Set<Radiostation> unusedRadiostations;

    public GreedyAlgorithmSolver(Problem problem) {
        this.problem = problem;
        uncoveredStates = EnumSet.copyOf(problem.getStates());
        resultingRadiostations = new HashSet<>();
        unusedRadiostations = new HashSet<Radiostation>(problem.getRadiostations());
    }

    public Set<Radiostation> getResult(){
        while(uncoveredStates.size()!=0){
            nextIteration();
        }
        return resultingRadiostations;
    }

    private void nextIteration(){
        Radiostation bestRadiostation = findBestRadiostation();
        resultingRadiostations.add(bestRadiostation);
        unusedRadiostations.remove(bestRadiostation);
        uncoveredStates.removeAll(bestRadiostation.getCovers());
    }

    public Set<Radiostation> getResultingRadiostations() {
        return resultingRadiostations;
    }

    private Radiostation findBestRadiostation(){
        Iterator<Radiostation> iter = unusedRadiostations.iterator();

        Radiostation bestRadiostation = iter.next();
        int bestCoverSize = MathMethods.getIntersection(bestRadiostation.getCovers(), uncoveredStates).size();

        while(iter.hasNext()){

            Radiostation currentStation = iter.next();
            int currentCoverSize = MathMethods.getIntersection(currentStation.getCovers(), uncoveredStates).size();

            if(currentCoverSize > bestCoverSize){
                bestCoverSize = currentCoverSize;
                bestRadiostation = currentStation;
            }
        }
        return bestRadiostation;
    }

}

import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Radiostation r1 = new Radiostation("r1", "KYIV", "MYKOLAIV", "HERSON", "KHARKIV", "DONETSK");
        Radiostation r2 = new Radiostation("r2", "KYIV", "MYKOLAIV", "HERSON", "KHARKIV");
        Radiostation r3 = new Radiostation("r3", "LVIV", "ODESA", "DNIPRO");

        Radiostation r4 = new Radiostation("r4","CHERNIHIV", "LUTSK");

        Radiostation r5 = new Radiostation("r5", "CHERNIHIV", "RIVNE");

        Radiostation r6 = new Radiostation("r6","ZAPORIZHIA", "RIVNE", "KHARKIV", "KYIV");
        Radiostation r7 = new Radiostation("r7","LVIV", "KYIV");

        Set<State> allStates = EnumSet.allOf(State.class);

        List<Radiostation> allRadiostations = new ArrayList<>(Arrays.asList(r1, r2, r3, r4, r5, r6, r7));
        GreedyAlgorithmSolver ga = new GreedyAlgorithmSolver(new Problem(allRadiostations, allStates));
        ga.getResult();
        System.out.println(ga.getResultingRadiostations());


    }
}

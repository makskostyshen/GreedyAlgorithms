import java.util.EnumSet;
import java.util.Locale;
import java.util.Set;

public enum State {
    KYIV,
    MYKOLAIV,
    HERSON,
    KHARKIV,
    DONETSK,
    LVIV,
    ODESA,
    DNIPRO,
    CHERNIHIV,
    LUTSK,
    RIVNE,
    ZAPORIZHIA;

    public static Set<State> getSetOfStates(String... stateNames){
        Set<State> result = EnumSet.noneOf(State.class);
        for(String stateName: stateNames){
            result.add(State.valueOf(stateName.toUpperCase(Locale.ENGLISH)));
        }
        return result;
    }
}

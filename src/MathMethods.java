import java.util.HashSet;
import java.util.Set;

public class MathMethods<T> {
    public static <T> Set<T> getIntersection(Set<T> firstSet, Set<T> secondSet){
        Set<T> firstSetCopy = new HashSet(firstSet);
        firstSetCopy.retainAll(secondSet);
        return firstSetCopy;
    }
}

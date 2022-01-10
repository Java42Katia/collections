package telran.util.numbers;

import java.util.function.Predicate;

public interface BoxNumbers extends Iterable<Integer>{
boolean containsNumber(int num);
boolean addNumber(int num);
boolean removeNumber(int num);
int removeRepeated(); //returns amount of removed numbers
int removeInRange(int fromInclusive, int toExclusive);
int removeByPredicate(Predicate<Integer> predicate);

}

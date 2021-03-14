package kg.megacom;

import kg.megacom.classes.Apple;
import kg.megacom.enums.Categories;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<Apple> appleHashSet = new HashSet<>();
        appleHashSet.add(new Apple("Mac",Categories.RATHER_RIPE));
        appleHashSet.add(new Apple("Folding", Categories.RATHER_RIPE));
        appleHashSet.add(new Apple("Autumn striped", Categories.AUTUMN));
        appleHashSet.add(new Apple("Knight", Categories.SUMMER));
        appleHashSet.add(new Apple("Melba", Categories.SEROTINOUS));
        appleHashSet.add(new Apple("North synap", Categories.WINTER));
        appleHashSet.add(new Apple("Idared", Categories.WINTER));
        System.out.println("___________________________Examples of using HashSet");
        appleHashSet.forEach(System.out::println);
        LinkedHashSet<Apple> appleLinked = new LinkedHashSet<>();
        appleLinked.add(new Apple("Mac",Categories.RATHER_RIPE));
        appleLinked.add(new Apple("Folding", Categories.RATHER_RIPE));
        appleLinked.add(new Apple("Autumn striped", Categories.AUTUMN));
        appleLinked.add(new Apple("Knight", Categories.SUMMER));
        appleLinked.add(new Apple("Melba", Categories.SEROTINOUS));
        appleLinked.add(new Apple("North synap", Categories.WINTER));
        appleLinked.add(new Apple("Idared", Categories.WINTER));
        System.out.println("\n_____________________Examples of using LinkedHashSet");
        appleLinked.forEach(System.out::println);
        System.out.println("\n____Added HashSet and LinkedHashSet using addAll() method");
        System.out.println(appleLinked.addAll(appleHashSet));
        appleLinked.forEach(System.out::println);
        Set<String> apples = new HashSet<>();
        apples.addAll(Arrays.asList(new String[]{"Mac", "Folding", "Autumn striped", "Knight", "Melba", "North synap", "Idared"}));
        Set<String> applesTwo = new HashSet<>();
        applesTwo.addAll(Arrays.asList(new String[]{"Folding", "Delight", "Knight", "Melba", "Florina", "Korobovka"}));
        Set<String> union = new HashSet<>(apples);
        union.addAll(applesTwo);
        System.out.println("\n___________________________________________________________________________Union of the two Set\n" + union);
        Set<String> intersection = new HashSet<>(apples);
        intersection.retainAll(applesTwo);
        System.out.println("\n_______________Intersection of the two Set\n" + intersection);
        Set<String> difference = new HashSet<>(apples);
        difference.removeAll(applesTwo);
        System.out.println("\n________________Difference of the two Set\n" + difference);
        Set<String> contain = new HashSet<>(apples);
        contain.containsAll(applesTwo);
        System.out.println("\n____________________________________________Content of the two Set\n" + contain);
    }
}

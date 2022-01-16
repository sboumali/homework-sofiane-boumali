package homework4.array;
import java.util.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionIntersection {



    public static void main(String[] args) {
        Integer [] array1 = {1,3,2,4,8,9,0};
        Integer [] array2 = {1,3,7,5,4,0,7,5};


        Set<Integer> set1 = new HashSet<>(Arrays.asList(array1));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(array2));

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2); // union
        System.out.println("the union is " + union);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2); //intersection
        System.out.println("the intersection is "+ intersection);

        Set<Integer> symmetricDifference = new HashSet <>(union);
        symmetricDifference.removeAll(intersection); // SymmetricDifference
        System.out.print("the symmetric difference is "+ symmetricDifference);
    }
}




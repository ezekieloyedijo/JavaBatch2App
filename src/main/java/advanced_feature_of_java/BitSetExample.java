package advanced_feature_of_java;

import java.util.BitSet;

public class BitSetExample {
    public static void main(String[] args) {
        BitSet set1 = new BitSet(8);
        BitSet set2 = new BitSet(8);

        // set some bits
        set1.set(0); set1.set(2); set1.set(4);
        set2.set(1); set2.set(2); set2.set(5);

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);

        // AND
        BitSet andResult = (BitSet) set1.clone();
        andResult.and(set2);
        System.out.println("AND: " + andResult);

        // OR
        BitSet orResult = (BitSet) set1.clone();
        orResult.or(set2);
        System.out.println("OR: " + orResult);

        // XOR
        BitSet xorResult = (BitSet) set1.clone();
        xorResult.xor(set2);
        System.out.println("XOR: " + xorResult);

    }

}

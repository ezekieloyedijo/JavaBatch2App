BitSet
It's' like an array of BitSet Each bit can be set (1) or unset(0)
Internally, it's' memory efficient because it only uses one bit per value.
You can perform bitwise operations like AND, OR, XOR, directly between
two BitSet objects

BitSet set1 = new BitSet(8);
create two bitSet objects, each with a capacity of 8 bits (index 0 -7)
By default, all bits are false (0).

In set1, we turn ON the bits at positions 0, 2, and 4.

so set1 looks like this internally:
Index: 0 1 2 3 4 5 6 7
Value: 1 0 1 0 1 0 0 0





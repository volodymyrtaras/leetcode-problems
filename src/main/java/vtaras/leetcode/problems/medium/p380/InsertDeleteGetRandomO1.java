package vtaras.leetcode.problems.medium.p380;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/*
 * Implement the RandomizedSet class:
 *
 * RandomizedSet() Initializes the RandomizedSet object.
 *
 * bool insert(int val) inserts an item val into the set if not present.
 * Returns true if the item was not present, false otherwise.
 *
 * bool remove(int val) removes an item val from the set if present.
 * Returns true if the item was present, false otherwise.
 *
 * int getRandom() returns a random element from the current set of elements (it's guaranteed that at least one element exists when this method is called).
 * Each element must have the same probability of being returned.
 * You must implement the functions of the class such that each function works in average O(1) time complexity.
 *
 * Example 1:
 *
 * Input
 * ["RandomizedSet", "insert", "remove", "insert", "getRandom", "remove", "insert", "getRandom"]
 * [[], [1], [2], [2], [], [1], [2], []]
 *
 * Output
 * [null, true, false, true, 2, true, false, 2]
 *
 * Explanation
 *
 * RandomizedSet randomizedSet = new RandomizedSet();
 * randomizedSet.insert(1); // Inserts 1 to the set. Returns true as 1 was inserted successfully.
 * randomizedSet.remove(2); // Returns false as 2 does not exist in the set.
 * randomizedSet.insert(2); // Inserts 2 to the set, returns true. Set now contains [1,2].
 * randomizedSet.getRandom(); // getRandom() should return either 1 or 2 randomly.
 * randomizedSet.remove(1); // Removes 1 from the set, returns true. Set now contains [2].
 * randomizedSet.insert(2); // 2 was already in the set, so return false.
 * randomizedSet.getRandom(); // Since 2 is the only number in the set, getRandom() will always return 2.
 *
 * Constraints:
 *
 * -231 <= val <= 231 - 1
 * At most 2 * 105 calls will be made to insert, remove, and getRandom.
 * There will be at least one element in the data structure when getRandom is called.
 */
public class InsertDeleteGetRandomO1 {

    private InsertDeleteGetRandomO1() {

    }

    /*
        - for 'getRandom' we need a O(1) read complexity for index
        - for 'insert' and 'remove' we need 0(1) complexity for value
        - we will have list and map for that, map will keep value-index (index in the list)
        - for the 'remove' method, we need to get the index of value from the map, set last element in list to that index, update index of it in map
        - then we should remove last element in the list and remove entry with value as key from the map
     */
    public static class RandomizedSet {

        private final List<Integer> list;
        private final Map<Integer, Integer> map;
        private final Random random;

        public RandomizedSet() {
            list = new ArrayList<>();
            map = new HashMap<>();
            random = new Random();
        }

        public boolean insert(int val) {
            boolean inserted;

            if (map.containsKey(val)) {
                inserted = false;
            } else {
                map.put(val, list.size());
                list.add(val);

                inserted = true;
            }

            return inserted;
        }

        public boolean remove(int val) {
            boolean removed;

            if (!map.containsKey(val)) {
                removed = false;
            } else {
                int index = map.get(val);
                int lastElement = list.get(list.size() - 1);

                list.set(index, lastElement);
                map.put(lastElement, index);
                list.remove(list.size() - 1);
                map.remove(val);

                removed = true;
            }

            return removed;
        }

        public int getRandom() {
            int randomIndex = random.nextInt(list.size());

            return list.get(randomIndex);
        }
    }
}

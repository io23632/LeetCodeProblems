package hamza.leet.TwoSum;

import java.util.HashMap;
import java.util.Map;

public class HashMapSolution {
    public int[] twoSum(int[] nums, int target) {
        // specify the data types of the hash map, i.e target - nums[i] (integer) and nums[i] (also an integer)
        // has to be wrapper Integer not int
        // specify name of hash map
        // Syntax: Map<Datatype, DataType> name = new HashMap<>();
        Map<Integer, Integer> complement = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer key = complement.get(nums[i]);
            if (key != null) {
                return new int[] {i, key};
            }
            else {
                complement.put(target - nums[i], i);
            }
        }
        return null;
    }
}

//HashMap:
/*
 * A hash map is a collection of key value pairs, when you add a thing to the map you add a search and key and also add some value
 * that it adds to
 * Key -> Value
 * We are going to itterate through the array and each time we will add a key. In this case the key would be: for each number in the array, we will add the
 * number that need to add to make it to the target value.
 * e.g. : Imagine this is our array of inputs: [5, 4, 1] and the target is 9.
 *
 * Then the hash map would be:
 *
 *  So each time we itteate thorught the nums array we check if that key exists in the key array, e.g. say for example:
 * Key (Complement) - > Value (Index of the number in the nums array)
 * i = 0
 * 4 (9 - 5) -> 0 (Index 0 )
 * i = 1
 * Now we are looking at the numeber 4 in the nums array, and we check if 4 already exists in the key array, if it does we return the index of the current nums
 * array, i.e nums[i] (when i is 1) = 4 and the index of that the key corrosponds to in the key array i.e. 0. Becuase nums[i=1] + key[0] = 5 + 4 = 9
 *
 * */
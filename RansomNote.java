import java.util.HashMap;

public class RansomNote {

        // Approach 1: Using two hashmaps
        // private HashMap makeHashMap(String s) {
        //     HashMap<Character, Integer> hashMap = new HashMap<>();
        //     for (int i = 0; i < s.length(); i++) {
        //         if (hashMap.containsKey(s.charAt(i))) {
        //             hashMap.put(s.charAt(i), hashMap.get(s.charAt(i)) + 1);
        //         } else {
        //             hashMap.put(s.charAt(i), 1);
        //         }
        //     }
        //     return hashMap;
        // }

        // public boolean canConstruct(String ransomNote, String magazine) {
        //     boolean result = true;
        //     HashMap<Character, Integer> ransomMap = makeHashMap(ransomNote);
        //     HashMap<Character, Integer> magazineMap = makeHashMap(magazine);

        //     for (Map.Entry<Character, Integer> entry : ransomMap.entrySet()) {
        //         if (magazineMap.containsKey(entry.getKey())) {
        //             if (magazineMap.get(entry.getKey()) < entry.getValue()) {
        //                 result = false;
        //             }
        //         } else {
        //             result = false;
        //         }
        //     }
        //     return result;
        // }

        // Approach 2: Using a single hashmap
        public boolean canConstruct(String ransomNote, String magazine) {
            boolean result = true;
            HashMap<Character, Integer> magazineMap = new HashMap<>();
            char[] ransomCharArr = ransomNote.toCharArray();
            char[] magazineCharArr = magazine.toCharArray();

            for (char c : magazineCharArr) {
                magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
            }

            for (char c : ransomCharArr) {
                if (!magazineMap.containsKey(c) || magazineMap.get(c) <= 0) {
                    result = false;
                    break;
                } else {
                    magazineMap.put(c, magazineMap.get(c) - 1);
                }
            }
            return result;
        }
    }

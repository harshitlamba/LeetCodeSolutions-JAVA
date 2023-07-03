import java.util.*;

public class InsertDeleteGetRandom {
        Set<Integer> hashSet;
        Random random;

        public InsertDeleteGetRandom() {
            hashSet = new HashSet<>();
            random = new Random();
        }

        public boolean insert(int val) {
            boolean returnBool = false;
            if (!hashSet.contains(val)) {
                hashSet.add(val);
                returnBool = true;
            }
            return returnBool;
        }

        public boolean remove(int val) {
            boolean returnBool = false;
            if (hashSet.contains(val)) {
                hashSet.remove(val);
                returnBool = true;
            }
            return returnBool;
        }

        public int getRandom() {
            List<Integer> list = new ArrayList<>(hashSet);
            return list.get(random.nextInt(list.size()));
        }

    public static void main(String[] args) {
        InsertDeleteGetRandom obj = new InsertDeleteGetRandom();
        boolean param_1 = obj.insert(1);
        System.out.println(param_1);
        boolean param_2 = obj.remove(2);
        System.out.println(param_2);
        boolean param_3 = obj.insert(2);
        System.out.println(param_3);
        int param_4 = obj.getRandom();
        System.out.println(param_4);
        boolean param_5 = obj.remove(1);
        System.out.println(param_5);
        boolean param_6 = obj.insert(2);
        System.out.println(param_6);
        int param_7 = obj.getRandom();
        System.out.println(param_7);
    }
}


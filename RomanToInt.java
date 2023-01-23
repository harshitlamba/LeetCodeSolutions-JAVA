import java.util.HashMap;

public class RomanToInt {
//    public static void populateHash(HashMap<Character,Integer> hash) {
//        hash.put('I',1);
//        hash.put('V',5);
//        hash.put('X',10);
//        hash.put('L',50);
//        hash.put('C',100);
//        hash.put('D',500);
//        hash.put('M',1000);
//    }

    private static int value(Character c) {
        int val = 0;
        switch(c) {
            case 'I': val = 1; break;
            case 'V': val = 5; break;
            case 'X': val = 10; break;
            case 'L': val = 50; break;
            case 'C': val = 100; break;
            case 'D': val = 500; break;
            case 'M': val = 1000; break;
        }
        return val;
    }

//    public static int romanToInt(String s) {
//        if(s.length()==0) {
//            return 0;
//        }
//        HashMap<Character,Integer> hash = new HashMap<>();
//        populateHash(hash);
//        int sum = 0;
//        int i = s.length()-1;
//        int curr, prev;
//        for(; i > 0; i--) {
//            curr = hash.get(s.charAt(i));
//            prev = hash.get(s.charAt(i-1));
//            if (curr > prev) {
//                sum += curr - prev;
//                i--;
//            } else {
//                sum += curr;
//            }
//        }
//        if (i==0) {
//            sum += hash.get(s.charAt(i));
//        }
//        return sum;
//    }

    public static int romanToInt(String s) {
        if(s.length()==0) {
            return 0;
        }
        int sum = 0;
        int i = s.length()-1;
        int curr, prev;
        for(; i > 0; i--) {
            curr = value(s.charAt(i));
            prev = value(s.charAt(i-1));
            if (curr > prev) {
                sum += curr - prev;
                i--;
            } else {
                sum += curr;
            }
        }
        if (i==0) {
            sum += value(s.charAt(i));
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}

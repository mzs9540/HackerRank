import java.util.*;

public class Solutions {
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> s = new ArrayList<>();
        for(int i = 0;i<n;i++){
            s.add(sc.nextInt());
        }
        TreeMap<Integer,Integer> a = new TreeMap<>();
        for(int i=0;i<n;i++) {
            a.put(s.get(i), sc.nextInt());
        }
        int k = sc.nextInt();
        int m[] = new int[k];
        for(int i=0;i<k;i++){
            m[i] = sc.nextInt();
        }
        for(int i=0;i<k;i++){
            System.out.println(a.get(a.floorKey(m[i])));
        }
    }
}

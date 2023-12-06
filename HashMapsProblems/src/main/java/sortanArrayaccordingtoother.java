import java.util.*;

public class sortanArrayaccordingtoother{

    public static void main(String[] args) {
        int[] a = new int[]{15,47,59,326,124,5,623,128,483,153,125,232,154,555,656,485,659,32,125,326,324,96,565,154,112,32,85,563,32,481,32};
        int[] b = new int[]{20,47,20,5,125,154,555,32,324};
        String string = "aabacbebebe";
        System.out.println(resultMain(a, 31, b, 9));

    }


    private static int[] result2(int A1[], int N, int A2[], int M) {  //---> O(n^m)
        HashMap<Integer,ArrayList<Integer>> ansMap= new HashMap<>();
        HashMap<Integer,Integer>  valueMapA2= new HashMap<>();
        ArrayList<Integer> ansList= new ArrayList<>();
        ArrayList<Integer> ansListN= new ArrayList<>();

        for(int i=0;i<M;i++) {
            if(valueMapA2.containsKey(A2[i]))
                valueMapA2.put(A2[i],valueMapA2.get(A2[i]));
            else valueMapA2.put(A2[i],i);
        }
        for(int i=0;i<N;i++) {
            if(valueMapA2.containsKey(A1[i]))
                ansList.add(A1[i]);
            else ansListN.add(A1[i]);
        }
        ansList.forEach(entry ->{
            ArrayList<Integer> temp=new ArrayList<>();
            valueMapA2.get(entry);
            temp.add(entry);
            if(ansMap.containsKey(entry)) {
                temp.add(ansMap.get(entry).get(1)+1);
            }
            else {
                temp.add(1);
            }
            ansMap.put( valueMapA2.get(entry),temp);

        });



        return A1;

    }

    private static int[] resultMain(int A1[], int N, int A2[], int M) {

        List<Integer> A1Main=new ArrayList<>();
        List<Integer> result=new ArrayList<>();
        List<Integer> A2Extension=new ArrayList<>();
        HashMap<Integer,Integer> a2Map= new HashMap<>();
        HashMap<Integer,Integer> ValueCount= new HashMap<>();
        for(int i=0 ;i<M ;i++){
            a2Map.put(i,A2[i]);
        }
        for(int i=0 ;i<N ;i++){
            if(a2Map.containsValue(A1[i])){
                A1Main.add(A1[i]);
            }
            else A2Extension.add(A1[i]);
        }
        A1Main.forEach(entry ->
        {
            if(ValueCount.containsKey(entry))
                ValueCount.put(entry,ValueCount.get(entry)+1);
            else
                ValueCount.put(entry,1);
        });
        for(int i=0;i<a2Map.size();i++){

           if(ValueCount.containsKey(a2Map.get(i)))
            for( int j=0 ;j<ValueCount.get(a2Map.get(i)) ;j++){
                result.add(a2Map.get(i));
            }

        }
        Collections.sort(A2Extension);
        result.addAll(A2Extension);
        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private static int[] resultMain2(int A1[], int N, int A2[], int M) {


        List<Integer> A1Main=new ArrayList<>();
        List<Integer> result=new ArrayList<>();
        List<Integer> A2Extension=new ArrayList<>();
        HashMap<Integer,Integer> a2Map= new HashMap<>();
        HashMap<Integer,Integer> ValueCount= new HashMap<>();
        for(int i=0 ;i<M ;i++){
            a2Map.put(i,A2[i]);
        }
        for(int i=0 ;i<N ;i++){
            if(a2Map.containsValue(A1[i])){
                A1Main.add(A1[i]);
            }
            else A2Extension.add(A1[i]);
        }
        A1Main.forEach(entry ->
        {
            if(ValueCount.containsKey(entry))
                ValueCount.put(entry,ValueCount.get(entry)+1);
            else
                ValueCount.put(entry,1);
        });
        for(int i=0;i<M;i++){
            if(ValueCount.containsKey(A2[i]))
                for( int j=0 ;j<ValueCount.get(A2[i]);j++){
                    result.add(A2[i]);
                }

        }
        Collections.sort(A2Extension);
        result.addAll(A2Extension);
        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }





























    }


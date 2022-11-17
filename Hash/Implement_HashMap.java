import java.util.*;

public class Implement_HashMap {
    static class HashMap<K,V>{    //generics
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n;   // "n" is no of nodes
        private int N;  // "N" is size of bucket
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i<4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction( K key ){
            int bi = key.hashCode();
            return Math.abs(bi) % N;  //Math.abs() is to make it positive number
            
        }

        private int searchInLL(K key , int bi ){
            LinkedList<Node> ll = buckets[bi];

            for(int i = 0; i<ll.size() ; i++){
                if(ll.get(i).key == key){
                    return i;   // i is di
                }
            }
            return -1;
        }
        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N*2];
            for(int i = 0; i< N*2 ; i++){
                buckets[i] = new LinkedList<>();
            }

            for (int i =0 ; i < oldBucket.length; i++){
                LinkedList<Node> ll  = oldBucket[i];
                for(int j = 0; j<ll.size(); j++){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }


        public void put(K key , V  value ){
            int bi = hashFunction(key);   // bucket index
            int di = searchInLL(key, bi);   //data index

            if(di == -1){   // key doesn't exist
                buckets[bi].add(new Node (key , value));
                n++;
            }else{
                Node data = buckets[bi].get(di);
                data.value = value;
            }

            double lambda = (double)n/N;
            if(lambda > 2.0){
                //rehashing
                rehash();
            }
        }

        public boolean containKey (K key){
            int bi = hashFunction(key);   // bucket index
            int di = searchInLL(key, bi);   //data index

            if(di == -1){   // key doesn't exist
               return false ; 
            }else{
                return true;
            }

        }

        public V remove (K key){
            int bi = hashFunction(key);   // bucket index
            int di = searchInLL(key, bi);   //data index

            if(di == -1){   // key doesn't exist
                return null;
            }else{
                Node data = buckets[bi].remove(di);
                n--;
                return data.value;
            }
        }
        
        public V get(K key){
            int bi = hashFunction(key);   // bucket index
            int di = searchInLL(key, bi);   //data index

            if(di == -1){   // key doesn't exist
                return null; 
            }else{
                Node data = buckets[bi].get(di);
                return data.value;
            }
              
        }
        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for(int i=0 ; i< buckets.length; i++){
                LinkedList<Node> ll = buckets[i];
                for(int j = 0; j<ll.size(); j++){
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n == 0 ;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 130);
        map.put("US",30);  
        map.put("Chaina",200); 

        ArrayList<String> keys = map.keySet();
        for(int i = 0; i<keys.size();i++){
            System.out.println(keys.get(i)+" : " + map.get(keys.get(i)));
        }
    }
}

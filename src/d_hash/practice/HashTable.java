package d_hash.practice;

import java.util.Arrays;
import java.util.LinkedList;

@SuppressWarnings("unchecked")
public class HashTable<K, V>{
    private int maxSize;
    private LinkedList<HashNode<K, V>>[] buckets;
//    private int size;
    public HashTable(int maxSize) {
        if (maxSize <= 0) {
            throw new RuntimeException("잘못된 크기 지정입니다.");
        }
        this.maxSize = maxSize;
        this.buckets = new LinkedList[this.maxSize];

        for(int i = 0; i < this.buckets.length; i++) {
            this.buckets[i] = new LinkedList<>();
        }
//        this.size = 0;
    }
    public void put(K key, V value) {
        int index = this.hash(key);
        for (HashNode<K, V> node : buckets[index]) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
        }
        buckets[index].add(new HashNode<>(key, value));
//        size ++;
    }

    public V get(K key) {
        int index = this.hash(key);
        for (HashNode<K, V> node : buckets[index]) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }
        return null;
    }

    public V remove(K key) {
        V value = null;
        int index = this.hash(key);
        for (HashNode<K, V> node : buckets[index]){
            if (node.key.equals(key)) {
                value = node.value;
                buckets[index].remove(node);
//                size --;
                break;
            }
        }
        return value;
    }

    public boolean contains(K key) {
        int index = this.hash(key);
        for (HashNode<K, V> node : buckets[index]) {
            if (node.key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    public int size() {
//        return this.size;
        int sum = 0;
        for (int i = 0; i < this.buckets.length; i++) {
            sum += this.buckets[i].size();
        }
        return sum;
    }

    public boolean isEmpty() {
//        return (this.size == 0);
        return (this.size() == 0);
    }

    private int hash(K key) {
//        System.out.println(key);
//        System.out.println(key.hashCode());
//        System.out.println(key.hashCode() % this.maxSize);
//        System.out.println(Math.abs(key.hashCode() % this.maxSize));
        return Math.abs(key.hashCode() % this.maxSize);
    }
    private static class HashNode<K, V>{
        private K key;
        private V value;
        private HashNode(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < this.buckets.length; i++) {
            LinkedList<HashNode<K, V>> bucket = this.buckets[i];
            sb.append(i).append(":").append(bucket).append(",").append("\n"); //chaining 가능
        }

        sb.replace(sb.lastIndexOf(","), sb.length(), "");
        return sb.toString();
    }

}

package d_hash;

import d_hash.practice.HashTable;

public class HashApplication {
    public static void main(String[] args) {
        HashTable<String, String> hashTable = new HashTable<>(5);

        hashTable.put("strawberry", "딸기");
        hashTable.put("apple", "사과");
        hashTable.put("grape", "포도");
        hashTable.put("banana", "바나나");
        hashTable.put("banana", "몽키바나나");

        System.out.println(hashTable);
        System.out.println();
        System.out.println(hashTable.get("banana"));
        System.out.println(hashTable.get("melon"));
        System.out.println(hashTable.remove("banana"));
        System.out.println(hashTable.remove("melon"));
        System.out.println(hashTable);
        System.out.println();
        System.out.println(hashTable.contains("grape"));
        System.out.println(hashTable.contains("banana"));
        System.out.println(hashTable.size());
        System.out.println(hashTable.isEmpty());
        System.out.println();
    }
}

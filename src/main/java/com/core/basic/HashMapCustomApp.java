package com.core.basic;

class HashMapCustom<K, V> {

	private Entry<K, V>[] table; // Array of Entry.
	private int capacity = 4; // Initial capacity of HashMap

	static class Entry<K, V> {
		K key;
		V value;
		Entry<K, V> next;

		public Entry(K key, V value, Entry<K, V> next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}

	@SuppressWarnings("unchecked")
	public HashMapCustom() {
		table = new Entry[capacity];
	}

	public void put(K newKey, V data) {
		if (newKey == null)
			return;
		int hash = hash(newKey);

		Entry<K, V> newEntry = new Entry<K, V>(newKey, data, null);
		if (table[hash] == null) {
			table[hash] = newEntry;
		} else {
			Entry<K, V> previous = null;
			Entry<K, V> current = table[hash];

			while (current != null) {
				if (current.key.equals(newKey)) {
					if (previous == null) {
						newEntry.next = current.next;
						table[hash] = newEntry;
						return;
					} else {
						newEntry.next = current.next;
						previous.next = newEntry;
						return;
					}
				}
				previous = current;
				current = current.next;
			}
			previous.next = newEntry;
		}
	}

	public V get(K key) {
		int hash = hash(key);
		if (table[hash] == null) {
			return null;
		} else {
			Entry<K, V> temp = table[hash];
			while (temp != null) {
				if (temp.key.equals(key))
					return temp.value;
				temp = temp.next;
			}  
			return null;
		}
	}

	private int hash(K key) {
		int bucketIndex = key.hashCode() % table.length;
        return bucketIndex;
	}
}

public class HashMapCustomApp {

	public static void main(String[] args) {
		HashMapCustom<Integer, Integer> hashMapCustom = new HashMapCustom<Integer, Integer>();
		hashMapCustom.put(21, 12);
		hashMapCustom.put(21, 121);
		hashMapCustom.put(30, 151);
		hashMapCustom.put(33, 15);
		hashMapCustom.put(33, 89);
		System.out.println("value corresponding to key 21=" + hashMapCustom.get(33));
		System.out.println("value corresponding to key 51=" + hashMapCustom.get(51));
	}
}

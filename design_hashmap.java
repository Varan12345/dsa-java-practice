class MyHashMap {
    private int size;
    private LinkedList<Entry>[] map;

    public MyHashMap() {
        size = 1000;
        map = new LinkedList[size];
    }

    public void put(int key, int value) {
        int index = key % size;
        if (map[index] == null) {
            map[index] = new LinkedList<>();
        }
        for (Entry entry : map[index]) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }
        map[index].add(new Entry(key, value));
    }

    public int get(int key) {
        int index = key % size;
        if (map[index] != null) {
            for (Entry entry : map[index]) {
                if (entry.key == key) {
                    return entry.value;
                }
            }
        }
        return -1;
    }

    public void remove(int key) {
        int index = key % size;
        if (map[index] != null) {
            Iterator<Entry> iterator = map[index].iterator();
            while (iterator.hasNext()) {
                Entry entry = iterator.next();
                if (entry.key == key) {
                    iterator.remove();
                    return;
                }
            }
        }
    }

    private static class Entry {
        int key;
        int value;

        Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
   
    
}

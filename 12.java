class RandomizedSet {
    
    //Set<Integer> set = new HashSet<>();
    Map<Integer, Integer> hmap;
    List<Integer> list;
    Random rand;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        hmap = new HashMap<>();
        list = new ArrayList<>();
        rand = new Random();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        // if(!set.add(val))
        //     return false;
        // return true; // return set.add(val);
        if(!hmap.containsKey(val)){
            hmap.put(val, list.size());
            list.add(val);
            return true;
        }
        return false;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        // if(!set.remove(val))
        //     return false;
        // return true; // return set.remove(val);
        if(hmap.containsKey(val)){
            int valIndex = hmap.remove(val);
            int lastIndex = list.get(list.size() - 1);
            if(lastIndex != val){
                list.set(valIndex, lastIndex);
                hmap.put(lastIndex, valIndex);
            }
            list.remove(list.size() - 1);
            return true;
        }
        return false;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        
        return list.get(rand.nextInt(list.size()));
        // int index = new Random().nextInt(set.size());
        // Iterator<Integer> iter = set.iterator();
        // for (int i = 0; i < index; i++) {
        //     iter.next();
        // }
        // return iter.next();
        
        // can also do by converting set to array which still takes O(n)
        // Integer[] arr = new Integer[set.size()];
        // set.toArray(arr);
        // Random rand = new Random();
        // return arr[rand.nextInt(set.size())];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
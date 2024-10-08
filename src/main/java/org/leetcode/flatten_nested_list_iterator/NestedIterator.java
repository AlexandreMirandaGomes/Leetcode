package org.leetcode.flatten_nested_list_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NestedIterator implements Iterator<Integer> {

    List<NestedInteger> nestedList;
    List<Integer> flattenedList;
    int currentIndex = 0;

    public NestedIterator(List<NestedInteger> nestedList) {
        this.nestedList = nestedList;
        this.flattenedList = new ArrayList<>();
        // Flatten the nestedList during initialization
        this.flatten(nestedList);
    }

    // Returns the next integer in the flattened list
    @Override
    public Integer next() {
        int number = this.flattenedList.get(currentIndex);
        currentIndex++;
        return number;
    }

    // Checks if there are more integers in the flattened list
    @Override
    public boolean hasNext() {
        return currentIndex < flattenedList.size();
    }

    // Recursively flattens the nested list and adds integers to the flattenedList
    private void flatten(List<NestedInteger> currentList) {
        for (int i = 0; i < currentList.size(); i++) {
            if (currentList.get(i).isInteger()) {
                flattenedList.add(currentList.get(i).getInteger());
            } else {
                // Recursively flatten nested lists
                flatten(currentList.get(i).getList());
            }
        }
    }
}


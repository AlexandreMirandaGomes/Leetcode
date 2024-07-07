package org.leetcode.flatten_nested_list_iterator;

import java.util.List;

public class NestedInteger {
    private Integer integer; // Representa um inteiro simples
    private List<NestedInteger> list; // Representa uma lista aninhada

    public NestedInteger(Integer value) {
        this.integer = value;
    }

    public NestedInteger(List<NestedInteger> nestedList) {
        this.list = nestedList;
    }

    public boolean isInteger() {
        return integer != null;
    }

    public Integer getInteger() {
        return integer;
    }

    public List<NestedInteger> getList() {
        return list;
    }
}

/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Copyright (c) [2025-2099] Martin (goudingcheng@gmail.com)
 */
package com.github.paohaijiao.scope;
import com.github.paohaijiao.enums.JNodeType;
import com.github.paohaijiao.support.JTypeReference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * packageName com.github.paohaijiao.scope
 *
 * @author Martin
 * @version 1.0.0
 * @since 2025/8/6
 */
public class VariableTree {

    private String name;

    private VariableTree parent;

    private Map<String, Variable> variables;

    private List<VariableTree> children;

    private JNodeType type;

    public VariableTree(String name, JNodeType type) {
        this(name, type, null);
    }

    public VariableTree(String name, JNodeType type, VariableTree parent) {
        this.name = name;
        this.type = type;
        this.parent = parent;
        this.variables = new HashMap<>();
        this.children = new ArrayList<>();
    }

    public void addChild(VariableTree child) {
        children.add(child);
    }

    public VariableTree createChild(String name, JNodeType type) {
        VariableTree child = new VariableTree(name, type, this);
        children.add(child);
        return child;
    }

    public VariableTree getParent() {
        return parent;
    }

    public void addVariable(String name, Object value, JTypeReference<?> type) {
        variables.put(name, new Variable(name, value, type));
    }

    public Variable getVariable(String name) {
        if (variables.containsKey(name)) {
            return variables.get(name);
        }
        if (parent != null) {
            return parent.getVariable(name);
        }

        return null;
    }

    public boolean containsVariable(String name) {
        if (variables.containsKey(name)) {
            return true;
        }
        return parent != null && parent.containsVariable(name);
    }

    public String getName() {
        return name;
    }

    public JNodeType getType() {
        return type;
    }

    public List<VariableTree> getChildren() {
        return children;
    }

    public Map<String, Variable> getVariables() {
        return variables;
    }


    // Helper method to print the tree structure
    public void printTree() {
        printTree(this, 0);
    }

    private void printTree(VariableTree node, int level) {
        StringBuilder indent = new StringBuilder();
        for (int i = 0; i < level; i++) {
            indent.append("  ");
        }

        System.out.println(indent + "[" + node.type + "] " + node.name);
        for (Variable var : node.variables.values()) {
            System.out.println(indent + "  " + var.getName() + ": " + var.getValue() + " (" + var.getType() + ")");
        }

        for (VariableTree child : node.children) {
            printTree(child, level + 1);
        }
    }
}

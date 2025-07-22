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
package com.github.paohaijiao.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * packageName com.github.paohaijiao.model
 *
 * @author Martin
 * @version 1.0.0
 * @since 2025/7/22
 */
public class JImportContainerModel extends HashMap<String, String> {

    public String addImport(String fullPath) {
        String className = extractClassName(fullPath);
        this.put(fullPath, className);
        return className;
    }

    public String addImportWithAlias(String fullPath, String alias) {
        this.put(fullPath, alias);
        return alias;
    }
    public void addAllImports(Set<String> imports) {
        imports.forEach(this::addImport);
    }
    public boolean hasImport(String fullPath) {
        return this.containsKey(fullPath);
    }
    public String getClassName(String fullPath) {
        return this.get(fullPath);
    }

    private String extractClassName(String fullPath) {
        int lastDot = fullPath.lastIndexOf('.');
        return lastDot >= 0 ? fullPath.substring(lastDot + 1) : fullPath;
    }
    public Set<String> generateImportStatements() {
        return this.keySet();
    }

    public Set<String> findFullPaths(String shortName) {
        return this.entrySet().stream()
                .filter(entry -> entry.getValue().equals(shortName))
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
    }
}

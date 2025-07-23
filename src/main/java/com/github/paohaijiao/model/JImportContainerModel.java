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

import com.github.paohaijiao.enums.JLiteralEnums;

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
public class JImportContainerModel extends HashMap<String, JImportModel> {

    public JImportModel addImport(String identify,String fullPath) {
        String className = extractClassName(fullPath);
        JImportModel model = new JImportModel();
        model.setFullPath(fullPath);
        model.setClassName(className);
        try {
            Class<?> clazz = Class.forName(fullPath);
            model.setClazz(clazz);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        this.put(identify, model);
        return model;
    }
    public boolean existsIdentify(String identify) {
        return this.containsKey(identify);
    }
    public boolean validateType(String type) {
        JLiteralEnums literalEnums=JLiteralEnums.codeOf(type);
        if(null!=literalEnums){
            return true;
        }else{
            return this.containsKey(type);
        }
    }

    public JImportModel getClassName(String identify) {
        return this.get(identify);
    }

    private String extractClassName(String fullPath) {
        int lastDot = fullPath.lastIndexOf('.');
        return lastDot >= 0 ? fullPath.substring(lastDot + 1) : fullPath;
    }
    public Set<String> getIdentify() {
        return this.keySet();
    }

}

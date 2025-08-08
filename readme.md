# JQuickLang Syntax Reference
## Overview
JQuickLang is a lightweight Java-like scripting language designed for concise and efficient programming. It combines Java's type system with JavaScript's flexibility, making it ideal for rapid prototyping, education, and small projects.

## Core Features
### 1. Simplified Type System
- **7 Primitive types** built-in
- **Full generics** support
- **Flexible collections** (List/Set/Map)
- **dimensional arrays**

```jquick
// Primitive types
int counter = 0;
boolean enabled = true;

// Generic collections
List<String> names = ["Alice", "Bob"];
Map<String, Integer> scores = {"Math":90, "English":85};
```

## Program Structure
```jquick
import com.example.pkg as pkgAlias;
var x = 10;
console.log(x);
```
### Import Declarations
```jquick
import java.util.List as MyList;
```
| Component        | Description                               |
|------------------|-------------------------------------------|
| qualified.name   | dot-separated path (e.g., java.util.List) |
| alias            | Optional local name                       |
### Variable Declarations
```jquick
var name = "Alice";  // Type inference
int age = 25;        // Explicit typing
```
| Keyword   | Example             | Description                     |
|-----------|---------------------|---------------------------------|
| var       | `var x = 10;`       | Type inferred                   |
| TypeName  | `String s = "hi";`  | Explicit type (optional)        |
### Data Types
### Primitive Types (simpleType)
| Type Keyword | Data Type        | Example                |
|--------------|------------------|------------------------|
| short        | Short integer    | `short s = 100;`       |
| int          | Integer          | `int x = 42;`          |
| float        | Floating point   | `float pi = 3.14;`     |
| double       | Double           | `double d = 9.99;`     |
| long         | Long integer     | `long big = 100;`      |
| boolean      | Boolean          | `boolean flag = true;` |
| byte         | Byte             | `byte b = 0x1F;`       |
| Null         | null             | `null`                 |
### Composite Types
| Type Format               | Example                          |
|--------------------------|----------------------------------|
| Generic (Type<T>)         | `List<String> names;`            |
| Generic Multi (Type<K,V>) | `Map<String, Integer> scores;`   |
| List                      | `List<Double> prices;`           |
| Set                       | `Set<Employee> staff;`           |
| Array                     | `int[] numbers = {1,2,3};`       |
| Custom Class              | `MyClass obj = new MyClass();`   |
| Import Alias              | `import java.util.Date as JDate;`|
###  Expressions
| Operator Group | Operators      |
|----------------|----------------|
| Multiplicative  | `*` `/`        |
| Additive        | `+` `-`        |
| Relational      | `>` `>=` `<` `<=` `==` `!=` |
| Logical AND     | `&&`           |
| Logical OR      | `||`          |
| Assignment      | `=`            |
#### sample code
```jquick
(a + b) * 2 > 10 && x != y
```
### Control Structures
#### if statement
```jquick
if (score >= 90) {
    grade = 'A';
} else if (score >= 60) {
    grade = 'B';
} else {
    grade = 'C';
}
```
#### loop statement
```jquick
for (var i = 0; i < 10; i++) {
    console.log(i);
}
```
```jquick
while (x > 0) {
    x=x+1;
}
```
#### method definition
```jquick
function doSomething(int:a, int:b) {
    return a + b;
}
```
### invocation Styles
| Type             | Example                     |
|------------------|-----------------------------|
| Static Method    | `Math::max(1, 2)`           |
| Constructor      | `new ArrayList()`           |
| Instance Method  | `list.add("item")`          |
| This-context     | `this.doSomething()`        |
### output
```jquick
console.log("Result: " + result);
```
### Comments
```jquick
// single-line
```
```jquick
/*
  multi-line
*/
```
### appendix
```string preserve keyword
var, 
import, 
as, 
function, 
return,
if, 
else, 
for, 
while,
break,
continue,
this,
true, 
false, 
null
```
### Identifier Rules
```string
1.starts with letter/underscore
2.may contain letters, digits, underscores
3.case-sensitive
```
### complete example
```jquick
function getSquare(int:a,int:b){
    return a*b;
}
var a=1;
var b=2;
var c=this.getSquare(a,b);
```
# JQuickLang Syntax Reference

## Table of Contents
1. [Program Structure](#program-structure)
2. [Import Declarations](#import-declarations)
3. [Variable Declarations](#variable-declarations)
4. [Data Types](#data-types)
5. [Expressions](#expressions)
6. [Control Structures](#control-structures)
7. [Methods](#methods)
8. [Output](#output)
9. [Comments](#comments)
10. [Appendix](#appendix)

---

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
| Category   | Types & Examples      |
|------------|-----------------------|
| short      | 1s                    |
| int        | 1                     |
| long       | 1l                    |
| float      | 1f                    |
| double     | 1d                    |
| Boolean    | `true`, `false`       |
| Null       | `null`                |
| String     | `"Hello"`             |
| Date       | `2023-12-31`          |
| DateTime   | `2023-12-31 23:59:59` |
###  Expressions
| Operator Group | Operators       |
|----------------|-----------------|
| Multiplicative  | `*` `/`         |
| Additive        | `+` `-`         |
| Relational      | `>` `>=` `<` `<=` `==` `!=` |
| Logical AND     | `&&`            |
| Logical OR      | `\|\|`          |
| Assignment      | `=`             |
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
```string
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
## 🛠️ Project Status

This is a partial implementation of the Lox programming language from the book [Crafting Interpreters](https://craftinginterpreters.com/). The goal was to understand interpreter internals by building one from scratch in Java.

### ✅ Completed:
- Abstract Syntax Tree (AST) generation using `GenerateAst.java`
- Expression hierarchy with visitor pattern
- Tokenizer / Scanner for lexing source code
- Basic parser supporting arithmetic and grouping expressions
- AST printer (for debugging parsed expressions)
- REPL and file-based script runner

### ⏳ In Progress / Pending:
- Interpreter runtime (`Interpreter.java`, `Environment`, expression evaluator)
- Variable declarations and scopes
- Control flow (`if`, `else`, `while`, `for`)
- Function declarations and closures
- Class support and object system (`this`, `super`, inheritance)
- Error recovery and reporting
- Static resolution (`Resolver.java`)

### 📎 Note:
This project is a **work in progress**, built as a learning companion while reading *Crafting Interpreters*. Contributions or forks are welcome for further enhancements.

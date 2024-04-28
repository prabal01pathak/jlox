package com.interpreter.lox;


import java.util.List;

import static com.interpreter.lox.TokenType.*;

public class Parser {
    private final List<Token> tokens;
    private int current = 0;
    Parser(List<Token> tokens) {
        this.tokens = tokens;
    }

    private Expr expression() {
        return equality();
    }

    private Expr equality() {
        Expr expr = comparison();

        while (match(BANG_EQUAL, EQUAL_EQUAL)) {
            Token operator = previous();
            Expr right = comparison();
            expr = new Expr.Binary(
                    expr, operator, right
            );
        }
        return expr;
    }
    private Expr comparison() {
    }
    private boolean match(TokenType... tokenTypes){
        for (TokenType type: tokenTypes) {
            if (check(type)) {
                advance();
                return true;
            }
        }
        return false;
    }


    private boolean check(TokenType type) {
        if (isAtEnd()) return false;
        return peek().type ==  type;
    }
    private Token advance() {
        if (!isAtEnd()) {
            current++;
        }
        return previous();
    }


    private boolean isAtEnd() {
        return peek().type == EOF;
    }


    private Token peek() {
        return tokens.get(current);
    }

    private Token previous() {
        return tokens.get(current - 1);
    }
}

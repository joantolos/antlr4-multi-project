lexer grammar SearchServiceQLLexer;

options {
  language = Java;
}

@lexer::header{
  package com.joantolos.antlr4.multi.project.dsl;
}

fragment LETTER : ('a'..'z' | 'A'..'Z') ;
fragment DIGIT : '0'..'9';
fragment DOUBLE_DIGIT : DIGIT DIGIT;
fragment MONTH : ('JAN' | 'FEB' | 'MAR' | 'APR' | 'MAY' | 'JUN' | 'JUL' | 'AUG' | 'SEP'
                  | 'OCT' | 'NOV' | 'DEC' );
fragment HYPHEN: '-';
fragment YEAR : DIGIT DIGIT DIGIT DIGIT;


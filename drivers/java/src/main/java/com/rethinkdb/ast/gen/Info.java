// Autogenerated by metajava.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/AstSubclass.java
package com.rethinkdb.ast.gen;

import com.rethinkdb.ast.helper.Arguments;
import com.rethinkdb.ast.helper.OptArgs;
import com.rethinkdb.ast.RqlAst;
import com.rethinkdb.proto.TermType;
import java.util.*;



public class Info extends RqlQuery {


    public Info(java.lang.Object arg) {
        this(new Arguments(arg), null);
    }
    public Info(Arguments args, OptArgs optargs) {
        this(null, args, optargs);
    }
    public Info(RqlAst prev, Arguments args, OptArgs optargs) {
        this(prev, TermType.INFO, args, optargs);
    }
    protected Info(RqlAst previous, TermType termType, Arguments args, OptArgs optargs){
        super(previous, termType, args, optargs);
    }


    /* Static factories */
    public static Info fromArgs(Object... args){
        return new Info(new Arguments(args), null);
    }


}

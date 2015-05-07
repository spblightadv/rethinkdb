// Autogenerated by convert_protofile.py on 2015-05-07.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/AstSubclass.java
package com.rethinkdb.ast.gen;

import com.rethinkdb.ast.helper.Arguments;
import com.rethinkdb.ast.helper.OptArgs;
import com.rethinkdb.ast.RqlAst;
import com.rethinkdb.proto.TermType;
import java.util.*;



public class Year extends RqlQuery {


    public Year(java.lang.Object arg) {
        this(new Arguments(arg), null);
    }
    public Year(Arguments args, OptArgs optargs) {
        this(null, args, optargs);
    }
    public Year(RqlAst prev, Arguments args, OptArgs optargs) {
        this(prev, TermType.YEAR, args, optargs);
    }
    protected Year(RqlAst previous, TermType termType, Arguments args, OptArgs optargs){
        super(previous, termType, args, optargs);
    }


   /* Static factories */
    public static Year fromArgs(Object... args){
        return new Year(new Arguments(args), null);
    }


}
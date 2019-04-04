package ir;

import ast.node.dec.ClassDec;
import ast.node.dec.VarDec;
import ast.type.Type;
import ir.structure.Constant;
import ir.structure.Reg;

import java.util.HashMap;
import java.util.Map;

import static ir.Config.INT_SIZE;

public class Utility {
	
	/**
	 * Get global register with hintName neatly.
	 * */
	public static Reg MakeGreg(String name) {
		return new Reg("@" + name);
	}
	
	public static Constant MakeInt(int val) {
		return new Constant(val);
	}
	
	
	public static String unescape(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); ++i) {
			if (s.charAt(i) != '\\') {
				sb.append(s.charAt(i));
			} else {
				++i;
				switch (s.charAt(i)) {
					case 't': sb.append('\t'); break;
					case 'n': sb.append('\n'); break;
					case 'r': sb.append('\r'); break;
					case '\'':sb.append('\''); break;
					case '"': sb.append('"');  break;
					case '\\':sb.append('\\'); break;
					default: sb.append(s.charAt(i));
				}
			}
		}
		return sb.toString();
	}
}

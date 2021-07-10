package teme;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class StringImm {
public static void main(String[] args) {
	String st=new String();
	st="gobi";
	System.out.println(st);
	System.out.println(System.identityHashCode(st));
	st=st+"nath";
	System.out.println(st);
	System.out.println(System.identityHashCode(st));
	st=st+" manoharan";
	System.out.println(st);
	System.out.println(System.identityHashCode(st));
	
	StringBuilder st1=new StringBuilder("Gobi");
	System.out.println(st1);
	System.out.println(System.identityHashCode(st1));
	st1.append("nath");
	System.out.println(st1);
	System.out.println(System.identityHashCode(st1));
	
	StringBuffer st2=new StringBuffer("abi");
	System.out.println(st2);
	System.out.println(System.identityHashCode(st2));
	st2.append("nath");
	System.out.println(st2);
	System.out.println(System.identityHashCode(st2));
	
	String s1="java";
	System.out.println(s1);
	System.out.println(System.identityHashCode(s1));
	
	String s2="java";
	System.out.println(s2);
	System.out.println(System.identityHashCode(s2));
	
	String s11=new String("program");
	System.out.println(s11);
	System.out.println(System.identityHashCode(s11));
	
	String s12=new String("program");
	System.out.println(s12);
	System.out.println(System.identityHashCode(s12));
	
	Map<Integer,String> mp=new LinkedHashMap<>();
	mp.put(1, "gn");
	Collection<String> values = mp.values();
	
	String array[]= {"java","programming","language"};
	
	List<String>li=new ArrayList<>();
	 for (String string : array) {
		 li.add(string);
		 
	List<String> asList = Arrays.asList(array);
		
	}
	 System.out.println(li);
	 
	 String array1[]=new String[5];
	 for (int i = li.size()-1; i>=0; i--) {
		 array1[i]=li.get(i);
		 System.out.println(array1[i]);
	}
	 
//	for (int i = 0; i < array1.length; i++) {
//		System.out.println(array1[i]);
//		System.out.println("hi");
//		
//	}
	
	
	
	
	
	
	
	
	
	
}
}

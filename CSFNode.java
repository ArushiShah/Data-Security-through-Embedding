/* 
 * This code may be freely distributed
 * and used for any non-commericial purpose, as long as its copyright 
 * notice is retained.  The author assumes absolutely no responsibility 
 * for any harm caused by bugs in the code.
 **/ 

/* 
 * CSFNode.java - coded By st0le [st0le'n'stuff softwarez!] 
 * Website : http://st0lenc0des.googlepages.com 
 * Copyright (c) st0le 2007 
 */ 

package src.CShannonFanoCompressor;

public class CSFNode{
	public char ch;
	public long freq;
	public String sfCode;
	
	CSFNode(){
		ch = 0;
		freq = 0;
		sfCode = "";
		}
	CSFNode(char c,long f,String code){
		ch = c;
		freq = f;
		sfCode = code;
		}

}


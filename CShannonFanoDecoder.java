/* 
 * This code may be freely distributed
 * and used for any non-commericial purpose, as long as its copyright 
 * notice is retained.  The author assumes absolutely no responsibility 
 * for any harm caused by bugs in the code.
 **/ 

/* 
 * CShannonFanoDecoder.java - coded By st0le [st0le'n'stuff softwarez!] 
 * Website : http://st0lenc0des.googlepages.com 
 * Copyright (c) st0le 2007 
 */ 

package src.CShannonFanoCompressor;

import java.io.*;
import src.FileBitIO.CFileBitReader;

public class CShannonFanoDecoder implements sfInterface {
	
	private String fileName,outputFilename;
	private String[] hCodes = new String[MAXCHARS];
	private int distinctChars = 0;
	private long fileLen=0,outputFilelen;
	
	private FileOutputStream outf;
	private String gSummary;

	
	public CShannonFanoDecoder (){
		loadFile("","");
		}
	public CShannonFanoDecoder (String txt){
		loadFile(txt);
		}
	public CShannonFanoDecoder (String txt,String txt2){
		loadFile(txt,txt2);
		}
		
	public void loadFile(String txt){
		fileName = txt;
		outputFilename = stripExtension(txt,strExtension );
		gSummary = "";
		}
	public void loadFile(String txt,String txt2){
		fileName = txt;
		outputFilename = txt2;
		gSummary = "";
		}
	String stripExtension(String ff,String ext){
		ff = ff.toLowerCase();
		if(ff.endsWith(ext.toLowerCase())){
			return ff.substring(0,ff.length()-ext.length());
			}
		return "_" + ff;
		}
		
	public boolean decodeFile() throws Exception{
		
		
		if(fileName.length() == 0) return false;
		
		for(int i=0;i<MAXCHARS;i++) hCodes[i] = "";
		long i;
		CFileBitReader fin = new CFileBitReader(fileName);
		fileLen = fin.available();

		String buf;
		buf = fin.getBytes(sfSignature.length());
		
		if(!buf.equals(sfSignature)) return false;
		outputFilelen = Long.parseLong(fin.getBits(32),2);
		distinctChars = Integer.parseInt(fin.getBits(8),2)+1;
		gSummary  += ("Compressed File Size : "+ fileLen + "\n");
		gSummary  += ("Original   File Size : "+ outputFilelen + "\n");
		gSummary  += ("Distinct   Chars     : "+ distinctChars + "\n");
		for(i=0;i<distinctChars;i++){
			
			int ch = Integer.parseInt(fin.getBits(8),2);
			int len = Integer.parseInt(leftPadder(fin.getBits(5),8),2);
			hCodes[ch] = fin.getBits(len);
			//System.out.println((char)ch + " : "  + hCodes[ch]);
			}
		
		try{
		
		outf = new FileOutputStream(outputFilename);
		i = 0;
		int k;
		int ch;
		
		while(i < outputFilelen){	
				buf = "";
				for(k=0;k<32;k++){
					buf += fin.getBit();
					ch  = findCodeword(buf);
						if(ch > -1){
							outf.write((char)ch);
							buf = "";
							i++;
							break;
						}
					}
				if(k >=32 ) throw new Exception(gSummary + "\nCorrupted File!\n");
				
			}
		
		outf.close();
		return true;
		
		}catch(Exception e){
			throw e;
		}
		

		}
		
	int findCodeword(String cw){
		int ret = -1;
		for(int i=0;i<MAXCHARS;i++){
			if(hCodes[i] != "" && cw.equals(hCodes[i])){
				ret = i;
				break;
			}
			}
			return ret;
		}

	
	String leftPadder(String txt,int n){
		while(txt.length() < n )
			txt =  "0" + txt;
		return txt;
		}
	
	String rightPadder(String txt,int n){
		while(txt.length() < n )
			txt += "0";
		return txt;
		}
		
	public String getSummary(){
		return gSummary;
		}
	

	
}



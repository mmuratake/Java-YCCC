package edu.yccc.cis174.mmuratake.Recursion;

import java.io.File;

// Recursion is not a feature of java. It is a concept that is a part of java. It is a pattern.
/**
 * @author sMamiMuratake
 * 
 * To understand recursion, you must first understand recursion.
 *
 * The act of calling oneself to solve a problem until it is complete.
 */

public class Recursive {
	
	// Walk through directories, list the files in there, if a new directory is found, call self.
	public void walkDirectories(String filepath)
	{
		// 1. List files.
		File f = new File(filepath);
		File[] files = f.listFiles();
		if(files != null)
		{
			for(int x = 0; x < files.length; x++)
			{
				System.out.println(files[x].getAbsolutePath());
				
				// 2. If a directory exists, call self, pass the directory path.
				if(files[x].isDirectory())
				{
					walkDirectories(files[x].getAbsolutePath());
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		Recursive r = new Recursive();
		r.walkDirectories("C:\\Users\\sMamiMuratake");
	}

}

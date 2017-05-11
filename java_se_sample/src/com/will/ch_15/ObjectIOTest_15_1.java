package com.will.ch_15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectIOTest_15_1 {
	
	public static void main(String[] args) {
		File baseDir = new File(System.getProperty("user.dir"));
		File destFile = new File(baseDir, "./resource/person.obj");
		Person person = new Person("Will", 185);
		FileOutputStream fo = null;
		ObjectOutputStream oo = null;
		FileInputStream fi = null;
		ObjectInputStream oi = null;
		try {
			fo = new FileOutputStream(destFile);
			oo = new ObjectOutputStream(fo);
			oo.writeObject(person);
			
			fi = new FileInputStream(destFile);
			oi = new ObjectInputStream(fi);
			Person readPerson = (Person)oi.readObject();
			System.out.println(readPerson.getName());
			System.out.println(readPerson.getHeight());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(oo != null) {
				try {
					oo.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fo != null) {
				try {
					fo.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(oi != null) {
				try {
					oi.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fi != null) {
				try {
					fi.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}

package com.example.androidndkapp1;

public class Data {
	public native void stringtojni(String data);
	public native String stringfromjni();
	static{
		System.loadLibrary("Data");
	}
}

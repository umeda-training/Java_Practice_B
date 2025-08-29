package jp.ken.example;

import hellojava.hello;
import main.test;
import nishi.NishiSample;
import uchikawa.Uchikawa;

public class main {
	public static void main(String args[]) {
		hello tmphello = new hello();
		takeuchiSample takeSample = new takeuchiSample();
		test tmpTest = new test();
		Uchikawa uchikawa = new Uchikawa();
		NishiSample nisiSample = new NishiSample();
		System.out.println(tmphello.hello1());
		takeSample.tmpSample(6);
		System.out.println(tmpTest.test1());
		System.out.println(uchikawa.name());
		nisiSample.calc();
	}
}

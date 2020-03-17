package org.zk;

import java.lang.instrument.Instrumentation;

public class MyAgent {

	// premain方法，agent的入口
	public static void premain(String args, Instrumentation inst){
		System.out.println("Hi, I'm agent!");
		inst.addTransformer(new MyTransformer());
	}
}

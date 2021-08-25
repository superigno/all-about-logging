/**
 * 
 */
package com.superigno.logging.stackwalker;

/**
 * @author gino.quetua
 *
 */
public class StackWalkerCallerExample1 {

	public static void main(String[] args) {
		TheCallerClass sc = new TheCallerClass();
		sc.doSomething();
	}

	public static final class TheCallerClass {
		public void doSomething() {
			TheCalleeClass theCalleeClass = new TheCalleeClass();
			theCalleeClass.work();
		}
	}

	public static final class TheCalleeClass {
		public void work() {
			StackWalker instance = StackWalker.getInstance(StackWalker.Option.RETAIN_CLASS_REFERENCE);
			Class<?> callerClass = instance.getCallerClass();
			System.out.println(callerClass);
			instance.forEach(this::print);
		}
		
		private void print(StackWalker.StackFrame stackFrame) {		
			//System.out.println(stackFrame);		
			Class<?> c = stackFrame.getDeclaringClass();
			int lineNumber = stackFrame.getLineNumber();
			String methodName = stackFrame.getMethodName();
			System.out.printf("Class: %s, Method: %-7s, Line: %s%n", c.getName(), methodName, lineNumber);
		}
	}

}

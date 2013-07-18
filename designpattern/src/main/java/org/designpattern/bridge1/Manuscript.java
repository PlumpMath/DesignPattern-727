package org.designpattern.bridge1;

public abstract class Manuscript {
	
	protected Formatter formatter;
	public Manuscript(Formatter formatter){
		this.formatter=formatter;
	}
	
	public abstract void Print();
}

package com.coirius.FatCow;

public abstract class ServerModule {
	public Object doWork(String[] argv) {
		return null;
	}

	@Override
	public String toString() {
		return this.getClass().getName();
	}
}
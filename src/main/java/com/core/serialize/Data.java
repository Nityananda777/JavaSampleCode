package com.core.serialize;


import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Data implements Serializable{

	private static final long serialVersionUID = 2087368867376448459L;

	private String data;
	
	public Data(String d){
		this.data=d;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	@Override
	public String toString(){
		return "Data{data="+data+"}";
	}
	
	//serialization proxy class
	private static class DataProxy implements Serializable{
	
		private static final long serialVersionUID = 8333905273185436744L;
		
		private String dataProxy;
		private static final String PREFIX = "ABC";
		private static final String SUFFIX = "DEFG";
		
		public DataProxy(Data d){
			//obscuring data for security
			this.dataProxy = PREFIX + d.data + SUFFIX;
		}
		
		private Object readResolve() throws InvalidObjectException {
			System.out.println("inside read resolve");
			if(dataProxy.startsWith(PREFIX) && dataProxy.endsWith(SUFFIX)){
			return new Data(dataProxy.substring(3, dataProxy.length() -4));
			}else throw new InvalidObjectException("data corrupted");
		}
		
	}
	
	//replacing serialized object to DataProxy object
	private Object writeReplace(){
		System.out.println("inside writeReplace");
		return new DataProxy(this);
	}
	private void writeObject(ObjectOutputStream ois) throws InvalidObjectException{
		System.out.println("inside writeObject");
		throw new InvalidObjectException("Proxy is not used, something fishy");
		
	}
	private void readObject(ObjectInputStream ois) throws InvalidObjectException{
		System.out.println("inside  readObject");
		throw new InvalidObjectException("Proxy is not used, something fishy");
	}
}

package com.example.demo.Exceptions;

public class CustomerAlreadyExistsException extends RuntimeException{
	private String message;
	public CustomerAlreadyExistsException() {}
	public CustomerAlreadyExistsException(String msg) {
		super(msg);
		this.message=msg;
	}
	
	
	public  class NoSuchCustomerExistsException extends RuntimeException{
		private String message;
		public NoSuchCustomerExistsException() {}
		public NoSuchCustomerExistsException(String msg) {
			super(msg);
			this.message=msg;
		}
		
	}
}



package org.seckill.exception;

public class SeckillClosedException extends SeckillException{
	private static final long serialVersionUID = 6454314987648642646L;

	public SeckillClosedException(String message, Throwable cause) {
		super(message, cause);
	}

	public SeckillClosedException(String message) {
		super(message);
	}
	
}

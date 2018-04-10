package org.seckill.exception;

public class RepeatKillException extends SeckillException {
	private static final long serialVersionUID = 1457356743956329471L;

	public RepeatKillException(String message) {
		super(message);
	}

	public RepeatKillException(String message, Throwable cause) {
		super(message, cause);
	}

}

package org.seckill.dto;

import org.seckill.entity.SuccessKilled;
import org.seckill.enums.SeckillStateEnum;

public class SeckillExecution {
	private long seckillId;
	private int state;
	private String stateInfo;
	private SuccessKilled succcessKilled;

	public SeckillExecution() {
	}

	public SeckillExecution(long seckillId, SeckillStateEnum state, SuccessKilled succcessKilled) {
		super();
		this.seckillId = seckillId;
		this.state = state.getState();
		this.stateInfo = state.getStateInfo();
		this.succcessKilled = succcessKilled;
	}

	public SeckillExecution(long seckillId, SeckillStateEnum state, String stateInfo) {
		super();
		this.seckillId = seckillId;
		this.state = state.getState();
		this.stateInfo = stateInfo;
	}

	public long getSeckillId() {
		return seckillId;
	}

	public void setSeckillId(long seckillId) {
		this.seckillId = seckillId;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getStateInfo() {
		return stateInfo;
	}

	public void setStateInfo(String stateInfo) {
		this.stateInfo = stateInfo;
	}

	public SuccessKilled getSucccessKilled() {
		return succcessKilled;
	}

	public void setSucccessKilled(SuccessKilled succcessKilled) {
		this.succcessKilled = succcessKilled;
	}

}

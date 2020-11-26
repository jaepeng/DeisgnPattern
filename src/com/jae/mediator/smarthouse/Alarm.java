package com.jae.mediator.smarthouse;

//具体同事类
public class Alarm extends Colleague {

	public Alarm(Mediator mediator, String name) {
		super(mediator, name);
		//创建Alarm时,将自己放入到ConcreteMediatro 对象中[集合]
		mediator.Register(name, this);
	}

	public void SendAlarm(int stateChange) {
		SendMessage(stateChange);
	}

	@Override
	public void SendMessage(int stateChange) {
			//调用中介者对象的getMessage
		this.GetMediator().GetMessage(stateChange, this.name);
	}

}

package service;

import Ice.Current;
import demo._MyServiceDisp;

public class MyServiceImpl extends _MyServiceDisp {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3169602192267730741L;

	@Override
	public String hellow(Current __current) {
		// TODO Auto-generated method stub
		return "Hello world";
	}

	@Override
	public String say(Current __current) {
		// TODO Auto-generated method stub
		return "Server" + 1;
	}

}

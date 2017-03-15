package service;

import com.ls.demo.demo._MyServiceDisp;

import Ice.Current;

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

}

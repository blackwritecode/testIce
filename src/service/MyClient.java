package service;
import demo.MyServicePrx;
import demo.MyServicePrxHelper;

public class MyClient {

	public static void main(String[] args) {
		int status = 0;
		Ice.Communicator ic = null;
		
		try{
			// 初始化通信器
			ic = Ice.Util.initialize(args);
			// 传入远程服务单元的名称、网络协议、IP以及端口，构造一个Proxy对象
			Ice.ObjectPrx base = ic.stringToProxy("MyService:default -p 20000");
			// 通过checkedCast向下转型，获取MyService接口的远程，并同时检测根据传入的名称获取服务单元是否OnlineBook的代理接口，如果不是则返回null对象
			MyServicePrx prxy = MyServicePrxHelper.uncheckedCast(base);
			if(prxy == null){
				throw new Error("Invalid proxy");
			}
			
			// 调用服务方法
			String rt = prxy.hellow();
			String str = prxy.say();
			System.out.println(rt);
			System.out.println(str);
		}catch(Exception e){
			e.printStackTrace();
			status = 1;
		}finally{
			if(ic !=null){
				ic.destroy();
			}
		}
		System.exit(status);
	}
}

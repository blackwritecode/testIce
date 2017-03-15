package service;

import com.ls.demo.book.Message;
import com.ls.demo.book.OnlineBookPrx;
import com.ls.demo.book.OnlineBookPrxHelper;

public class OnlineBookI2Client {

	public static void main(String[] args) {
		int status = 0;
		Ice.Communicator ic = null;
		try{
			ic = Ice.Util.initialize(args);
			Ice.ObjectPrx base = ic.stringToProxy("OnlineBook:default -h 192.168.102.133 -p 10000 ");
			OnlineBookPrx onlineBook = OnlineBookPrxHelper.checkedCast(base);
			if(onlineBook == null){
				throw new Error("Invalid proxy");
			}
			Message msg = new Message();
			msg.name = "Mr li";
			msg.type = 3;
			String name = onlineBook.bookTick(msg).name;
			System.out.println(name);
		}catch(Exception e){
			e.printStackTrace();
			status = 1;
		}finally{
			if(ic != null){
				ic.destroy();
			}
		}
		System.exit(status);
	}
}

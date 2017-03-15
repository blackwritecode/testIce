[["java:package:com.ls.demo"]]
module demo{
	interface MyService{
		string hellow();
	};
};

module book{
	struct Message{
		string name;
		int type;
		bool valid;
		double price;
		string content;
	};
	interface OnlineBook{
		Message bookTick(Message msg);
	};
};
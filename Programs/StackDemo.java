class Stack{
	int stk[];
	int tos;
	Stack(){
		stk = new int[10];
		tos = -1;
	}
	Stack(int size){
		stk = new int[size];
		tos = -1;
	}
	void push(int ele){
		if(tos < stk.length-1){
			stk[++tos] = ele;
			System.out.println(ele+ " successfully inserted at position: "+tos);
		}
		else{
			System.out.println("Stack Overflow");
		}
	}
	int pop(){
		if(tos >= 0)
			return stk[tos--];
		else{
			System.out.println("Stack Underflow");
			return -1;
		}	
	}
}
class StackDemo{
	public static void main(String[] args){
		Stack s = new Stack(11); 
		for(int i = 0; i < 10; i++){
			s.push(i);
		}
		s.push(100);
		for(int i =10 ;i > 0; i--){
			System.out.println("Element at "+(s.tos+1)+" is:"+s.pop());
		}
		System.out.println("Element at "+(s.tos+1)+" is:"+s.pop());
	}
}
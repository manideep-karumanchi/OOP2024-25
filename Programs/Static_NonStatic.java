class Static_NonStatic{
	static int sv = 0;
	int nsv = 0;
	static void display(){
		Static_NonStatic sns[] = new Static_NonStatic[5];
		for(int i=0; i<5; i++){
			sns[i] = new Static_NonStatic();
		}
		for(int i=0; i<5; i++ ){
			sns[i].sv++;
			sns[i].nsv++;
			System.out.println("With Object"+i+" sv= "+sv+" nsv="+sns[i].nsv);
		}
	}
	static{
		System.out.println("Static NonStatic Members Demo");
	}
	public static void main(String[] args){
		display();
	}
}
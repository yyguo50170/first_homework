public class Fibonacci{
	public static int[] NUMS = new int[201];
	public static int of(int a){
        if(a == 1 || a == 2){
            return 1;
        }else{
            for(int i =3; i <= a;i++){
				if(NUMS[i]!=0)
					continue;
				NUMS[i] = NUMS[i-1]+NUMS[i-2];
			}
			return NUMS[a];
        }
    }

    public static void main(String[] args){
		NUMS[0]=0;
		NUMS[1]=1;
		NUMS[2]=1;
        for(int i = 1;;i++){
            int res = Fibonacci.of(i);
			if(res <= 200)
                  System.out.println("Fibonacci.of("+i+") =="+res);
			else
				break;
		}
	}
}
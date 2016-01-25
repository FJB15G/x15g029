package jp.ac.chibafjb.x15g029.kd211;


public class ArrayProc{
	
		public static int maxFind1(int num[],int nagasa){
		int m = 0;
			for(int i=0;i<=nagasa;i++){//配列更新
				if(num[i]>m){
					m=num[i];//最大値更新
					i++;
				}
				i++;
				//break;
			}
			return(m);
	     }
		
		
        public static int maxFind2(int num[],int nagasa){
        	
             int m = num[0];
        	 for(int i=1;i<=nagasa;i++){
        		 if(num[i]>m){
        			 m=num[i];
        			 i++;
        		 }
        		 i++;
        	 }
        	 return(m);
        }
}

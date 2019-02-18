
public class TestProject {

	public static void main(String[] args) {
		int a[]={2,5,7,8,4};
		  int b[]={5,8,2,4,2};
				int sum[]=new int[b.length];
				int i;
						for(i=0;i<a.length;i++){
							sum[i]=0;
							if(i>b.length){
								sum[i]=b[i]+0;
							}
							else{
					sum[i]=a[i]+b[i];
				}
						}
						for(i=0;i<a.length;i++){
				System.out.println(sum[i]);
				System.out.println("abcd");
				System.out.println("mn");
						}
			}
			

	}



package resoures;
import java.util.ArrayList;
import java.util.List;
public class FindAllTripletswithZeroSum {
	public static void main(String arg[]) {
	int arr[]={0, -1, 2, -3, 1};
	ArrayList<ArrayList<Integer>>res=findsum(arr);
	for(List<Integer>Triplets:res) {
		System.out.println(Triplets.get(0) + " " + Triplets.get(1)
			  + " " + Triplets.get(2));
	}}


	static ArrayList<ArrayList<Integer>>findsum(int arr[]){
		ArrayList<ArrayList<Integer>>res=new ArrayList<>();
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=j+1;k<n;k++) {
					if(arr[i]+arr[j]+arr[k]==0) {
						ArrayList<Integer>Triplets=new ArrayList<>();
						Triplets.add(i);
						Triplets.add(j);
						Triplets.add(k);
						res.add(Triplets);					
						}
				}
			}
		}
		return res;
	}
	
}
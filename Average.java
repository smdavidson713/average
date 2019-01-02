import java.util.Scanner;
import java.lang.StringBuilder;

public class Average{

	private int data[];
	private double mean;

	public Average(){
		data = new int[5];
		Scanner keyboard = new Scanner(System.in);
		int score;

		for(int i=0; i < 5; i++){
			System.out.print("Please enter your score: ");
			score = keyboard.nextInt();
			data[i] = score;
		}
		calculateMean();
		selectionSort();
	}
public void calculateMean(){	
	double sum=0;

	for(int i=0; i <5; i++){
		sum += data[i];
	}
	mean = sum/5;
}
public String toString(){
	selectionSort();

	StringBuilder stringBuilder = new StringBuilder();
	for(int e: data){
		stringBuilder.append(e);
		stringBuilder.append(" ");
	}
	stringBuilder.append("mean: ");
	stringBuilder.append(mean);

	return stringBuilder.toString();



}
public void selectionSort(){
	int n = data.length;

	for(int i = 0; i < n-1; i++){
		int max = i;

		for(int x = i+1; x < n; x++){
			if(data[x] > data[max])
				max = x;
		}
		int y = data[max];
		data[max] = data[i];
		data[i] = y;

	}

}

}

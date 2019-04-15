package interview;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Cognizant {

	public static void main(String[] args) throws Exception {
		
//		Cognizant.Exp_get();
//		Cognizant.countReps();
//		Cognizant.duplicateLetter();
//		Cognizant.largestNumberArray();
		Cognizant.notepadCount();

	}
	
	public static void Exp_get(){
		String str = "2019\ntext";
		String[] A_str = str.split("\n");
		System.out.println(A_str[0]);
	}
	
	public static void countReps(){
		int count = 0;
		char a = 'a';
		String str = "Sachine Tendulkar";
		char[] A_char = str.toCharArray();
		for(int i=0; i<str.length(); i++){
			if(A_char[i]==a){
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void duplicateLetter(){
		String str = "qaqsdsdeffrrgttg";
		char[] C_str =str.toCharArray();
		
		for(int i=0; i<str.length(); i++){
			for(int j=i+1; j<str.length(); j++){
				if(C_str[i]==C_str[j]){
					System.out.println(C_str[j]);
					break;
				}
			}
		}
		
	}
	
	public static void largestNumberArray(){
		int[] nums = {1,23,45,6,7,8,99,456,34};
		int max = nums[0];
		for(int i=0; i<nums.length; i++){
			if(nums[i]>max){
				max = nums[i];
			}
		}
		System.out.println("Largest number is " + max);
	}
	
	public static void notepadCount() throws Exception{
		int linecount = 0;
		int wordcount = 0;
		File file = new File("F:\\Study\\Interview questions.txt");
		FileInputStream fis = new FileInputStream(file);
		InputStreamReader input = new InputStreamReader(fis);
		BufferedReader reader = new BufferedReader(input);
		
		String line;
		while((line = reader.readLine())!=null){
			String[] Wordlist = line.split("\\s+");
			wordcount += Wordlist.length;
			
			String[] Sentencelist = line.split("[!?.:]+");
			linecount += Sentencelist.length;
		}
		System.out.println("Total words " + wordcount);
		System.out.println("Total lines " + linecount);
	}

}

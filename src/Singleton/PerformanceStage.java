package Singleton;

public class PerformanceStage {
	private static PerformanceStage INSTANCE = null;
	private int count;
	
	private PerformanceStage(){
		//private constructore
		count ++;
	}
	
	public static PerformanceStage getPerformanceStage(){
		if (INSTANCE==null){
			INSTANCE =  new PerformanceStage();
		} 
			return INSTANCE;
	}
	
	public int getCount(){
		return count;
	}
}

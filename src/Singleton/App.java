package Singleton;

public class App {
	public static void main(String[] args) {
		PerformanceStage stage = PerformanceStage.getPerformanceStage();
		System.out.println(stage.getCount());
		
		PerformanceStage stage2 = PerformanceStage.getPerformanceStage();
		System.out.println(stage.getCount());

	}
}

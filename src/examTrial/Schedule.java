package examTrial;

public class Schedule {
	public static void main(String[] args) {
		String [][][][] schedule = new String[9][12][30][24]; // assuming 9 years, 12 months, 30 days, 24 hours

		for(int year = 0; year < schedule.length; year++) { 
			for(int month = 0; month < schedule[year].length; month++) { 
				for(int day = 0; day < schedule[year][month].length; day++) {
					for(int hour = 0; hour < schedule[year][month][day].length; hour++) {
						schedule[year][month][day][hour] = "empty";
					}
				}
			}
		}

		schedule[0][0][29][8] = "My Programming 1 Exam";

		for(int year = 0; year < schedule.length; year++) { 
			for(int month = 0; month < schedule[year].length; month++) { 
				for(int day = 0; day < schedule[year][month].length; day++) {
					for(int hour = 0; hour < schedule[year][month][day].length; hour++) {
						if(!schedule[year][month][day][hour].equals("empty")) {
							System.out.print(schedule[year][month][day][hour]);
						};
					}
				}
			}
		}
	}
}

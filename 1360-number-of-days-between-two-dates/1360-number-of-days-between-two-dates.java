class Solution {
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(todays(date1)-todays(date2));
        
        
    }
    public int todays(String date){
        int year=Integer.parseInt(date.substring(0,4));
        int month=Integer.parseInt(date.substring(5,7));
        int days=Integer.parseInt(date.substring(8,10));
        int y=year-1;
        int total=y*365+y/4-y/100+y/400;
        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };
        for(int i=0;i<month-1;i++){
            total+=daysInMonth[i];
        }
        if(month>2&&(year%400==0||(year%4==0&&year%100!=0))){
            total++;
        }
        total+=days;
        return total+100;

    }
}
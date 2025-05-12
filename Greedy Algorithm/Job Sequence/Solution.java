import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class Solution {
    static class Job{
        int id;
        int deadline;
        int profit;
        
        public Job(int id, int deadline, int profit){
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{4,20},{1,10},{1,40},{1,30}};
        
        //Job jobs[] = new Job[arr.length];
        List<Job> jobs = new ArrayList<>();
        
        for(int i = 0; i<arr.length; i++){
            jobs.add(new Job(i,arr[i][0],arr[i][1]));
        }
        
        Collections.sort(jobs,(obj1,obj2)->(obj2.profit-obj1.profit));
        int time = 0;
        
        for(int i = 0;i<jobs.size();i++){
            if(jobs.get(i).deadline>time){
                System.out.print(jobs.get(i).id + " ");
                time++;
            }
        }
        
    }
}

class Solution {
    public double average(int[] salary) {
        int count=0;
        int sum=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<salary.length;i++){
            if(salary[i]>max){
                max = salary[i];
            }

            if(salary[i]<min){
                min = salary[i];
            }

        }

        for(int i=0;i<salary.length;i++){
            if(salary[i]!=min && salary[i]!=max){
                sum += salary[i];
            }
        }

        double avg = (double)sum/(salary.length-2);

        return avg; 
    }
}
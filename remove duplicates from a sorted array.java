class Solution {
    public int removeDuplicates(int[] nums) {
        
    int uniqueElementCount = 0;
    int skippedIndexCount = 0;
    int skippedIndexDifference = 0;

    //check if array is empty, if true then return 0
    if(nums.length == 0){
        return uniqueElementCount;
    }

    //set unique element counter to 1 to count the first element
    uniqueElementCount = 1;

    for(int i =0; i < nums.length-1; i++)
    {
        if(nums[i] == nums[i+1]){
            skippedIndexCount++;
        }
        else{
            //increment unique element count
            uniqueElementCount++;

            //store the next unique element into the index after the last occurence of a unique element
            skippedIndexDifference = (i+1) - skippedIndexCount;
            nums[skippedIndexDifference] = nums[i+1];            
        }
    }
        return uniqueElementCount;   

    }
}

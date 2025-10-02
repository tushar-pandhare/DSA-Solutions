class Solution {
    public int longestConsecutive(int[] arr) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : arr) set.add(num);
        int prev = -1, count = 0, maxi = 0;
        for (int num : set) {
            if (num == prev + 1) count++;
            else count = 1;
            maxi = Math.max(maxi, count);
            prev = num;
        }
        return maxi;
    }
}
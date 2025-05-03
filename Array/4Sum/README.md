Problem Statement : Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

0 <= a, b, c, d < n a, b, c, and d are distinct. nums[a] + nums[b] + nums[c] + nums[d] == target You may return the answer in any order.

Example 1:

Input: nums = [1,0,-1,0,-2,2], target = 0 Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]

Example 2:

Input: nums = [2,2,2,2,2], target = 8 Output: [[2,2,2,2]]

Constraints:

1 <= nums.length <= 200 -109 <= nums[i] <= 109 -109 <= target <= 109

Intuition

The problem is to find all unique quadruplets in the array that sum up to a given target. A good approach to solving this problem is to first sort the array, which allows us to use the two-pointer technique efficiently.

Approach

Sort the Array: Sorting helps in using two-pointer technique and avoiding duplicates.

Nested Loops: Use two nested loops to fix the first two elements of the quadruplet. Let's denote these indices by i and j.

Two-Pointer Technique: For each pair of fixed elements, use two pointers (p and q) to find the other two elements that sum up to the target. This is done in linear time.

Avoid Duplicates: Skip duplicate elements to ensure that the quadruplets are unique.

TC : O(n^3)

SC : O(1)

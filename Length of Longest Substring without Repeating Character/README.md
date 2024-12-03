**Problem Statement :**
Given a string s, find the length of the longest substring without repeating characters.

 
**Example 1:**

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

**Example 2:**

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

**Example 3:**

Input: s = "pwwkew"
Output: 3

Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 
**Constraints:**

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.


**Intuition:**

The problem is to find the length of the longest substring without repeating characters. A sliding window approach is suitable for this problem, where we use two pointers to define the window and a frequency array to track the occurrence of characters within the window.

**Approach**

**Initialization:**

st and end are pointers to maintain the current window.

len is the length of the input string s.

strLen keeps track of the maximum length of substrings found without repeating characters.

ans is a frequency array of size 256 (to accommodate all ASCII characters), initialized to 0.


**Sliding Window Mechanism:**


The end pointer expands the window by moving forward.

For each character at the end pointer, we check if it has been seen in the current window (ans[s.charAt(end)] == 0).

If it hasn't been seen, we increase its count and move the end pointer.

If it has been seen, we move the st pointer to shrink the window from the left until the character at end is no longer repeated.

Update strLen to the maximum length of the window so far.


**Update and Return:**


Continue expanding the window and updating the maximum length until the end pointer reaches the end of the string.

Finally, return strLen as the length of the longest substring without repeating characters.


**TC : O(n)
SC : O(1)

**

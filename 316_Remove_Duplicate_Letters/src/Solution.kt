import java.util.*

class Solution {
    /**
     * Link: https://leetcode.com/problems/remove-duplicate-letters/
     * Given a string s, remove duplicate letters so that every letter appears once and only once.
     * You must make sure your result is the smallest in lexicographical order among all possible results.
     *
     * You must implement a solution with a linear runtime complexity and use only constant extra space.
     *
     * Input: s = "bcabc"
     * Output: "abc"
     *
     * Input: s = "cbacdcbc"
     * Output: "acdb"
     */

    fun removeDuplicateLetters(s: String): String {
        val result = Stack<Char>()
        val hasSeen = HashSet<Char>()
        val charLastOccurs = HashMap<Char, Int>()

        // Populate HashMap. This HashMap used to keep track when the
        // character last occur. Do not pop if charLastOccurs < currentIndex
        s.forEach { character ->
            charLastOccurs[character] = s.lastIndexOf(character)
        }

        var index = 0
        s.forEach { character ->
            // Do not need to check character that has already in the stack
            if(!hasSeen.contains(character)) {
                // Begin popping
                while(!result.isEmpty() && charLastOccurs[result.peek()]!! > index && character < result.peek()) {
                    hasSeen.remove(result.pop())
                }
                // Add character back to stack and hasSeen
                hasSeen.add(character)
                result.push(character)
            }
            index++
        }

        // Construct resultString from stack
        var resultString = ""
        result.forEach { character ->
            resultString += character
        }

        return resultString
    }
}
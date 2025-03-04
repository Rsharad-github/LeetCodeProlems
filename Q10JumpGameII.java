class Q10JumpGameII {
public int jump(int[] nums) {
    int jumps = 0;
    int maxReach = 0;
    int currentJumpEnd = 0;

    for (int i = 0; i < nums.length - 1; i++) {
        maxReach = Math.max(maxReach, i + nums[i]); // Update the max reach

        if (i == currentJumpEnd) { // Need to jump
            jumps++;
            currentJumpEnd = maxReach;
        }
    }
    return jumps;
}
}
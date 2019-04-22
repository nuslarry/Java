#365. Water and Jug Problem
class Solution {
    public boolean canMeasureWater(int x, int y, int z) {
        if (z < 0 || z > x + y) {
            return false;
        }
        Set<Integer> set = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        q.offer(0);
        while (!q.isEmpty()) {
            int n = q.poll();
            if (n + x <= x + y && set.add(n + x)) {
                q.offer(n + x);
            } 
            if (n + y <= x + y && set.add(n + y)) {
                q.offer(n + y);
            } 
            if (n - x >= 0 && set.add(n - x)) {
                q.offer(n - x);
            } 
            if (n - y >= 0 && set.add(n - y)) {
                q.offer(n - y);
            }
            if (set.contains(z)) {
                return true;
            }
        }
        return false;
    }
}


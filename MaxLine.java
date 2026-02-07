class Solution {

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public int maxPoints(int[][] points) {
        int n = points.length;
        if (n <= 2) return n;

        int maxPointsOnLine = 0;

        for (int i = 0; i < n; i++) {
            java.util.Map<String, Integer> slopeMap = new java.util.HashMap<>();
            int samePoint = 1;
            int curMax = 0;

            for (int j = i + 1; j < n; j++) {
                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];

                if (dx == 0 && dy == 0) {
                    samePoint++;
                    continue;
                }

                if (dx == 0) {
                    dx = 0;
                    dy = 1;
                } else if (dy == 0) {
                    dx = 1;
                    dy = 0;
                } else {
                    int g = gcd(Math.abs(dx), Math.abs(dy));
                    dx /= g;
                    dy /= g;

                    // normalize sign
                    if (dx < 0) {
                        dx = -dx;
                        dy = -dy;
                    }
                }

                String key = dx + "/" + dy;
                int count = slopeMap.getOrDefault(key, 0) + 1;
                slopeMap.put(key, count);

                curMax = Math.max(curMax, count);
            }

            maxPointsOnLine = Math.max(maxPointsOnLine, curMax + samePoint);
        }

        return maxPointsOnLine;
    }
}
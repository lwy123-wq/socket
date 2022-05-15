package aa;

class Solution11 {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}

https://leetcode.com/problems/compare-version-numbers/description 23-09-25

class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int n1 = v1.length;
        int n2 = v2.length;
        int i=0,j=0;
        int val1 = 0;
        int val2 = 0;
        while(i<n1 && j<n2){
            int a = Integer.parseInt(v1[i]);
            int b = Integer.parseInt(v2[i]);
            if(a<b){
                return -1;
            }
            if(a>b){
                return 1;
            }
            i++;
            j++;
        }
        while(i<n1){
            int a = Integer.parseInt(v1[i]);
            if(a<0) return -1;
            if(a>0) return 1;
            i++;
        }
        while(j<n2){
            int b = Integer.parseInt(v2[j]);
            if(0<b) return -1;
            if(0>b) return 1;
            j++;
        }
        return 0;
    }
}
package com.core.ds.array;

import java.util.*;
import java.util.stream.Collectors;

public class IntersecionPoint2ArraysII {
    int intersectionPoint = -1;
    int x;
    int y;

    public int[] intersection(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		List<Integer> result = new ArrayList<Integer>();
		for(int i = 0; i < nums1.length; i++) {
			if(map.containsKey(nums1[i])) {
                map.put(nums1[i], map.get(nums1[i]) + 1);
            }
			else{
			    map.put(nums1[i], 1);
            }
		}

		for(int i = 0; i < nums2.length; i++) {
			if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
				result.add(nums2[i]);
				map.put(nums2[i], map.get(nums2[i])-1);
			}
		}

		int[] r = new int[result.size()];
		for(int i = 0; i < result.size(); i++) {
			r[i] = result.get(i);
		}

		return r;

    }

    public ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
        int i = 0;
        int j = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                ans.add(A.get(i));
                i++;
                j++;
            } else if (A.get(i) > B.get(j)) {
                j++;
            } else {
                i++;
            }
        }

        return ans;
    }

    public static void main(String[] args) throws java.lang.Exception {
        int[] a = {1, 2, 2, 1};
        int[] b = {2, 2};
        IntersecionPoint2ArraysII i = new IntersecionPoint2ArraysII();
        System.out.println("Intersection point is : " + Arrays.toString(i.intersection(a, b)));

    }
}
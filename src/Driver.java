import java.util.Arrays;

public class Driver {
	public static void main(String[] args) {
		/*
		// 1920. Build Array from Permutation
		int test1[] = {0, 2,1,5,3,4};
		BuildArrayFromPermutation buildArrayFromPermutation = new BuildArrayFromPermutation();
		buildArrayFromPermutation.buildArray(test1);

		
		// 268. Missing Number
		int test1[] = {3,0,1};
		int test2[] = {0,1};
		int test3[] = {9,6,4,2,3,5,7,0,1};
		MissingNumber missingNumber = new MissingNumber();
		missingNumber.missingNumber(test3);
	
		
		// 303. Range Sum Query - Immutable
		int test1[] = {-2, 0, 3, -5, 2, -1};
		NumArray numArray = new NumArray(test1);
		numArray.sumRange(0, 2);
		numArray.sumRange(2, 5);
		numArray.sumRange(0, 5);

		
		// 349. Intersection of Two Arrays
		int nums1[] = {1,2,2,1};
		int nums2[] = {2,2};
		//int nums1[] = {4,9,5};
		//int nums2[] = {9,4,9,8,4};
		IntersectionOfTwoArrays intersectionOfTwoArrays = new IntersectionOfTwoArrays();
		intersectionOfTwoArrays.intersection(nums1, nums2);
		}


		// 350. Intersection of Two Arrays II
		int nums1[] = {1,2,2,1};
		int nums2[] = {2,2};
		//int nums1[] = {4,9,5};
		//int nums2[] = {9,4,9,8,4};
		IntersectionOfTwoArraysII intersectionOfTwoArraysII = new IntersectionOfTwoArraysII();
		intersectionOfTwoArraysII.intersection(nums1, nums2);

		
		// 414. Third Maximum Number
		int test1[] = {3,2,1};
		int test2[] = {1,2};
		int test3[] = {2,2,3,1};
		ThirdMaximumNumber thirdMaximumNumber = new ThirdMaximumNumber();
		thirdMaximumNumber.thirdMax(test3);

		
		// 455. Assign Cookies
		//int g[] = {1,2,3};
		//int s[] = {1,1};
		int g[] = {1,2,};
		int s[] = {1,2,3};
		AssignCookies assignCookies = new AssignCookies();
		assignCookies.findContentChildren(g, s);

		
		// 485. Max Consecutive Ones
		int test1[] = {1,1,0,1,1,1}; 
		int test2[] = {1,0,1,1,0,1};
		MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
		maxConsecutiveOnes.findMaxConsecutiveOnes(test1);

		
		// 495. Teemo Attacking
		int test1[] = {1,4};
		int duration1 = 2;
		int test2[] = {1,2};
		int duration2 = 2;
		TeemoAttacking teemoAttacking = new TeemoAttacking();
		teemoAttacking.findPoisonedDuration(test2, duration2);

		
		// 496. Next Greater Element I
		//int num1[] = {4,1,2};
		//int num2[] = {1,3,4,2};
		int num1[] = {2,4};
		int num2[] = {1,2,3,4};
		NextGreaterElementI nextGreaterElementI = new NextGreaterElementI();
		nextGreaterElementI.nextGreaterElement(num1, num2);

		
		// 500. Keyboard Row
		String words1[] = {"Hello","Alaska","Dad","Peace"};
		//String words1[] = {"Hello"};
		String words2[] = {"omk"};	
		String words3[] = {"adsdf","sfd"};
		KeyboardRow keyboardRow = new KeyboardRow();
		keyboardRow.findWords(words3);	
		//boolean result = keyboardRow.containWord();
		//System.out.println(result);

		
		// 506. Relative Ranks
		int test1[] = {10,3,8,9,4};
		RelativeRanks relativeRanks = new RelativeRanks();
		relativeRanks.findRelativeRanks(test1);

		
		// 561. Array Partition
		int test1[] = {1,4,3,2};
		int test2[] = {6,2,6,5,1,2};
		ArrayPartition arrayPartition = new ArrayPartition();
		arrayPartition.arrayPairSum(test2);

		
		// 566. Reshape the Matrix
		int test1[][] = {{1,2}, {3,4}};
		int r = 1;
		int c = 4;
		ReshapeTheMatrix reshapeTheMatrix = new ReshapeTheMatrix();
		reshapeTheMatrix.matrixReshape(test1, r, c);

		
		// 575. Distribute Candies
		int test1[] = {1,1,2,2,3,3};
		int test2[] = {6,6,6,6};
		DistributeCandies distributeCandies = new DistributeCandies();
		distributeCandies.distributeCandies(test2);
		
		// revere lint - test
		int[] test = {1,2,3,4};
		int[] result = new int[test.length];
		//for(int i=0, j=test.length-1; i<test.length; i++, j--) 
			//result[i] = test[j];
		for(int i=0; i<test.length; i++)
			result[i] = test[test.length-1-i];
		System.out.println("Reversed Reult: ");
		for(int x : result)
			System.out.println(x);
		*/
		
		// 1. Two Sum
	    // only find 1 set of result 
		int[] test = {2,7,11,15,1,8};
		int target = 9;
		TwoSum twoSum = new TwoSum();
	    // int[] result = twoSum.twoSumSingleLoop(test, target);
		int[] result = twoSum.twoSum(test, target);
	    for(int i=0; i<result.length; i++) {
	    	System.out.print(result[i]+" ");
	    }
		

	
	}

		

}




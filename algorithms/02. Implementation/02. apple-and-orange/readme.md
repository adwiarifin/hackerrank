# Apple and Orange

Original page: [https://www.hackerrank.com/challenges/apple-and-orange/problem](https://www.hackerrank.com/challenges/apple-and-orange/problem)

## Problems
Sam's house has an apple tree and an orange tree that yield an abundance of fruit. In the diagram below, the red region denotes his house, where  is the start point, and *t* is the endpoint. The apple tree is to the left of his house, and the orange tree is to its right. You can assume the trees are located on a single point, where the apple tree is at point *a*, and the orange tree is at point *b*.

![Apple and Orange](appleandorange.png)

When a fruit falls from its tree, it lands *d* units of distance from its tree of origin along the *x*-axis. A negative value of *d* means the fruit fell  units to the tree's left, and a positive value of *d* means it falls *d* units to the tree's right.

Complete the function `countApplesAndOranges`,

where,

*s* Starting point of Sam's house location.<br>
*t* Ending location of Sam's house location.<br>
*a* Location of the Apple tree.<br>
*b* Location of the Orange tree.<br>
*m* Number of apples that fell from the tree.<br>
*apples* Distance at which each apple falls from the tree.<br>
*n* Number of oranges that fell from the tree.<br>
*oranges* Distance at which each orange falls from the tree.<br>

Given the value of *d* for *m* apples and *n* oranges, can you determine how many apples and oranges will fall on Sam's house (i.e., in the inclusive range *[s,t]*)? Print the number of apples that fall on Sam's house as your first line of output, then print the number of oranges that fall on Sam's house as your second line of output.

## Input Format

The first line contains two space-separated integers denoting the respective values of *s* and *t*. 
The second line contains two space-separated integers denoting the respective values of *a* and *b*. 
The third line contains two space-separated integers denoting the respective values of *m* and *n*. 
The fourth line contains *m* space-separated integers denoting the respective distances that each apple falls from point *a*. 
The fifth line contains *n* space-separated integers denoting the respective distances that each orange falls from point *b*.

## Constraints

* 1 <= *s,t,a,b,m,n* <= 10<sup>5</sup>
* -10<sup>5</sup> <= *d* <= 10<sup>5</sup>
* *a* < *s* < *t* < *b*

## Output Format

Print two line integers of output with following criteria:

1. The first integer: the number of apples that fall on Sam's house.
2. The second integer: the number of oranges that fall on Sam's house.

## Sample Input 0
```
7 11
5 15
3 2
-2 2 1
5 -6
```

## Sample Output 0
```
1
1
```

## Explanation 0
The first apple falls at position 5 - 2 = 3.<br>
The second apple falls at position 5 + 2 = 7.<br>
The third apple falls at position 5 + 1 = 6.<br>
The first orange falls at position 15 + 5 = 20.<br>
The second orange falls at position 15 - 6 = 9.<br>
Only one fruit (the second apple) falls within the region between 7 and 11, so we print 1 as our first line of output.<br>
Only the second orange falls within the region between 7 and 11, so we print 1 as our second line of output.<br>
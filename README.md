# QuickSorters
## Jason Lam, Andrew Qu, Karina Ionkina

We found runtimes of quicksort by subtracting the start time (time before quicksort is used) from the end time (time after quicksort is used). We then plotted them into a graph and based on our findings, quicksort's algorithm classification is O(nlog(n)).
The arrays that we tested quicksort on had lengths of powers of two. For example, the first array had a length of 2, the next had a length of 4, then 8, then 16, and so on, until 2^20 which is about a million. These are our results:

Length of array/Runtime in ms

2	0
4	0
8	0
16	0
32	0
64	0
128	0
256	0
512	0.01
1024	0.06
2048	0.11
4096	0.19
8192	0.46
16384	1
32768	2.15
65536	4.55
131072	9.4
262144	20.02
524288	42.13
1048576	88.83

Since the length of the array doubles after each test, we should expect to see the runtime at least double as well. This does seem to be the case, especially in the last few cases. The runtime increases by a factor of slightly more than 2, and since n is increasing by a factor of 2, we are led to believe that quicksort has an nlog(n) runtime classification for most/average cases.

We hypothesized that the worst case for qsort would be on an array which is in reverse order. This makes sense because in our algorithm, the pvtPos is always 0. That means the first number in the array, which would be the largest number, gets swapped to the back. Since it's already at the end of the array, the array wasn't really partitioned at all. The whole length of the array, minus the last element, will have to be partitioned again, continuing n-1 times.
However, our test results did not reflect that. In fact, running qsort on a reversed array was significantly faster.

Length of reversed array/Runtime in ms

2	0
4	0
8	0
16	0
32	0
64	0
128	0.01
256	0
512	0.01
1024	0.01
2048	0.04
4096	0.07
8192	0.16
16384	0.35
32768	0.74
65536	1.54
131072	3.14
262144	6.73
524288	13.55
1048576	28.54

Again, the runtimes seem to (slight more than) double after each case, but compared to the runtims of a shuffled array, this was super fast. I probably made a mistake in my code somewhere.
We also tested qsort on sorted arrays, and the runtimes were similar to the runtimes when testing on shuffled arrays. Who woulda thought.

Worst Case Scenario: O(n^2) (?????)
Best Case Scenario: O(nlog(n))
Average Case Scenario: O(nlog(n));

Link for google spreadsheet graph:
https://docs.google.com/a/stuy.edu/spreadsheets/d/1vNMTCXyOfAqHsLfRkevqxj5Hs75AswRWvTTSOhYV26Q/edit?usp=sharing

This document is to explain the method/thinking approach I have taken to solve this problem.

We see here that we need to find a factor of a number n between 2 and the number n, if we do so, we can claim that its not a prime number.
Let's take a number = 15
15 = 1*15
3*5
5*3
15*1

similarly if we take a number = 20
20 = 1*20
2*10
4*5
5*4
10*2
20*1

We see that these numbers are repeated like we are writing 2*10 and 10*2, even though if we find that its not divisible by 2, it cannot be divisible by 10.

we find that the highest value of number we need to check if sqrt(n). Thus we will only loop till sqrt(n).

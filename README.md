# java dfa
 A simulator for dfa machines in java ; this program allows the user to create dfas that accepts only input strings of the language {0,1}. then checks wether the inputs are accepted by the dfa machine or not.

## Input format 

0,0,1;1,2,1;2,0,3;3,3,3#1,3
Where the first number in each part ( parts are every segment separated by ; ) is the state number.
The second element is the transition when given 0.
Third element is the transition when given 1.

in the last element we see a # sign 
This denotes the accept states ; in this case it is state 1 and state 3.
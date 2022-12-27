Create 2 overloaded methods called subArray:

 1. accepts a char array and int called beginIndex and returns a new char array that is the sub-array of original array starting from beginIndex till the end of the array
   {'h', 'e', 'l', 'l', 'o'} , 2     ->   {'l', 'l', 'o'}
   {'h', 'e', 'l', 'l', 'o'} , 4     ->   {'o'}
   {'h', 'e', 'l', 'l', 'o'} , 0     ->   {'h', 'e', 'l', 'l', 'o'}

 2. accepts a char array and int called beginIndex and int called endIndex and returns a new char array that is the sub-array of original array starting from beginIndex till the endIndex, excluding the endIndex
   {'h', 'e', 'l', 'l', 'o'} , 0, 2     ->   {'h', 'e'}
   {'h', 'e', 'l', 'l', 'o'} , 1, 5     ->   {'e', 'l', 'l', 'o'}
   {'h', 'e', 'l', 'l', 'o'} , 1, 2    ->   {'e'}
   {'h', 'e', 'l', 'l', 'o'} , 1, 1    ->   { }
   
    
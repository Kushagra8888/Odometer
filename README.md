# Odometer

Takes an initial reading as a number and convert to an integer array which is used to represent the digits in an odometer.

The following functions are supported:

isValid() : Checks if the reading is valid
increment() : finds the next valid reading
decrement(): finds the previous valid reading

The following helper functions are internally used:

maxAtIndex() : finds the maximum possible digit at a given position in the odometer.
minAtIndex() : finds the minimum possible digit at a given position in the odometer.
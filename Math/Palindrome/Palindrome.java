class Palindrome {
    public boolean isPalindrome(int x) {
    // var holds copy of value of x
    int inputX = x;
    // var to store reversed version of x
    int reversed = 0;
       
    // if x is negative, return false
    if (x < 0){
        return false;
    }
       
    // run loop until param number is 0
    while(inputX != 0){
        // getting last digit. Example: 121 -> digit = 1 and so on in every iteration
        int digit = inputX % 10;
        // reversed takes value of digit * 10 + last digit. Example: 1 then 21 then 121
        reversed = reversed * 10 + digit;
        // remove the last digit and assigning that value to inputX
        inputX = inputX/10;
        }
       
       
    // if x and reversed value (after loop) are same
    if (x == reversed){
       return true;
    } else {
      return false;
    }
}
}
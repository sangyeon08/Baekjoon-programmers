function solution(my_string) {
  return my_string.split(/\D/).reduce((a, b) => a + +b, 0);
}
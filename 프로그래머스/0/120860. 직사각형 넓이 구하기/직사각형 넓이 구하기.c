#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// dots_rows는 2차원 배열 dots의 행 길이, dots_cols는 2차원 배열 dots의 열 길이입니다.
int solution(int** dots, size_t dots_rows, size_t dots_cols) {
    int answer=0,a,b;
       for(int i=0;i<dots_rows;i++){
           for(int j=i;j<dots_rows;j++){
            
        if(dots[i][0]==dots[j][0]&&i!=j){
         b=(dots[i][1]-dots[j][1]);   
         
            if(b<0){
                b*=-1;
          }}
        if(dots[i][0]!=dots[j][0]){
         
            a=(dots[i][0]-dots[j][0]);   
         
            if(a<0){
              a*=-1;
          }}}}
       
       
    answer=a*b;
    
    return answer;
}
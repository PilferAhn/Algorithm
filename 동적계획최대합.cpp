#include <iostream>

using namespace std;

// 1. table 정의
// 2. 점화식

// table(i) = i번째 숫자를 오른쪽 끝으로 하는 연속 부분 최대합

// table(i) = max(table(i-1) + data(i),  <-- 이게 크냐
// table(i) = data(i)); << -- 이게 크냐 
 
const int MAX = 100;
int table[MAX];
int data[MAX];
int n;

int main(){
  
  cin >> n;
  for(int i=0;i<n;i++) cin >> data[i];
  
  // table 의 0번째는 data의 0번째 
  table[0] = data[0];
  
  for(int i=1;i<n;i++){
    if(table[i-1] + data[i] > data[i]){
      table[i] = table[i-1] + data[i];
    }
    else table[i] = data[i];
  }
  
  int myMax = -12312312;
  
  for(int i=0;i<n;i++){
    if(table[i] > myMax)
      myMax = table[i];
  }
  
  cout << myMax;
  return 0;
}

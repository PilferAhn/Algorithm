// 인접행렬 구하기 
#include <iostream>
using namespace std;

const int MAX = 100;
int table[MAX][MAX];

bool isConnected(int table[MAX][MAX], int x, int y){
  
  if(table[x][y] == 1) return true;
  else return false;
  
  
}

void getAdj(int table[MAX][MAX], int n, int x){
  // adjacent ?? node
  // 인접해 있는.. ㅅㅂ 
  
  for(int i=1;i<=n;i++){
    if(table[x][i] == 1) cout << i;
  }
  
  cout << endl;
  
  
}

int main() {

  int n,m;
  table[MAX][MAX] = {0,};
  
  for(int i=0;i<m;i++){
    int a,b;
    
    cin >> a >> b;
    
    table[a][b] = 1;
    table[b][a] = 1;
  }

  cout << isConnected(table,1,2);
  cout << isConnected(table,1,5);
  cout << isConnected(table,3,5);
  
  getAdj(table,n, 2);

  return 0;
}
